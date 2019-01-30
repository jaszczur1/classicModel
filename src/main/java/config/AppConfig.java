/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import dao.EmployeeD;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import servis.EmployeeS;

/**
 *
 * @author michal
 */
@Configuration
public class AppConfig {    

    @Bean
    @Scope("prototype")        
    EmployeeD employeeD(){
    return new EmployeeD();
    }
    
    @Bean
    @Scope("prototype")        
    EmployeeS employeeS(EmployeeD employeeD){
    return new EmployeeS(employeeD);
    }
}
