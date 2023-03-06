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
public class GenreDirectory {
    ArrayList<Genre> genreList;
     
    public GenreDirectory(){
        genreList =new ArrayList<Genre>();
    }

    public ArrayList<Genre> getGenreList() {
        return genreList;
    }

    public void setGenreList(ArrayList<Genre> genreList) {
        this.genreList = genreList;
    }
   
       public Genre newGenre(String genrename){
        Genre g = new Genre(genrename);
        genreList.add(g);
        return g;
    }
    
    public Genre searchgenre(String name){
        for(Genre g:genreList){
            if(g.getName().equals(name)){
                return g;
            }
        }
        return null;
    }
}
