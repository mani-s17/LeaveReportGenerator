package com.mani.leavereport.server;

import com.mani.leavereport.server.persistence.entities.AppliedLeaveTest;
import com.mani.leavereport.server.persistence.entities.AttendanceRegister;
import com.mani.leavereport.server.persistence.entities.AttendanceRegisterTest;
import com.mani.leavereport.server.persistence.entities.EmployeeTest;
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
				AppliedLeaveTest.class,
				AttendanceRegisterTest.class
		}
)
public class TestSuite
{
}
