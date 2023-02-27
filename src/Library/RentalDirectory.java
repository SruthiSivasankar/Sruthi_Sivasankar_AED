/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import java.util.ArrayList;

/**
 *
 * @author sruthisivasankar
 */
public class RentalDirectory {
    
    ArrayList<RentRequest> requestList;
    
    
    public RentalDirectory(){
        this.requestList=new ArrayList<RentRequest>();
        
    }

    public ArrayList<RentRequest> getRequestList() {
        return requestList;
    }

    public void setRequestList(ArrayList<RentRequest> requestList) {
        this.requestList = requestList;
    }
    public RentRequest newrentalrequest(){
        RentRequest r=new RentRequest();
        requestList.add(r);
        return r;
        
    }
    public RentRequest searchrequest(int id){
        for (RentRequest r: requestList){
            if(r.getID()==id){
                return r;
            }
        }
        return null;
    }
    
}
