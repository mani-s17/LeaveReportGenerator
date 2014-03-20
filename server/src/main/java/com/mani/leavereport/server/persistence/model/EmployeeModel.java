package com.mani.leavereport.server.persistence.model;

/**
 * Created with IntelliJ IDEA.
 * <br/> User: Subramaniam S
 * <br/> Date: 17/3/14
 * <br/> Time: 2:53 PM
 */
public class EmployeeModel implements Model
{
	private String empCode;
	private String empName;
	private String deptName;

	public String getEmpCode()
	{
		return empCode;
	}

	public void setEmpCode(String empCode)
	{
		this.empCode = empCode;
	}

	public String getEmpName()
	{
		return empName;
	}

	public void setEmpName(String empName)
	{
		this.empName = empName;
	}

	public String getDeptName()
	{
		return deptName;
	}

	public void setDeptName(String deptName)
	{
		this.deptName = deptName;
	}
}
