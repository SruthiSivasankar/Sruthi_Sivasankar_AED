/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employee;

/**
 *
 * @author sruthisivasankar
 */
public class Librarian extends Employee{
    public Librarian(){
        super.setDesignation("Librarian");
    }
    public Librarian( int experience) {
        super( experience, "Librarian");
    }
    
}
