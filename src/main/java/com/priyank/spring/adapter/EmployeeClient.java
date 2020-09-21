package com.priyank.spring.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<Employee>();
        Employee employeeFromDb = new EmployeeDB("1234", "John", "Wick", "johnwick@gmail.com");
        employees.add(employeeFromDb);
        Employee employeeFromLDAP = new EmployeeLDAPAdapter(new EmployeeLDAP("chewie", "Solo", "Han", "han@soloc.com"));
        employees.add(employeeFromLDAP);
        Employee employeeFromCSV = new EmployeeCSVAdapter(new EmployeeCSV("12345,Priyank,Rege,priyankrege@gmail.com"));
        employees.add(employeeFromCSV);
        return employees;
    }
}
