package com.pakage.sixteen.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;
import com.pakage.sixteen.EmployeeBean;

public class EmployeeDaoImp implements EmployeeDao{
	private HibernateTemplate hibernateTemplate;
	public EmployeeDaoImp() {
		super();
	}
	public EmployeeDaoImp(HibernateTemplate hiberanateTemplate) {
		super();
		this.hibernateTemplate=hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate=hibernateTemplate;
	}
	public HibernateTemplate getHibernateTemplate() {
		return this.hibernateTemplate;
	}

	@Override
	@Transactional
	public int saveEmployee(EmployeeBean EmployeeBean) {
		int savedetails=(int) hibernateTemplate.save(EmployeeBean);
		return savedetails;
	}

	@Override
	@Transactional
	public EmployeeBean viewEmployee(int id) {
		EmployeeBean emp=hibernateTemplate.get(EmployeeBean.class,id);
		return emp;
	}

	@Override
	@Transactional
	public void updateEmployee(EmployeeBean EmployeeBean) {
		hibernateTemplate.update(EmployeeBean);
	}

	@Override
	@Transactional
	public void deleteEmployee(int id) {
		EmployeeBean employee=hibernateTemplate.get(EmployeeBean.class,id);
		if(employee!=null)
		{
			hibernateTemplate.delete(employee);
		}
	}

	@Override
	@Transactional
	public List<EmployeeBean> EmployeeAll() {
		List<EmployeeBean>emp=hibernateTemplate.loadAll(EmployeeBean.class);
		return emp;
	}

}
