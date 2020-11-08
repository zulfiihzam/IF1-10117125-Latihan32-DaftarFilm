/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117125.latihan32.daftarfilm;

/**
 *
 * @author User
 */
public class IF110117125Latihan32DaftarFilm {

/**
 *
 * @author 
 * Nama     : Zulfi Ihzam Rahmat
 * Kelas    : IF-1
 * NIM      : 10117125
 * Deskripsi Program : program ini berisi program yang menampilkan deskripsi  
 * film yang sedang tayang
 */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=== Daftar Film Sedang Tayang ===");
       
       film film1 = new film();
       film1.filmName = "Venom";
       film1.filmGenre = "Action, Horror, Scifi";
       film1.filmRating = 8.5;
       film1.filmDuration = 120;
       film1.nowPlaying(film1.filmName, film1.filmGenre, film1.filmRating, 
               film1.filmDuration);
       
       film film2 = new film();
       film2.filmName = "Crazy Rich Asian";
       film2.filmGenre = "Comedy";
       film2.filmRating = 7.8;
       film2.filmDuration = 119;
       film2.nowPlaying(film2.filmName, film2.filmGenre, film2.filmRating, 
               film2.filmDuration);
    }
    
}
