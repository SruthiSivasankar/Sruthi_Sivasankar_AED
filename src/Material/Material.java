/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Material;

/**
 *
 * @author sruthisivasankar
 */
public class Material {
    static int count=1;
      int serialNumber;
      String name;
      String  registerDate;
      private Boolean Availabilityflag;
      
    public Material(){
        
    }
    
    public Material(String name,String  registerDate){
        this.name=name;
        this.serialNumber=count+3;
        this.Availabilityflag=true;
        this.registerDate=registerDate;
        
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public Boolean getAvailabilityflag() {
        return Availabilityflag;
    }

    public void setAvailabilityflag(Boolean Availabilityflag) {
        this.Availabilityflag = Availabilityflag;
    }
    
    
    
}
