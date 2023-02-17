/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Model.Vaccination;
import Model.Insurance;

/**
 *
 * @author sruthisivasankar
 */
public class Pet {
    private String petName;
    private int petAge;
    private String petGender;
    private String petType;
    private String petbreed;  
    Vaccination vaccine;
    Insurance insurance;
    
    public Pet(){
         this.vaccine= new Vaccination();
    }

    public Pet(String petName, int petAge, String petGender, String petType, String petbreed) {
        this.petName = petName;
        this.petAge = petAge;
        this.petGender = petGender;
        this.petType = petType;
        this.petbreed = petbreed;
       
        
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetAge() {
        return petAge;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public String getPetGender() {
        return petGender;
    }

    public void setPetGender(String petGender) {
        this.petGender = petGender;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getPetbreed() {
        return petbreed;
    }

    public void setPetbreed(String petbreed) {
        this.petbreed = petbreed;
    }

    public Vaccination getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccination vaccine) {
        this.vaccine = vaccine;
    }  

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }
    
    
}

