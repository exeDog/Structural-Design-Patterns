package com.priyank.spring.adapter;

public class EmployeeCSVAdapter implements Employee {
    private EmployeeCSV instance;

    public EmployeeCSVAdapter(EmployeeCSV employeeCSV) {
        this.instance = employeeCSV;
    }

    @Override
    public String getId() {
        return Integer.toString(this.instance.getId());
    }

    @Override
    public String getFirstName() {
        return this.instance.getFirstName();
    }

    @Override
    public String getLastName() {
        return this.instance.getLastName();
    }

    @Override
    public String getEmail() {
        return this.instance.getEmail();
    }
}
