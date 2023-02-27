/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employee;

/**
 *
 * @author sruthisivasankar
 */
public class Employee {
    private static int count=1;
    private int employeeID;
    private int experience;
    private String designation;
    public Employee(){
        
    }

    public Employee( int experience, String designation) {
        this.employeeID = count;
        this.experience = experience;
        this.designation = designation;
        count=count+1;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    
}
