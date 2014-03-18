package com.mani.leavereport.server.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * <br/> User: Subramaniam S
 * <br/> Date: 17/3/14
 * <br/> Time: 2:53 PM
 */
@Entity
@Table(name = "EMPLOYEE")
public class Employee implements Serializable
{
	private static final long serialVersionUID = -5566941918931192141L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;

	@Column(name = "emp_id", unique = true, nullable = false)
	private String empId;

	@Column(name = "emp_name", unique = false, nullable = false)
	private String empName;

	@Column(name = "dept_name", unique = false, nullable = true)
	private String deptName;

	public Integer getId()
	{
		return id;
	}

	public String getEmpId()
	{
		return empId;
	}

	public void setEmpId(String empId)
	{
		this.empId = empId;
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
