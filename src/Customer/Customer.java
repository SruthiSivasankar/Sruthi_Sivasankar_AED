/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

/**
 *
 * @author Nidhi Raghavendra
 */
public class Customer {
    static int count=1000;
    String name;
    int customerId;
    
    public Customer(){
        
    }
    
    public Customer(String name){
        this.customerId=count;
        this.name=name;
        count=count+1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    
     @Override
    public String toString(){
        return this.name;
    }
    
}
