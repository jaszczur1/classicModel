/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;
/**
 *
 * @author michal
 */

public interface Person {
  String getLastName();
  void setLastName(String lastName);
  String getFirstName();
  void setFirstName(String firstName);
  String getEmail();
  void setEmail(String email);
}
