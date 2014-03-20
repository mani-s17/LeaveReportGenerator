package com.mani.leavereport.server.persistence.helper;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * <br/> User: Subramaniam S
 * <br/> Date: 17/3/14
 * <br/> Time: 1:00 PM
 */
public class HibernateUtilTest
{
	public Session session;

	@Before
	public void setUp() throws Exception
	{
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		session.beginTransaction();
	}

	@After
	public void tearDown() throws Exception
	{
		try
		{
			session.getTransaction().commit();
			session.flush();
		}
		catch (Exception e)
		{
			Assert.fail(e.getMessage());
		}
		finally
		{
			session.close();
		}
	}

	@Test
	public void testSessionConnectionStatus() throws Exception
	{
		Assert.assertEquals(true, session.isConnected());
	}
}
