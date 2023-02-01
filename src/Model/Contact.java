/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author sruthisivasankar
 */
public class Contact {
    String emailId;
    long phoneNo;
    
    public Contact(){
    }
     
    public String getEmailId() {
        return emailId;
    }

    public long getPhoneNo() {
        return phoneNo;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }
        
}
