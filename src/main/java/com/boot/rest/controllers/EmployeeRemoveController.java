package com.boot.rest.controllers;

import com.boot.rest.beans.Employee;
import com.boot.rest.beans.EmployeeRegistraion;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeRemoveController {

    @RequestMapping(method = RequestMethod.DELETE, value = "/remove/employee/{empId}")

    @ResponseBody
    public String removeEmployeeRecord(@PathVariable("empId") String empId) {
        return EmployeeRegistraion.getInstance().deleteEmployee(empId);
    }
}
