package com.mani.leavereport.server.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * <br/> User: Subramaniam S
 * <br/> Date: 18/3/14
 * <br/> Time: 4:19 PM
 */
@Entity
@Table(name = "PENDING_LEAVE")
public class PendingLeave
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pel_id", nullable = false)
	private Integer pelId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_id")
	private Employee employee;

	@Column(name = "pel_type")
	private String pelType;

	@Column(name = "pel_from_dttm" )
	private Date pelFromDttm;

	@Column(name = "pel_to_dttm")
	private Date pelToDttm;

	public Integer getAplId()
	{
		return pelId;
	}

	public Employee getEmployee()
	{
		return employee;
	}

	public void setEmployee(Employee employee)
	{
		this.employee = employee;
	}

	public String getPelType()
	{
		return pelType;
	}

	public void setPelType(String pelType)
	{
		this.pelType = pelType;
	}

	public Date getPelFromDttm()
	{
		return pelFromDttm;
	}

	public void setPelFromDttm(Date pelFromDttm)
	{
		this.pelFromDttm = pelFromDttm;
	}

	public Date getPelToDttm()
	{
		return pelToDttm;
	}

	public void setPelToDttm(Date pelToDttm)
	{
		this.pelToDttm = pelToDttm;
	}
}
