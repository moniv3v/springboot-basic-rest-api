package com.tw.apistackbase.Object;

import java.util.List;

public class Company {
    String companyName;
    Integer employeeName;
    List<Employee> employeeList;

    public Company(String companyName, Integer employeeName,List<Employee> employeeList){
        this.companyName = companyName;
        this.employeeName = employeeName;
        this.employeeList = employeeList;
    }
}
