/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book;
import Material.Material;
import java.util.ArrayList;
import Book.Genre;

/**
 *
 * @author sruthisivasankar
 */
public class Book extends Material {
    int noOfPages;
    String language;
    String typeOfBinding;
    Author author;
    Genre genre; 
    
    public Book(){
    }
    
    public Book(int noOfpages,String language,String typeofBinding,String name,String  registerDate,String authorName, double Rating,String genreName){
        super(name,registerDate);
        this.genre=new Genre(genreName);
        this.author=new Author(authorName,Rating);
        this.noOfPages=noOfpages;
        this.language=language;
        this.typeOfBinding=typeofBinding;
    
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTypeOfBinding() {
        return typeOfBinding;
    }

    public void setTypeOfBinding(String typeOfBinding) {
        this.typeOfBinding = typeOfBinding;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    
//    public Genre newGenre(String genreName){
//        Genre g=new Genre(genreName);
//        genre.add(g);
//        return g;
//    }
     @Override
    public String toString(){
        return this.getName();
    }
    
}
