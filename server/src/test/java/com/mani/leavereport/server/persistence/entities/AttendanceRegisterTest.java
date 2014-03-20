package com.mani.leavereport.server.persistence.entities;

import java.util.List;

import com.mani.leavereport.server.persistence.helper.AttendanceType;
import com.mani.leavereport.server.persistence.helper.HibernateUtilTest;
import org.hibernate.Query;
import org.hibernate.exception.ConstraintViolationException;
import org.junit.After;
import org.junit.Assert;
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
		String hql = "from AttendanceRegister atr where atr.employee.empCode=? and atr.atrYear =? and atr.atrMonth = ?";
		Query query = session.createQuery(hql);
		query.setParameter(0, emp.getEmpCode());
		query.setParameter(1, 2014);
		query.setParameter(2, 2);
		List list = query.list();

		AttendanceRegister entity = list.size() > 0 ? (AttendanceRegister) list.get(0) : new AttendanceRegister();
		entity.setEmployee(emp);
		entity.setAtrYear(2014);
		entity.setAtrMonth(2);
		entity.setAtrDay1(AttendanceType.PRESENT.getType());

		try
		{
			session.saveOrUpdate(entity);
			//session.getTransaction().commit();
		}
		catch (ConstraintViolationException exception)
		{
			Assert.fail(exception.getMessage());
		}
	}
}
