package com.pakage.fourteen;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class Employee {
	 private int empid;
	 private String empname;
	 private double empsalary;
	 private int deptno;
	 private JdbcTemplate jdbctemplate;
	 public Employee() {
		 super();
	 }
	 public Employee(int empid, String empname, double empsalary, int deptno, JdbcTemplate jdbctemplate) {
		 super();
		 this.empid=empid;
		 this.empname=empname;
		 this.empsalary=empsalary;
		 this.deptno=deptno;
		 this.jdbctemplate=jdbctemplate;
	 }
	 public void setEmpid(int empid) {
		 this.empid=empid;
	 }
	 public int getEmpid() {
		 return this.empid;
	 }
	 public void setEmpname(String empname) {
		 this.empname=empname;
	 }
	 public String getEmpname() {
		 return this.empname;
	 }
	 public void setEmpsalary(double empsalary) {
		 this.empsalary=empsalary;
	 }
	 public double getEmpsalary() {
		 return this.empsalary;
	 }
	 public void setDeptno(int deptno) {
		 this.deptno=deptno;
	 }
	 public int getDeptno() {
		 return this.deptno;
	 }
	 public void setJdbcTemplate(JdbcTemplate jdbctemplate) {
		 this.jdbctemplate=jdbctemplate;
	 }
	 public JdbcTemplate getJdbcTemplate() {
		 return this.jdbctemplate;
	 }
	 public void create()
	 {
		 jdbctemplate.execute("Create table Employee(empid int, empname varchar(20), empsalary number(10,2), deptno int)");
		 System.out.println("Table Created");
	 }
	 public void insert()
	 {
			
			  int insert=jdbctemplate.
			  update("insert into Employee values(101, 'Namjoon', 80000,3)"); int
			  insert2=jdbctemplate.
			  update("insert into Employee values(102, 'Jin', 75000,3)"); int
			  insert3=jdbctemplate.
			  update("insert into Employee values(103, 'Yoongi', 73000,3)"); int
			  insert4=jdbctemplate.
			  update("insert into Employee values(104, 'Jhope', 74000,3)"); int
			  insert5=jdbctemplate.
			  update("insert into Employee values(105, 'Jimin', 88000,3)"); int
			  insert6=jdbctemplate.
			  update("insert into Employee values(106, 'Teahyung', 90000,3)"); int
			  insert7=jdbctemplate.
			  update("insert into Employee values(107, 'Jungkook', 95000,3)");
		 int insert8=jdbctemplate.update("insert into Employee values(108, 'Teahyung', 85000,3)");
		 System.out.println(insert+ "row inserted..");
	 }
	 public void delete()
	 {
		 int delete=jdbctemplate.update("delete from Employee where empid='108'");
		 System.out.println(delete + "row deleted..");
	 }
	 public void updateRecord()
	 {
		 int updateRecord=jdbctemplate.update("update Employee set empname='Hoseok' where empid='104'");
		 System.out.println(updateRecord+ "row Updated..");
	 }
	 public void getRecord()
	 {
		 List<Map<String,Object>>oneRecord=jdbctemplate.queryForList("select * from Employee where empid='107'");
		 Iterator it= oneRecord.iterator();
		 while (it.hasNext())
		 {
			 Object obj=it.next();
			 System.out.println(obj.toString());
		 }
	 }
	 public void getAllRecords()
	 {
		 List<Map<String,Object>>AllRecords=jdbctemplate.queryForList("select * from Employee");
		 Iterator it= AllRecords.iterator();
		 while (it.hasNext())
		 {
			 Object obj=it.next();
			 System.out.println(obj.toString());
		 }
	 }
}




