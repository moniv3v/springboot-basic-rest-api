package com.tw.apistackbase.Service;

import com.tw.apistackbase.Object.Company;
import com.tw.apistackbase.Object.Employee;

import java.util.*;

public class CompanyService {
    List<Company> companyList = new ArrayList<Company>();
    List<Employee> employeeList;
//    companyList.add(new Company("alibaba",200,employeeList));

    public List<Company> getAllCompany(){
        return companyList;
    }
}
