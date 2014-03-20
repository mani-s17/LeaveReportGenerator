package com.mani.leavereport.server.persistence.model;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * <br/> User: Subramaniam S
 * <br/> Date: 18/3/14
 * <br/> Time: 4:19 PM
 */
public class AppliedLeaveModel implements Model
{
	private EmployeeModel employee;
	private String aplType;
	private Date aplFromDttm;
	private Date aplToDttm;
	private Boolean aplIsApproved = false;

	public EmployeeModel getEmployee()
	{
		return employee;
	}

	public void setEmployee(EmployeeModel employee)
	{
		this.employee = employee;
	}

	public String getAplType()
	{
		return aplType;
	}

	public void setAplType(String aplType)
	{
		this.aplType = aplType;
	}

	public Date getAplFromDttm()
	{
		return aplFromDttm;
	}

	public void setAplFromDttm(Date aplFromDttm)
	{
		this.aplFromDttm = aplFromDttm;
	}

	public Date getAplToDttm()
	{
		return aplToDttm;
	}

	public void setAplToDttm(Date aplToDttm)
	{
		this.aplToDttm = aplToDttm;
	}

	public Boolean getAplIsApproved()
	{
		return aplIsApproved;
	}

	public void setAplIsApproved(Boolean aplIsApproved)
	{
		this.aplIsApproved = aplIsApproved;
	}
}
