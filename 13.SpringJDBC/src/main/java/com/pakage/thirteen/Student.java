package com.pakage.thirteen;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class Student {
		private JdbcTemplate jdbctemplate;
		public Student()
		{
			super();
		}
		public Student(JdbcTemplate jdbctemplate)
		{
			super();
			this.jdbctemplate=jdbctemplate;
		}
		public void setJdbcTemplate(JdbcTemplate jdbctemplate) {
			this.jdbctemplate=jdbctemplate;
		}
		public JdbcTemplate getJdbcTemplate() 
		{
			return this.jdbctemplate;
		}
		  public void create()
		  {
		    jdbctemplate. execute("CREATE TABLE Student (id INT, name VARCHAR(20), course VARCHAR(20))");
		    System.out.println("Table Created"); 
		  }
		public void insert()
		{
			int insert=jdbctemplate.update("insert into Student values(109,'Latha','Java Full Stack')");
			int insert1=jdbctemplate.update("insert into Student values(102,'Teja','Java Full Stack')");
			int insert2=jdbctemplate.update("insert into Student values(103,'Anitha','Java Full Stack')");
			int insert3=jdbctemplate.update("insert into Student values(104,'Sruthi','Java Full Stack')");
			System.out.println(insert+"row inserted");
		}
		public void delete()
		{
			int delete=jdbctemplate.update("delete from Student where id='109'");
			System.out.println(delete+"row deleted");
		}
		public void updateRecord() 
		{
			int updateRecord=jdbctemplate.update("update Student set name='Pathirana' where id='101'");
			int updateRecord1=jdbctemplate.update("update Student set name='Ishan' where id='102'");
			int updateRecord2=jdbctemplate.update("update Student set name='Gill' where id='103'");
			int updateRecord3=jdbctemplate.update("update Student set name='Siraj' where id='104'");
			System.out.println(updateRecord+"row Updated");
		}
		public void getRecord()
		{
			List<Map<String,Object>>oneRecord=jdbctemplate.queryForList("select * from Student where id='101'");
			Iterator it= oneRecord.iterator();
			while(it.hasNext()) {
				Object obj=it.next();
				System.out.println(obj.toString());
			}
		}		
		public void getAllRecords()
		{
			List<Map<String,Object>>AllRecords=jdbctemplate.queryForList("select * from Student");
			Iterator it= AllRecords.iterator();
			while(it.hasNext()) {
				Object obj=it.next();
				System.out.println(obj.toString());
			}
		}		
}
