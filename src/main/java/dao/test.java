/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author michal
 */
public class test {


    private String marka ="audi"; 

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
        System.out.println("save !!" + this.marka);
    }
   
}
