package com.mani.leavereport.server.persistence.exceptions;

/**
 * Created with IntelliJ IDEA.
 * <br/> User: Subramaniam S
 * <br/> Date: 19/3/14
 * <br/> Time: 5:29 PM
 */
public class EntityNotFoundForModelException extends Exception
{
	private static final long serialVersionUID = -1389844047343063771L;

	public EntityNotFoundForModelException()
	{
		super();
	}

	public EntityNotFoundForModelException(String message)
	{
		super(message);
	}

	public EntityNotFoundForModelException(String message, Throwable cause)
	{
		super(message, cause);
	}
}
