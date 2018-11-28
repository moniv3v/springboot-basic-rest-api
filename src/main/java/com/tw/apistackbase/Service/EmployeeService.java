package com.tw.apistackbase.Service;

import com.tw.apistackbase.Object.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
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

    public Employee updateEmployee(Integer id, Employee employee) {
        employee.setId(id);
        employeeData.put(id,employee);
        return employee;
    }

    private Employee findEmployee(Integer id) {
        Employee targetEmployee;
        for(Map.Entry<Integer, Employee> data : employeeData.entrySet()) {
            if(data.getKey().equals(id)) {
                targetEmployee = data.getValue();
                return targetEmployee;
            }
        }
        return null;
    }

    public List<Employee> deleteEmployee(Integer id) {
        Employee targetEmployee = findEmployee(id);
        if(targetEmployee!=null){
            employeeData.remove(id);
        }
        return new ArrayList<Employee>(employeeData.values());
    }

    public Employee getEmployee(Integer id) {
        return employeeData.values().stream().filter(data -> data.getId().equals(id)).findFirst().get();
    }

    public List<Employee> getEmployeeWithGender(String gender) {
        return employeeData.values().stream().filter(data -> data.getGender().equals(gender)).collect(Collectors.toList());
    }
}
