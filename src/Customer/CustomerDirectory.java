/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

import java.util.ArrayList;

/**
 *
 * @author Nidhi Raghavendra
 */
public class CustomerDirectory {
    ArrayList<Customer> customerlist;
    
    public CustomerDirectory() {
        this.customerlist = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerlist() {
        return customerlist;
    }

    public void setCustomerlist(ArrayList<Customer> customerlist) {
        this.customerlist = customerlist;
    }
    
    // implement code below
    public Customer createCustomer(String name ,int customerId) {
        Customer c=new Customer(name,customerId);
        customerlist.add(c);
        return c;
    }
}
