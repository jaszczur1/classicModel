/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.List;

/**
 *
 * @author michal
 */
public interface InterfaceDao<T> {
    
    List <T> getAll();
    int save(T t);
    void update(T t);
    void delete(T t);
}
