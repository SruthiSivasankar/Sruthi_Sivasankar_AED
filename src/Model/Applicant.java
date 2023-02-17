/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Model.Pet;

/**
 *
 * @author sruthisivasankar
 */
public class Applicant {
    private static int count=3;
    private int applicationId;
    private String OwnerFirstName;
    private String ownerLastName;
    private String applicationDate;
    Pet pet;
    
    Applicant(){
        this.applicationId=count;
        Applicant.count=count+4;
}

    public Applicant(String OwnerFirstName, String ownerLastName, String applicationDate) {
        this.applicationId=count;
        Applicant.count=count+4;
        this.OwnerFirstName = OwnerFirstName;
        this.ownerLastName = ownerLastName;
        this.applicationDate = applicationDate;
        pet=new Pet();
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Applicant.count = count;
    }

    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public String getOwnerFirstName() {
        return OwnerFirstName;
    }

    public void setOwnerFirstName(String OwnerFirstName) {
        this.OwnerFirstName = OwnerFirstName;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }

    public void setOwnerLastName(String ownerLastName) {
        this.ownerLastName = ownerLastName;
    }

    public String getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(String applicationDate) {
        this.applicationDate = applicationDate;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
    public Pet newPet(String petName,int petAge,String petGender,String petType,String petbreed){
        this.pet=new Pet(petName,petAge,petGender, petType,petbreed);
        return pet;
    }
    @Override
    public String toString(){
        return this.OwnerFirstName;
    }
       
}

