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
public class PendingLeaveTest extends HibernateUtilTest
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
		Date pelFromDttm = new Date(System.currentTimeMillis() - (3 * 24 * 60 * 60 * 1000L));
		Date pelToDttm = new Date(System.currentTimeMillis() - (2 * 24 * 60 * 60 * 1000L));

		PendingLeave pendingLeave = new PendingLeave();
		pendingLeave.setEmployee(emp);
		pendingLeave.setPelType(type);
		pendingLeave.setPelFromDttm(pelFromDttm);
		pendingLeave.setPelToDttm(pelToDttm);

		Assert.assertEquals(emp, pendingLeave.getEmployee());
		Assert.assertEquals(type, pendingLeave.getPelType());
		Assert.assertEquals(pelFromDttm, pendingLeave.getPelFromDttm());
		Assert.assertEquals(pelToDttm, pendingLeave.getPelToDttm());
	}

	@Test
	public void testInsertPendingLeave() throws Exception
	{
		Employee emp = (Employee) session.get(Employee.class, 2);
		PendingLeave pendingLeave = new PendingLeave();
		pendingLeave.setEmployee(emp);
		pendingLeave.setPelType(LeaveType.LOSS_OF_PAY.getType());
		pendingLeave.setPelFromDttm(new Date(System.currentTimeMillis() - (3 * 24 * 60 * 60 * 1000L)));
		pendingLeave.setPelToDttm(new Date(System.currentTimeMillis() - (2 * 24 * 60 * 60 * 1000L)));

		session.save(pendingLeave);
		session.getTransaction().commit();
		Assert.assertEquals(true, session.createQuery("from PendingLeave").list().size() > 0);
	}
}
