/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Model;

/**
 *
 * @author sruthisivasankar
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = 25;
        System.out.println(number);
        
        double value = 20.50;
        System.out.println(value);
        
        float f = 5.75f;
        System.out.println(f);
        
        String name = "Sruthi";
        System.out.println(name);
        
        char letter = '\u0051';
        System.out.println(letter);
        
        boolean itsWinter = true;
        System.out.println(itsWinter);
        
        int a= -3;
        if(a > 0){
            System.out.println("Positive");
        } else {System.out.println("Negative");} 
        
        int n = 10;
        int[] array = new int[n]; 
        for (int i=1;i<array.length;i++){
            System.out.println(i);
        }
                
    }
    
}
