package com.boot.rest.controllers;

import com.boot.rest.beans.Employee;
import com.boot.rest.beans.EmployeeRegistraion;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EmployeeRetrieveController {

    @RequestMapping(method = RequestMethod.GET, value = "/employee/all")

    @ResponseBody
    public List<Employee> getAllEmployees() {
        return EmployeeRegistraion.getInstance().getEmployeeDetails();
    }
}
