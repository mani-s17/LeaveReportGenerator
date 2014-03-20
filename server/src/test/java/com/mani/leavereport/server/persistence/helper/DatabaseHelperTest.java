package com.mani.leavereport.server.persistence.helper;

import java.util.Date;

import com.mani.leavereport.server.persistence.entities.Employee;
import com.mani.leavereport.server.persistence.model.AppliedLeaveModel;
import com.mani.leavereport.server.persistence.model.AttendanceRegisterModel;
import com.mani.leavereport.server.persistence.model.EmployeeModel;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * <br/> User: Subramaniam S
 * <br/> Date: 19/3/14
 * <br/> Time: 7:07 PM
 */
public class DatabaseHelperTest
{
	@Test
	public void testSaveOrUpdate() throws Exception
	{
		EmployeeModel employeeModel = new EmployeeModel();
		employeeModel.setEmpCode("IB1909");
		employeeModel.setEmpName("Sarath");
		employeeModel.setDeptName("Dev");

		Date aplFromDttm = new Date(System.currentTimeMillis() - (3 * 24 * 60 * 60 * 1000L));
		Date aplToDttm = new Date(System.currentTimeMillis() - (2 * 24 * 60 * 60 * 1000L));
		AppliedLeaveModel appliedLeaveModel = new AppliedLeaveModel();
		appliedLeaveModel.setEmployee(employeeModel);
		appliedLeaveModel.setAplType(AttendanceType.HOLIDAY.getType());
		appliedLeaveModel.setAplFromDttm(aplFromDttm);
		appliedLeaveModel.setAplToDttm(aplToDttm);
		appliedLeaveModel.setAplIsApproved(true);

		AttendanceRegisterModel attendanceRegisterModel = new AttendanceRegisterModel();
		attendanceRegisterModel.setEmployee(employeeModel);
		attendanceRegisterModel.setAtrYear(2014);
		attendanceRegisterModel.setAtrMonth(2);
		attendanceRegisterModel.setAtrDay10(AttendanceType.PRESENT.getType());

		DatabaseHelper.saveOrUpdate(employeeModel);
		DatabaseHelper.saveOrUpdate(appliedLeaveModel);
		DatabaseHelper.saveOrUpdate(attendanceRegisterModel);
	}

	@Test
	public void testConvertEmployeeModelToEntity() throws Exception
	{
		EmployeeModel model = new EmployeeModel();
		model.setEmpCode("IB1909");
		model.setEmpName("Sarath");
		model.setDeptName("Dev");

		Employee entity = (Employee) DatabaseHelper.convertModelToEntity(model);
		Assert.assertEquals(entity.getEmpCode(), model.getEmpCode());
		Assert.assertEquals(entity.getEmpName(), model.getEmpName());
		Assert.assertEquals(entity.getDeptName(), model.getDeptName());
	}
}
