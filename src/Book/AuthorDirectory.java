/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book;

import java.util.ArrayList;

/**
 *
 * @author sruthisivasankar
 */
public class AuthorDirectory {
     ArrayList<Author> authorList;
    public AuthorDirectory(){
        authorList =new ArrayList<Author>();
    }

    public ArrayList<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(ArrayList<Author> authorlist) {
        this.authorList = authorlist;
    }
    
    public Author newAuthor(String name,double rating){
        Author a=new Author(name,rating);
        authorList.add(a);
        return a;
        
    }
    
}
