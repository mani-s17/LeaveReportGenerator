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
@Table(name = "APPLIED_LEAVE")
public class AppliedLeave
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "apl_id", nullable = false)
	private Integer aplId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_id")
	private Employee employee;

	@Column(name = "apl_type")
	private String aplType;

	@Column(name = "apl_from_dttm" )
	private Date aplFromDttm;

	@Column(name = "apl_to_dttm")
	private Date aplToDttm;

	@Column(name = "apl_is_approved", nullable = false)
	private Boolean aplIsApproved = false;

	public Integer getAplId()
	{
		return aplId;
	}

	public Employee getEmployee()
	{
		return employee;
	}

	public void setEmployee(Employee employee)
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
