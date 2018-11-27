package com.tw.apistackbase.Service;

import com.tw.apistackbase.Object.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeService {
    static Map<Integer, Employee> employeeData = new HashMap<>();

    {
        employeeData.put(0, new Employee(0, "Xiaoming", 20, "Male",5000));
        employeeData.put(1, new Employee(1, "Xiaohong", 19, "Female",5000));
        employeeData.put(2, new Employee(2, "Xiaozhi", 15, "Male",5000));
        employeeData.put(3, new Employee(3, "Xiaogang", 16, "Male",5000));
        employeeData.put(4, new Employee(4, "Xiaoxia", 15, "Female",5000));
    }

    public List<Employee> getAllEmployee() {
        return new ArrayList<Employee>(employeeData.values());
    }

    public List<Employee> addEmployee(Employee employee) {
        employeeData.put(employee.getId(),employee);
        return new ArrayList<Employee>(employeeData.values());
    }

    public List<Employee> updateEmployee(Employee employee) {
        Employee targetEmployee = findEmployee(employee);
        if(targetEmployee!=null){
            employeeData.replace(targetEmployee.getId(),employee);
        }
        return new ArrayList<Employee>(employeeData.values());
    }

    private Employee findEmployee(Employee employee) {
        Employee targetEmployee;
        for(Map.Entry<Integer, Employee> data : employeeData.entrySet()) {
            if(data.getKey().equals(employee.getId())) {
                targetEmployee = data.getValue();
                return targetEmployee;
            }
        }
        return null;
    }

    public List<Employee> deleteEmployee(Employee employee) {
        Employee targetEmployee = findEmployee(employee);
        if(targetEmployee!=null){
            employeeData.remove(employee.getId());
        }
        return new ArrayList<Employee>(employeeData.values());
    }
}
