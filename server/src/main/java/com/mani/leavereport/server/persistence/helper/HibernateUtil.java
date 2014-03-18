package com.mani.leavereport.server.persistence.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Created with IntelliJ IDEA.
 * <br/> User: Subramaniam S
 * <br/> Date: 17/3/14
 * <br/> Time: 12:56 PM
 */
public class HibernateUtil
{
	private static volatile SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory()
	{
		try
		{
			// Creating Hibernate Session Factory as Thread safe singleton object
			if (sessionFactory == null)
			{
				synchronized (HibernateUtil.class)
				{
					if (sessionFactory == null)
						sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
				}
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return sessionFactory;
	}

	public static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}
}
