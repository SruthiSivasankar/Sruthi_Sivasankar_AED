/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Model.Applicant;
import Model.Insurance;
import java.util.ArrayList;


/**
 *
 * @author sruthisivasankar
 */
public class ApplicantDirectory {
    
    ArrayList<Applicant> applicantList;

    public ApplicantDirectory() {
        this.applicantList = new ArrayList<Applicant>();
    }

    public ArrayList<Applicant> getApplicantList() {
        return applicantList;
    }

    public void setApplicantList(ArrayList<Applicant> applicantList) {
        this.applicantList = applicantList;
    }
    public Applicant addApplicant(String OwnerFirstName, String ownerLastName, String applicationDate){
        Applicant newApplicant= new Applicant(OwnerFirstName,ownerLastName,applicationDate);
        applicantList.add(newApplicant);
        return newApplicant;
    }
   
    
    public void deleteInfo(Applicant io){
        applicantList.remove(io);
        
        
    }
   
}
