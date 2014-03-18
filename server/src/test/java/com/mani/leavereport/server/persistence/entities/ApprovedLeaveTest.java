package com.mani.leavereport.server.persistence.entities;

import java.util.Date;

import com.mani.leavereport.server.persistence.helper.HibernateUtilTest;
import com.mani.leavereport.server.persistence.helper.LeaveType;
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
public class ApprovedLeaveTest extends HibernateUtilTest
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
		String type = LeaveType.ABSENT.getType();

		ApprovedLeave approvedLeave = new ApprovedLeave();
		approvedLeave.setEmployee(emp);
		approvedLeave.setAplType(type);

		Assert.assertEquals(emp, approvedLeave.getEmployee());
		Assert.assertEquals(type, approvedLeave.getAplType());
	}

	@Test
	public void testInsertApprovedLeave() throws Exception
	{
		Employee emp = (Employee) session.get(Employee.class, 2);
		ApprovedLeave approvedLeave = new ApprovedLeave();
		approvedLeave.setEmployee(emp);
		approvedLeave.setAplType(LeaveType.LOSS_OF_PAY.getType());
		approvedLeave.setAplFromDttm(new Date(System.currentTimeMillis() - (3 * 24 * 60 * 60 * 1000L)));
		approvedLeave.setAplToDttm(new Date(System.currentTimeMillis() - (2 * 24 * 60 * 60 * 1000L)));

		session.save(approvedLeave);
		session.getTransaction().commit();
		Assert.assertEquals(true, session.createQuery("from ApprovedLeave").list().size() > 0);
	}
}
