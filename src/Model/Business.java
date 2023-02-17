/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Model.Applicant;
import Model.ApplicantDirectory;
import Model.Insurance;
import Model.InsuranceDirectory;
import java.util.ArrayList;

/**
 *
 * @author sruthisivasankar
 */
public class Business {
    ApplicantDirectory applicantDirectory;
    InsuranceDirectory insuranceDirectory;
    
    public Business(){
        this.applicantDirectory= new ApplicantDirectory();
        this.insuranceDirectory= new InsuranceDirectory();
    }

    public ApplicantDirectory getApplicantDirectory() {
        return applicantDirectory;
    }

    public void setApplicantDirectory(ApplicantDirectory applicantDirectory) {
        this.applicantDirectory = applicantDirectory;
    }

    public InsuranceDirectory getInsuranceDirectory() {
        return insuranceDirectory;
    }

    public void setInsuranceDirectory(InsuranceDirectory insuranceDirectory) {
        this.insuranceDirectory = insuranceDirectory;
    }
    public Applicant findApplicant(int applicationId){
        for(Applicant a: applicantDirectory.getApplicantList()){
            if(a.getApplicationId()==applicationId){
                return a;
            }
        }
        return null;
    }
    public Insurance findInsurance(int planId){
        for(Insurance i: insuranceDirectory.getInsuranceList()){
            if(i.getPlanId()==planId){
                return i;
            }
        }
        return null;
    }
    
}
