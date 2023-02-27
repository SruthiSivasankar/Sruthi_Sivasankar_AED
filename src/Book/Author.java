/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book;

/**
 *
 * @author sruthisivasankar
 */
public class Author {
    String authorName;
    double authorRating;
    
    public Author(){
    }
    
    public Author(String authorName,double Rating){
        this.authorName=authorName;
        this.authorRating=Rating;
        
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public double getAuthorRating() {
        return authorRating;
    }

    public void setAuthorRating(double authorRating) {
        this.authorRating = authorRating;
    }

    

}
