package com.pakage.fifteen.SpringORM.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.pakage.fifteen.SpringORM.StudentBean;

public class StudentDaoImp implements StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	public StudentDaoImp() {
		super();
	}
	public StudentDaoImp(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate=hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate)
	{
		this.hibernateTemplate=hibernateTemplate;
	}
	public HibernateTemplate getHibernateTemplate() {
		return this.getHibernateTemplate();
	}

	@Override
	@Transactional

	
	  public int saveStudent(StudentBean StudentBean) { 
		int savedetails=(int) hibernateTemplate.save(StudentBean); 
	  return savedetails;
	}

	@Override
	@Transactional
	public StudentBean viewStudent(int id) {
		StudentBean std=hibernateTemplate.get(StudentBean.class,id);
		return std;
	}

	@Override
	@Transactional
	public void updateStudent(StudentBean StudentBean) {
		hibernateTemplate.update(StudentBean);
	}

	@Override
	@Transactional
	public void deleteStudent(int id) {
		  StudentBean student=hibernateTemplate.get(StudentBean.class,id);
		  if(student!=null)
		  { 
			  hibernateTemplate.delete(student);
		  }
		}
	@Override
	public List<StudentBean> StudentAll() {
		  List<StudentBean>st=hibernateTemplate.loadAll(StudentBean.class); 
		  return st;
		 
	}
	
}
