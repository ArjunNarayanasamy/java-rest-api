package com.boot.rest.controllers;

import com.boot.rest.beans.Employee;
import com.boot.rest.beans.EmployeeRegistraion;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeUpdateController {

    @RequestMapping(method = RequestMethod.PUT, value = "/update/employee")

    @ResponseBody
    public String updateEmployee(@RequestBody Employee employee) {
        return EmployeeRegistraion.getInstance().updateEmployee(employee);
    }
}
