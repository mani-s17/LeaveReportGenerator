package com.mani.leavereport.server.persistence.entities;

import java.util.Date;

import com.mani.leavereport.server.persistence.helper.AttendanceType;
import com.mani.leavereport.server.persistence.helper.HibernateUtilTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * <br/> User: Subramaniam S
 * <br/> Date: 18/3/14
 * <br/> Time: 4:34 PM
 */
public class AppliedLeaveTest extends HibernateUtilTest
{
	@Before
	public void setUp() throws Exception
	{
		super.setUp();
	}

	@After
	public void tearDown() throws Exception
	{
		super.tearDown();
	}

	@Test
	public void testApprovedLeaveGetterSetter()
	{
		Employee emp = (Employee) session.get(Employee.class, 1);
		String type = AttendanceType.ABSENT.getType();
		Date aplFromDttm = new Date(System.currentTimeMillis() - (3 * 24 * 60 * 60 * 1000L));
		Date aplToDttm = new Date(System.currentTimeMillis() - (2 * 24 * 60 * 60 * 1000L));
		Boolean aplIsApproved = true;

		AppliedLeave appliedLeave = new AppliedLeave();
		appliedLeave.setEmployee(emp);
		appliedLeave.setAplType(type);
		appliedLeave.setAplFromDttm(aplFromDttm);
		appliedLeave.setAplToDttm(aplToDttm);
		Assert.assertEquals(false, appliedLeave.getAplIsApproved());
		appliedLeave.setAplIsApproved(aplIsApproved);

		Assert.assertEquals(emp, appliedLeave.getEmployee());
		Assert.assertEquals(type, appliedLeave.getAplType());
		Assert.assertEquals(aplIsApproved, appliedLeave.getAplIsApproved());
	}

	@Test
	public void testInsertApprovedLeave() throws Exception
	{
		Employee emp = (Employee) session.get(Employee.class, 2);
		AppliedLeave appliedLeave = new AppliedLeave();
		appliedLeave.setEmployee(emp);
		appliedLeave.setAplType(AttendanceType.LOSS_OF_PAY.getType());
		appliedLeave.setAplFromDttm(new Date(System.currentTimeMillis() - (3 * 24 * 60 * 60 * 1000L)));
		appliedLeave.setAplToDttm(new Date(System.currentTimeMillis() - (2 * 24 * 60 * 60 * 1000L)));

		session.save(appliedLeave);
		session.getTransaction().commit();
		Assert.assertEquals(true, session.createQuery("from AppliedLeave").list().size() > 0);
	}
}
