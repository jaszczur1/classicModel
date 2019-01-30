/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Employee;
import bean.Office;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author michal
 */

@Component

public class OfficeD implements Dao{

    
    @Autowired
    private DataSource datasource;
    
    public List getAll() {
      List<Office> offices = new ArrayList<Office>();
      String query = "select * from offices";
      
      
            PreparedStatement ps;
            ResultSet rs = null;
        try {
            ps = datasource.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            
             while (rs.next()) {
               Office office = new Office();
               office.setOfficeCode(rs.getString(1));
               office.setCity(rs.getString(2));
               office.setPhone(rs.getString(3));
               office.setAddressLine1(rs.getString(4));
               office.setAddressLine2(rs.getString(5));
               office.setState(rs.getString(6));
               office.setCountry(rs.getString(7));
               office.setPostalCode(rs.getString(8));
               office.setTerritory(rs.getString(9));
               
               offices.add(office);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(OfficeD.class.getName()).log(Level.SEVERE, null, ex);
        }
            
           System.out.println(offices.size());
      
      return offices;
    }

    public void save(Object t) {
           }

    public void update(Object t) {
       
        String  query = "update employees set lastName = \"ble\" where email =\"dmurphy@classicmodelcars.com\"";
        Employee employee  = (Employee)t;
       PreparedStatement ps = null;
        try {
            ps = datasource.getConnection().prepareStatement(query);
        } catch (SQLException ex) {
            Logger.getLogger(OfficeD.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            int rs = ps.executeUpdate();
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(OfficeD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void delete(Object t) {
        
    }

    public Object getT(List parm) {
      return  null;
    }
    
}
