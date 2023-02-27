/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Customer.CustomerDirectory;
import Role.SystemAdminRole;
import UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author Nidhi Raghavendra
 */
public class Business {
    ArrayList<Branch> branches;
    UserAccountDirectory topLevelUserAccountDirectory;
    CustomerDirectory customerdirectory;
    
    Business() {
        this.branches = new ArrayList<Branch>();
        this.topLevelUserAccountDirectory = new UserAccountDirectory();
        this.customerdirectory=new CustomerDirectory();
        
        // CREATING ADMIN
        this.topLevelUserAccountDirectory.createUserAccount("admin", "admin", new SystemAdminRole());
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void setBranches(ArrayList<Branch> branches) {
        this.branches = branches;
    }

    public UserAccountDirectory getTopLevelUserAccountDirectory() {
        return topLevelUserAccountDirectory;
    }

    public void setTopLevelUserAccountDirectory(UserAccountDirectory topLevelUserAccountDirectory) {
        this.topLevelUserAccountDirectory = topLevelUserAccountDirectory;
    }

    public CustomerDirectory getCustomerdirectory() {
        return customerdirectory;
    }

    public void setCustomerdirectory(CustomerDirectory customerdirectory) {
        this.customerdirectory = customerdirectory;
    }
    
       
    public Branch createBranch(String name) {
        Branch branch = new Branch(name);
        this.branches.add(branch);
        return branch;
    }
    
    public static Business getInstance() {
        return new Business();
    }
    
    public Branch deletebranch (String name){
        for (Branch h:branches ){
            if(h.getName().equalsIgnoreCase(name)){
                branches.remove(h);
                return h;
            }
        }
        return null;
    }
    public Branch searchbranch(String s){
        for (Branch bs:this.getBranches()){
            if (bs.getName().equals(s)){
                return bs;
            }
            
        }
        return null;
    }
 
}
