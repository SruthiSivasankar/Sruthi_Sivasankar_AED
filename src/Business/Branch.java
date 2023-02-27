package Business;

import Library.Library;
import UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nidhi Raghavendra
 */
public class Branch {
    String name;
    UserAccountDirectory branchuseraccountDirectory;
    // library object 
    Library library;
    
    Branch(String name) {
        this.name = name;
        this.branchuseraccountDirectory = new UserAccountDirectory();
        this.library=new Library();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserAccountDirectory getBranchuseraccountDirectory() {
        return branchuseraccountDirectory;
    }

    public void setBranchuseraccountDirectory(UserAccountDirectory branchuseraccountDirectory) {
        this.branchuseraccountDirectory = branchuseraccountDirectory;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
    
    @Override
    public String toString(){
        return this.name;
    }
    
}
