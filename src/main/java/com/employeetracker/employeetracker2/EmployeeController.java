package com.employeetracker.employeetracker2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
@Controller
public class EmployeeController {
    EmployeeInt empDao = new EmployeeImp();
    @GetMapping("/")
    public String allEmployees(Model model){
        model.addAttribute("allEmployees", empDao.allEmployees());
        return "index";
    }

    @GetMapping("/addnew")
    public String addNew(Model model){
        Employee emp = new Employee();
        model.addAttribute("employee", emp);
        return "addnew";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("employee") Employee employee){
        empDao.addEmployee(employee);
        return "redirect:/";
    }
}
