package com.boot.rest.controllers;

import com.boot.rest.beans.EmpRegistrationReply;
import com.boot.rest.beans.Employee;
import com.boot.rest.beans.EmployeeRegistraion;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeRegistrationController {

    @RequestMapping(method = RequestMethod.POST, value = "register/employee")

    @ResponseBody
    public EmpRegistrationReply registerEmployee(@RequestBody Employee employee){
        EmpRegistrationReply reply = new EmpRegistrationReply();
        EmployeeRegistraion.getInstance().add(employee);

        reply.setEmpId(employee.getEmpId());
        reply.setEmpName(employee.getEmpName());
        reply.setAge(employee.getAge());
        reply.setEmpId(employee.getEmpId());
        reply.setRegistrationStatus("Successful");

        return reply;
    }
}
