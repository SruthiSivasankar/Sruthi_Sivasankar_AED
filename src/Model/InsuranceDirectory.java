/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Model.Insurance;
import java.util.ArrayList;

/**
 *
 * @author sruthisivasankar
 */
public class InsuranceDirectory {
    ArrayList<Insurance>insuranceList;

    public InsuranceDirectory() {
        this.insuranceList = new ArrayList<Insurance>();
    }

    public ArrayList<Insurance> getInsuranceList() {
        return insuranceList;
    }

    public void setInsuranceList(ArrayList<Insurance> insuranceList) {
        this.insuranceList = insuranceList;
    }
    
    public Insurance newInsurance(String planName,int costPerMonth){
        Insurance newPlan=new Insurance(planName,costPerMonth);
        System.out.println(newPlan.toString());
        insuranceList.add(newPlan);
        return newPlan;
    }
    public void removeInsurance(String name){
        for(Insurance dl:this.insuranceList){
            if(dl.getPlanName().equals(name)){
                this.insuranceList.remove(dl);
                break;
            }
        }
    }
    
}
