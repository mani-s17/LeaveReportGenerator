package com.mani.leavereport.server;

import com.mani.leavereport.server.persistence.entities.ApprovedLeaveTest;
import com.mani.leavereport.server.persistence.entities.EmployeeTest;
import com.mani.leavereport.server.persistence.entities.PendingLeaveTest;
import com.mani.leavereport.server.persistence.helper.HibernateUtilTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created with IntelliJ IDEA.
 * <br/> User: Subramaniam S
 * <br/> Date: 18/3/14
 * <br/> Time: 12:29 PM
 */
@RunWith(Suite.class)
@Suite.SuiteClasses(
		{
				HibernateUtilTest.class,

				EmployeeTest.class,
				ApprovedLeaveTest.class,
				PendingLeaveTest.class
		}
)
public class TestSuite
{
}
