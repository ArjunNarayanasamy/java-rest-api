package com.boot.rest.beans;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRegistraion {
    private List<Employee> employeeRecords;
    private static EmployeeRegistraion empReg = null;

    private EmployeeRegistraion() {
        employeeRecords = new ArrayList<Employee>();
    }

    public static EmployeeRegistraion getInstance() {
        if (empReg == null) {
            empReg = new EmployeeRegistraion();
            return empReg;
        } else {
            return empReg;
        }
    }

    public void add(Employee emp) {
        employeeRecords.add(emp);
    }

    public List<Employee> getEmployeeDetails () {
        return employeeRecords;
    }

    public String updateEmployee (Employee employee) {
        for(int i=0; i<employeeRecords.size(); i++)
        {
            Employee emp = employeeRecords.get(i);
            if(emp.getEmpId().equals(employee.getEmpId())) {
                employeeRecords.set(i, employee);//update the new record
                return "Update successful";
            }
        }
        return "Update Failed";
    }

    public String deleteEmployee (String employeeId) {
        for(int i=0; i<employeeRecords.size(); i++)
        {
            Employee emp = employeeRecords.get(i);
            if(emp.getEmpId().equals(employeeId)) {
                employeeRecords.remove(i);
                return "Delete successful";
            }
        }
        return "Delete Failed";
    }
}
