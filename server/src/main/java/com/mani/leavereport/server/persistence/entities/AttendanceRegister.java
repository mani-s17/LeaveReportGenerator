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
import javax.persistence.UniqueConstraint;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * <br/> User: Subramaniam S
 * <br/> Date: 19/3/14
 * <br/> Time: 3:59 PM
 */
@Entity
@Table(name = "ATTENDANCE_REGISTER", uniqueConstraints = @UniqueConstraint(columnNames={"emp_id", "atr_year", "atr_month"}))
public class AttendanceRegister implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "atr_id", nullable = false)
	private Integer atrId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_id")
	private Employee employee;

	@Column(name = "atr_year")
	private Integer atrYear;

	@Column(name = "atr_month")
	private Integer atrMonth;

	@Column(name = "atr_day_1")
	private String atrDay1;

	@Column(name = "atr_day_2")
	private String atrDay2;

	@Column(name = "atr_day_3")
	private String atrDay3;

	@Column(name = "atr_day_4")
	private String atrDay4;

	@Column(name = "atr_day_5")
	private String atrDay5;

	@Column(name = "atr_day_6")
	private String atrDay6;

	@Column(name = "atr_day_7")
	private String atrDay7;

	@Column(name = "atr_day_8")
	private String atrDay8;

	@Column(name = "atr_day_9")
	private String atrDay9;

	@Column(name = "atr_day_10")
	private String atrDay10;

	@Column(name = "atr_day_11")
	private String atrDay11;

	@Column(name = "atr_day_12")
	private String atrDay12;

	@Column(name = "atr_day_13")
	private String atrDay13;

	@Column(name = "atr_day_14")
	private String atrDay14;

	@Column(name = "atr_day_15")
	private String atrDay15;

	@Column(name = "atr_day_16")
	private String atrDay16;

	@Column(name = "atr_day_17")
	private String atrDay17;

	@Column(name = "atr_day_18")
	private String atrDay18;

	@Column(name = "atr_day_19")
	private String atrDay19;

	@Column(name = "atr_day_20")
	private String atrDay20;

	@Column(name = "atr_day_21")
	private String atrDay21;

	@Column(name = "atr_day_22")
	private String atrDay22;

	@Column(name = "atr_day_23")
	private String atrDay23;

	@Column(name = "atr_day_24")
	private String atrDay24;

	@Column(name = "atr_day_25")
	private String atrDay25;

	@Column(name = "atr_day_26")
	private String atrDay26;

	@Column(name = "atr_day_27")
	private String atrDay27;

	@Column(name = "atr_day_28")
	private String atrDay28;

	@Column(name = "atr_day_29")
	private String atrDay29;

	@Column(name = "atr_day_30")
	private String atrDay30;

	@Column(name = "atr_day_31")
	private String atrDay31;

	public Integer getAtrId()
	{
		return atrId;
	}

	public Employee getEmployee()
	{
		return employee;
	}

	public void setEmployee(Employee employee)
	{
		this.employee = employee;
	}

	public Integer getAtrYear()
	{
		return atrYear;
	}

	public void setAtrYear(Integer atrYear)
	{
		this.atrYear = atrYear;
	}

	public Integer getAtrMonth()
	{
		return atrMonth;
	}

	public void setAtrMonth(Integer atrMonth)
	{
		this.atrMonth = atrMonth;
	}

	public String getAtrDay1()
	{
		return atrDay1;
	}

	public void setAtrDay1(String atrDay1)
	{
		this.atrDay1 = atrDay1;
	}

	public String getAtrDay2()
	{
		return atrDay2;
	}

	public void setAtrDay2(String atrDay2)
	{
		this.atrDay2 = atrDay2;
	}

	public String getAtrDay3()
	{
		return atrDay3;
	}

	public void setAtrDay3(String atrDay3)
	{
		this.atrDay3 = atrDay3;
	}

	public String getAtrDay4()
	{
		return atrDay4;
	}

	public void setAtrDay4(String atrDay4)
	{
		this.atrDay4 = atrDay4;
	}

	public String getAtrDay5()
	{
		return atrDay5;
	}

	public void setAtrDay5(String atrDay5)
	{
		this.atrDay5 = atrDay5;
	}

	public String getAtrDay6()
	{
		return atrDay6;
	}

	public void setAtrDay6(String atrDay6)
	{
		this.atrDay6 = atrDay6;
	}

	public String getAtrDay7()
	{
		return atrDay7;
	}

	public void setAtrDay7(String atrDay7)
	{
		this.atrDay7 = atrDay7;
	}

	public String getAtrDay8()
	{
		return atrDay8;
	}

	public void setAtrDay8(String atrDay8)
	{
		this.atrDay8 = atrDay8;
	}

	public String getAtrDay9()
	{
		return atrDay9;
	}

	public void setAtrDay9(String atrDay9)
	{
		this.atrDay9 = atrDay9;
	}

	public String getAtrDay10()
	{
		return atrDay10;
	}

	public void setAtrDay10(String atrDay10)
	{
		this.atrDay10 = atrDay10;
	}

	public String getAtrDay11()
	{
		return atrDay11;
	}

	public void setAtrDay11(String atrDay11)
	{
		this.atrDay11 = atrDay11;
	}

	public String getAtrDay12()
	{
		return atrDay12;
	}

	public void setAtrDay12(String atrDay12)
	{
		this.atrDay12 = atrDay12;
	}

	public String getAtrDay13()
	{
		return atrDay13;
	}

	public void setAtrDay13(String atrDay13)
	{
		this.atrDay13 = atrDay13;
	}

	public String getAtrDay14()
	{
		return atrDay14;
	}

	public void setAtrDay14(String atrDay14)
	{
		this.atrDay14 = atrDay14;
	}

	public String getAtrDay15()
	{
		return atrDay15;
	}

	public void setAtrDay15(String atrDay15)
	{
		this.atrDay15 = atrDay15;
	}

	public String getAtrDay16()
	{
		return atrDay16;
	}

	public void setAtrDay16(String atrDay16)
	{
		this.atrDay16 = atrDay16;
	}

	public String getAtrDay17()
	{
		return atrDay17;
	}

	public void setAtrDay17(String atrDay17)
	{
		this.atrDay17 = atrDay17;
	}

	public String getAtrDay18()
	{
		return atrDay18;
	}

	public void setAtrDay18(String atrDay18)
	{
		this.atrDay18 = atrDay18;
	}

	public String getAtrDay19()
	{
		return atrDay19;
	}

	public void setAtrDay19(String atrDay19)
	{
		this.atrDay19 = atrDay19;
	}

	public String getAtrDay20()
	{
		return atrDay20;
	}

	public void setAtrDay20(String atrDay20)
	{
		this.atrDay20 = atrDay20;
	}

	public String getAtrDay21()
	{
		return atrDay21;
	}

	public void setAtrDay21(String atrDay21)
	{
		this.atrDay21 = atrDay21;
	}

	public String getAtrDay22()
	{
		return atrDay22;
	}

	public void setAtrDay22(String atrDay22)
	{
		this.atrDay22 = atrDay22;
	}

	public String getAtrDay23()
	{
		return atrDay23;
	}

	public void setAtrDay23(String atrDay23)
	{
		this.atrDay23 = atrDay23;
	}

	public String getAtrDay24()
	{
		return atrDay24;
	}

	public void setAtrDay24(String atrDay24)
	{
		this.atrDay24 = atrDay24;
	}

	public String getAtrDay25()
	{
		return atrDay25;
	}

	public void setAtrDay25(String atrDay25)
	{
		this.atrDay25 = atrDay25;
	}

	public String getAtrDay26()
	{
		return atrDay26;
	}

	public void setAtrDay26(String atrDay26)
	{
		this.atrDay26 = atrDay26;
	}

	public String getAtrDay27()
	{
		return atrDay27;
	}

	public void setAtrDay27(String atrDay27)
	{
		this.atrDay27 = atrDay27;
	}

	public String getAtrDay28()
	{
		return atrDay28;
	}

	public void setAtrDay28(String atrDay28)
	{
		this.atrDay28 = atrDay28;
	}

	public String getAtrDay29()
	{
		return atrDay29;
	}

	public void setAtrDay29(String atrDay29)
	{
		this.atrDay29 = atrDay29;
	}

	public String getAtrDay30()
	{
		return atrDay30;
	}

	public void setAtrDay30(String atrDay30)
	{
		this.atrDay30 = atrDay30;
	}

	public String getAtrDay31()
	{
		return atrDay31;
	}

	public void setAtrDay31(String atrDay31)
	{
		this.atrDay31 = atrDay31;
	}
}
