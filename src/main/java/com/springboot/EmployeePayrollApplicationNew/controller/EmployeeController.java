package com.springboot.EmployeePayrollApplicationNew.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
    @GetMapping("/home")
    public String home(){
        return "Home_Page";
    }
    @GetMapping("/payroll")
    public String payroll(){
        return "Employee_Payroll";
    }
}
