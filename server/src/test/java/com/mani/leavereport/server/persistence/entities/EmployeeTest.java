package com.mani.leavereport.server.persistence.entities;

import java.util.List;

import com.mani.leavereport.server.persistence.helper.HibernateUtilTest;
import org.hibernate.exception.ConstraintViolationException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * <br/> User: Subramaniam S
 * <br/> Date: 18/3/14
 * <br/> Time: 1:22 PM
 */
public class EmployeeTest extends HibernateUtilTest
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
	public void testEmployeeGettersSetters() throws Exception
	{
		Employee mani = new Employee();
		String empId = "IB1908";
		String empName = "Subramaniam S";
		String deptName = "hgcp";

		// Setters
		mani.setEmpCode(empId);
		mani.setDeptName(deptName);
		mani.setEmpName(empName);

		// Getters
		Assert.assertEquals(empId, mani.getEmpCode());
		Assert.assertEquals(empName, mani.getEmpName());
		Assert.assertEquals(deptName, mani.getDeptName());
	}

	@Test
	public void testInsertUpdateEmployee() throws Exception
	{
		List list = session.createQuery("from Employee where empCode ='IB1908'").list();
		Employee mani = list.size() > 0 ? (Employee) list.get(0) : null;
		if( mani == null )
		{
			mani = new Employee();
			mani.setEmpCode("IB1908");
			mani.setEmpName("Mani S");
			mani.setDeptName("hGCP");
		}

		list = session.createQuery("from Employee where empCode ='IB1577'").list();
		Employee siddu = list.size() > 0 ? (Employee) list.get(0) : null;
		if(siddu == null)
		{
			siddu = new Employee();
			siddu.setEmpCode("IB1577");
			siddu.setEmpName("Siddu");
			siddu.setDeptName("itssi");
		}

		session.saveOrUpdate(mani);
		session.saveOrUpdate(siddu);
		session.getTransaction().commit();

		Assert.assertEquals(true, session.contains(mani));
		Assert.assertEquals(true, session.contains(siddu));
		Assert.assertEquals(true, session.createQuery("from Employee").list().size() > 0);
	}

	@Test(expected = ConstraintViolationException.class)
	public void testAddDuplicateEmployee() throws Exception
	{
		Employee e1 = new Employee();
		e1.setEmpCode("IB1908");
		e1.setEmpName("Bob");
		e1.setDeptName("IT");

		session.save(e1);
		session.getTransaction().commit();
	}
}
