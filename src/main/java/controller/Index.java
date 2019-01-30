/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.Employee;
import bean.Office;
import dao.OfficeD;
import dao.test;
import dao.testick;
import java.util.ArrayList;
import java.util.List;
import jdk.nashorn.internal.runtime.regexp.joni.EncodingHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import servis.EmployeeS;

/**
 *
 * @author michal
 */
@Controller
@RequestMapping("/")
public class Index {

    @Autowired
    EmployeeS employeeS;
    @Autowired
    OfficeD officeD;

    @RequestMapping
    public String getAll(Model model) {
        System.out.println("controller.Index.toDo()");
        model.addAttribute("allEmployee", employeeS.getAllEmployee());

        return "index";
    }

    @RequestMapping(value = "edit")
    public String newEmployee(Model model) {
        System.out.println("nowy pracownik");
        model.addAttribute("newEmployee", new Employee());
        return "index";
    }

    @RequestMapping(value = "edit", params = {"email"})
    public String edit(Model model, @RequestParam("email") String email) {
        System.out.println("edycja pracownika, pobieranie danych z bazy dla " + email + " :");
    
        
//        model.addAttribute("editEmployee", employeeS.getEmployee(email));
       
        
        List l = officeD.getAll();
        
        test t = new  test();
        t.setMarka("sd");
        List lz = new ArrayList();
        lz.add(new test());
        lz.add(new test());
        model.addAttribute("test1", lz);
        model.addAttribute("tescik", new testick());
        
        
        return "newjsp";
    }

    @RequestMapping(value = "edit", params = {"email"}, method = RequestMethod.POST)
    public String to(@ModelAttribute("editEmployee") Employee employee, @ModelAttribute("availableOffice") Office office) {
        System.err.println(employee.getEmail()+ "eduudasd");
        System.out.println(office.getAddressLine1());
        officeD.update(employee);
        return "index";
    }

}
