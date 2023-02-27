/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Magazine;

import java.util.ArrayList;

/**
 *
 * @author sruthisivasankar
 */
public class MagazineDirectory {
    ArrayList<Magazine> magazinelist;
    
    
   public MagazineDirectory(){
       this.magazinelist=new ArrayList<Magazine>();
   }

    public ArrayList<Magazine> getMagazinelist() {
        return magazinelist;
    }

    public void setMagazinelist(ArrayList<Magazine> magazinelist) {
        this.magazinelist = magazinelist;
    }
   
   public Magazine newMagazine(String companyname, String issueType,String name,String registerDate){
        Magazine m=new Magazine(companyname,issueType,name,registerDate);
        magazinelist.add(m);
        return m;        
    }
    
    public Magazine searchmagazine(String s){
        for (Magazine m:magazinelist){
            if(m.getName().equals(s)){
                System.out.println(s + " : " + m);
                return m;
                
            }
        }
        return null;
    }
}
