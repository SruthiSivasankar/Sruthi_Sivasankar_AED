/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import Book.BookDirectory;
import Book.AuthorDirectory;
import Magazine.MagazineDirectory;
import Book.Genre;
import Employee.BranchManager;
import Employee.Librarian;
import java.util.ArrayList;

/**
 *
 * @author sruthisivasankar
 */
public class Library {
    int buildingNo;
    BookDirectory bookdirectory;
    MagazineDirectory magazinedirectory;
    AuthorDirectory authordirectory;
    ArrayList<Genre> genrelist;
    BranchManager branchmanager;
    Librarian librarian;
    RentalDirectory rentaldirectory;
    
     public Library(){
        magazinedirectory=new MagazineDirectory();
        bookdirectory=new BookDirectory();
        authordirectory=new AuthorDirectory();
        genrelist=new ArrayList<Genre>();
    }
    public Library(int buildingNo){
        magazinedirectory=new MagazineDirectory();
        bookdirectory=new BookDirectory();
        authordirectory=new AuthorDirectory();
        genrelist=new ArrayList<Genre>();
        this.buildingNo=buildingNo;
        this.rentaldirectory=new RentalDirectory();
//        this.librarian=new Librarian();
//        this.branchmanager=new BranchManager();            
    }

    public int getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(int buildingNo) {
        this.buildingNo = buildingNo;
    }

    public BookDirectory getBookdirectory() {
        return bookdirectory;
    }

    public void setBookdirectory(BookDirectory bookdirectory) {
        this.bookdirectory = bookdirectory;
    }

    public MagazineDirectory getMagazinedirectory() {
        return magazinedirectory;
    }

    public void setMagazinedirectory(MagazineDirectory magazinedirectory) {
        this.magazinedirectory = magazinedirectory;
    }

    public AuthorDirectory getAuthordirectory() {
        return authordirectory;
    }

    public void setAuthordirectory(AuthorDirectory authordirectory) {
        this.authordirectory = authordirectory;
    }

    public ArrayList<Genre> getGenrelist() {
        return genrelist;
    }

    public void setGenrelist(ArrayList<Genre> genrelist) {
        this.genrelist = genrelist;
    }

    public BranchManager getBranchmanager() {
        return branchmanager;
    }

    public void setBranchmanager(BranchManager branchmanager) {
        this.branchmanager = branchmanager;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }

    public RentalDirectory getRentaldirectory() {
        return rentaldirectory;
    }

    public void setRentaldirectory(RentalDirectory rentaldirectory) {
        this.rentaldirectory = rentaldirectory;
    }
    
     public Genre newGenre(String genreName){
        Genre g=new Genre(genreName);
        genrelist.add(g);
        return g;
    }
    public Genre searchgenre(String name){
        for(Genre g:genrelist){
            if(g.getName().equals(name)){
                return g;
            }
        }
        return null;
    }
  
}
