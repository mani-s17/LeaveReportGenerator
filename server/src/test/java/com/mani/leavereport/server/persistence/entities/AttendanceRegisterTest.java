package com.mani.leavereport.server.persistence.entities;

import com.mani.leavereport.server.persistence.helper.AttendanceType;
import com.mani.leavereport.server.persistence.helper.HibernateUtilTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * <br/> User: Subramaniam S
 * <br/> Date: 19/3/14
 * <br/> Time: 4:17 PM
 */
public class AttendanceRegisterTest extends HibernateUtilTest
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
	public void testInsertAttendanceRegister() throws Exception
	{
		Employee emp = (Employee) session.get(Employee.class, 2);
		AttendanceRegister attendanceRegister = new AttendanceRegister();
		attendanceRegister.setEmployee(emp);
		attendanceRegister.setAtrYear(2014);
		attendanceRegister.setAtrMonth(1);
		attendanceRegister.setAtrDay1(AttendanceType.PRESENT.getType());

		session.save(attendanceRegister);
		session.getTransaction().commit();
	}
}
