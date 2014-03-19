package com.mani.leavereport.server.persistence.helper;

/**
 * Created with IntelliJ IDEA.
 * <br/> User: Subramaniam S
 * <br/> Date: 18/3/14
 * <br/> Time: 4:49 PM
 */
public enum AttendanceType
{
	PRESENT("1.0"),
	PAID_LEAVE("pl"),
	PATERNITY_LEAVE("PT"),
	MEDICAL_LEAVE("ML"),
	LOSS_OF_PAY("lop"),
	ABSENT("AB"),
	HALF_DAY("0.5"),
	COMPENSATORY_OFF("CO"),
	RESTRICTED_HOLIDAY("RH"),
	ON_DUTY("OD"),
	COD("COD"),    // Get Clarify about COD. What it is???
	HOLIDAY("H");

	private String type;

	private AttendanceType(String type)
	{
		this.type = type;
	}

	public String getType()
	{
		return type;
	}
}
