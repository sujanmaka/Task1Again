/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1again;

/**
 *
 * @author Sujan Maka
 */
public class Address {
    private String perAddress;
    private String temAddress;

    public Address() {
    }

    public Address(String perAddress, String temAddress) {
        this.perAddress = perAddress;
        this.temAddress = temAddress;
    }

    public String getPerAddress() {
        return perAddress;
    }

    public void setPerAddress(String perAddress) {
        this.perAddress = perAddress;
    }

    public String getTemAddress() {
        return temAddress;
    }

    public void setTemAddress(String temAddress) {
        this.temAddress = temAddress;
    }

    @Override
    public String toString() {
        return " Permanent Address : " + perAddress + "    " + " Temporary Address : " + temAddress ;
    }
    
    
}
