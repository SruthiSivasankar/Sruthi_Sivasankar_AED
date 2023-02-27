/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import Book.Book;
import Magazine.Magazine;

/**
 *
 * @author sruthisivasankar
 */
public class RentRequest {
    
    private static int count=1;
    private static int count2=1;
     
      private int ID;
      int price=10;
      int rentDuration;
      String status;  
      Book book; 
      Magazine magazine;
     
     public RentRequest(){
        this.ID=count;
        
        this.status="pending";
        this.rentDuration=count2;
        this.price=this.rentDuration*price;
        count +=1;
       
        count2+=1;
     }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRentDuration() {
        return rentDuration;
    }

    public void setRentDuration(int rentDuration) {
        this.rentDuration = rentDuration;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Magazine getMagazine() {
        return magazine;
    }

    public void setMagazine(Magazine magazine) {
        this.magazine = magazine;
    }
     
    
}
