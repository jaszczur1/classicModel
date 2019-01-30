/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Employee;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.sql.DataSource;

/**
 *
 * @author michal
 */
@Component
public class EmployeeD implements Dao<Employee> {

    @Autowired
    private DataSource datasource;

    public List<Employee> getAll() {
        System.out.println("pobieranie wszystkich pracownikow !!!!");
        List<Employee> employees = new ArrayList<Employee>();
        String sql = "select * from employees";
        try {
            PreparedStatement ps = datasource.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setFirstName(rs.getString("firstName"));
                employee.setEmail(rs.getString("email"));
                employees.add(employee);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return employees;
    }

    public void save(Employee t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void update(Employee t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void delete(Employee t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Employee getT(List parm) {
        String sql = "select * from employees where email= ?";
        try {
            PreparedStatement ps = datasource.getConnection().prepareStatement(sql);
            ps.setString(1, (String) parm.get(0));
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                Employee employee = new Employee();
                employee.setLastName(resultSet.getString(2));
                employee.setFirstName(resultSet.getString(3));
                employee.setEmail(resultSet.getString("email"));
                employee.setOfficeCode(resultSet.getString(6));
                return employee;
            }

        } catch (SQLException ex) {
            Logger.getLogger(EmployeeD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
