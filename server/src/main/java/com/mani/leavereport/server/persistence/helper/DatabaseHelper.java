package com.mani.leavereport.server.persistence.helper;

import java.util.List;

import com.mani.leavereport.server.persistence.entities.AppliedLeave;
import com.mani.leavereport.server.persistence.entities.AttendanceRegister;
import com.mani.leavereport.server.persistence.entities.Employee;
import com.mani.leavereport.server.persistence.exceptions.EntityNotFoundForModelException;
import com.mani.leavereport.server.persistence.model.AppliedLeaveModel;
import com.mani.leavereport.server.persistence.model.AttendanceRegisterModel;
import com.mani.leavereport.server.persistence.model.EmployeeModel;
import com.mani.leavereport.server.persistence.model.Model;
import org.hibernate.Query;
import org.hibernate.classic.Session;

/**
 * Created with IntelliJ IDEA.
 * <br/> User: Subramaniam S
 * <br/> Date: 19/3/14
 * <br/> Time: 4:46 PM
 */
public class DatabaseHelper
{
	private static Session session = HibernateUtil.getSessionFactory().openSession();

	/**
	 * Method to Save or Update the Bean object into Table
	 * */
	public static void saveOrUpdate(Model model) throws EntityNotFoundForModelException
	{
		Object entity = convertModelToEntity(model);
		session.beginTransaction();
		session.saveOrUpdate(entity);
		session.getTransaction().commit();
		session.flush();
	}

	/**
	 * Method for Converting Bean object to Entity Object
	 * */
	public static Object convertModelToEntity(Model model) throws EntityNotFoundForModelException
	{
		if(model instanceof EmployeeModel)
			return convertModelToEntity((EmployeeModel) model);
		else if(model instanceof AppliedLeaveModel)
			return convertModelToEntity((AppliedLeaveModel) model);
		else if(model instanceof AttendanceRegisterModel)
			return convertModelToEntity((AttendanceRegisterModel) model);
		else
			throw new EntityNotFoundForModelException("Not able to convert Model to entity");
	}

	private static Object convertModelToEntity(AttendanceRegisterModel model)
	{
		String hql = "from AttendanceRegister atr where atr.employee.empCode=? and atr.atrYear =? and atr.atrMonth = ?";
		Query query = session.createQuery(hql);
		query.setParameter(0, model.getEmployee().getEmpCode());
		query.setParameter(1, model.getAtrYear());
		query.setParameter(2, model.getAtrMonth());
		List list = query.list();

		AttendanceRegister entity = list.size() > 0 ? (AttendanceRegister) list.get(0) : new AttendanceRegister();
		entity.setEmployee((Employee) convertModelToEntity(model.getEmployee()));
		entity.setAtrYear(model.getAtrYear());
		entity.setAtrMonth(model.getAtrMonth());
		entity.setAtrDay1(model.getAtrDay1());
		entity.setAtrDay2(model.getAtrDay2());
		entity.setAtrDay3(model.getAtrDay3());
		entity.setAtrDay4(model.getAtrDay4());
		entity.setAtrDay5(model.getAtrDay5());
		entity.setAtrDay6(model.getAtrDay6());
		entity.setAtrDay7(model.getAtrDay7());
		entity.setAtrDay8(model.getAtrDay8());
		entity.setAtrDay9(model.getAtrDay9());
		entity.setAtrDay10(model.getAtrDay10());
		entity.setAtrDay11(model.getAtrDay11());
		entity.setAtrDay12(model.getAtrDay12());
		entity.setAtrDay13(model.getAtrDay13());
		entity.setAtrDay14(model.getAtrDay14());
		entity.setAtrDay15(model.getAtrDay15());
		entity.setAtrDay16(model.getAtrDay16());
		entity.setAtrDay17(model.getAtrDay17());
		entity.setAtrDay18(model.getAtrDay18());
		entity.setAtrDay19(model.getAtrDay19());
		entity.setAtrDay20(model.getAtrDay20());
		entity.setAtrDay21(model.getAtrDay21());
		entity.setAtrDay22(model.getAtrDay22());
		entity.setAtrDay23(model.getAtrDay23());
		entity.setAtrDay24(model.getAtrDay24());
		entity.setAtrDay25(model.getAtrDay25());
		entity.setAtrDay26(model.getAtrDay26());
		entity.setAtrDay27(model.getAtrDay27());
		entity.setAtrDay28(model.getAtrDay28());
		entity.setAtrDay29(model.getAtrDay29());
		entity.setAtrDay30(model.getAtrDay30());
		entity.setAtrDay31(model.getAtrDay31());
		return entity;
	}

	private static Object convertModelToEntity(AppliedLeaveModel model)
	{
		String hql = "from AppliedLeave apl where apl.employee.empCode=? and apl.aplFromDttm =? and apl.aplToDttm =? and apl.aplIsApproved =? and apl.aplType=?";
		Query query = session.createQuery(hql);
		query.setParameter(0, model.getEmployee().getEmpCode());
		query.setParameter(1, model.getAplFromDttm());
		query.setParameter(2, model.getAplToDttm());
		query.setParameter(3, model.getAplIsApproved());
		query.setParameter(4, model.getAplType());
		List list = query.list();

		AppliedLeave entity = list.size() > 0 ? (AppliedLeave) list.get(0) : new AppliedLeave();
		entity.setEmployee((Employee) convertModelToEntity(model.getEmployee()));
		entity.setAplIsApproved(model.getAplIsApproved());
		entity.setAplFromDttm(model.getAplFromDttm());
		entity.setAplToDttm(model.getAplToDttm());
		entity.setAplType(model.getAplType());
		return entity;
	}

	private static Object convertModelToEntity(EmployeeModel model)
	{
		String hql = "from Employee emp where emp.empCode =?";
		Query query = session.createQuery(hql);
		query.setParameter(0, model.getEmpCode());
		List list = query.list();

		Employee entity = list.size() > 0 ? (Employee) list.get(0) : new Employee();
		entity.setEmpCode(model.getEmpCode());
		entity.setEmpName(model.getEmpName());
		entity.setDeptName(model.getDeptName());
		return entity;
	}
}
