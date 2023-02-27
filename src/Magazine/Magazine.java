/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Magazine;
import Material.Material;

/**
 *
 * @author sruthisivasankar
 */
public class Magazine extends Material{
    String companyname;
    String issueType;
    
    public Magazine(String companyname, String issueType,String name,String registerDate) {
        super(name,registerDate);
        this.companyname = companyname;
        this.issueType = issueType;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }
    
    @Override
    public String toString(){
        return this.getName() ;
    }
    
}
