/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servis;

import bean.Employee;
import dao.EmployeeD;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author michal
 */
@Component
public class EmployeeS {  
 
    private EmployeeD employeeD;
 
    public EmployeeS(EmployeeD employeeD) {
        this.employeeD = employeeD;
    }

 public List<Employee> getAllEmployee(){
        System.out.println("servis!!");
        List list = employeeD.getAll();    
        return list;
    }
 public Employee getEmployee(String email){
     List parm  = new ArrayList();
     parm.add(email);
     Employee employee = employeeD.getT(parm);
     return employee; 
 }
 
}


