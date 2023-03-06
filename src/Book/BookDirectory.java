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
public class BookDirectory {
    ArrayList<Book> bookList;
    
    public BookDirectory(){
        bookList=new ArrayList<Book>();
        
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }
    public Book createBook(int noOfpages,String language,String typeofBinding,String name,String  registerDate){
        Book b1=new Book (noOfpages,language,typeofBinding,name,registerDate);
        bookList.add(b1);
        return b1;
        
    }
    public Book searchbook(String s){
        for (Book b:bookList){
            if(b.getName().equals(s)){
                return b;
            }
        }
        return null;
    }
    
    
}
