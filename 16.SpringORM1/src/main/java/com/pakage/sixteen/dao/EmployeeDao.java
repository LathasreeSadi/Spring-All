package com.pakage.sixteen.dao;

import java.util.List;

import com.pakage.sixteen.EmployeeBean;

public interface EmployeeDao {
		public int saveEmployee(EmployeeBean EmployeeBean);
		public EmployeeBean viewEmployee(int id);
		public void updateEmployee(EmployeeBean EmployeeBean);
		public void deleteEmployee(int id);
		public List<EmployeeBean> EmployeeAll();
}
