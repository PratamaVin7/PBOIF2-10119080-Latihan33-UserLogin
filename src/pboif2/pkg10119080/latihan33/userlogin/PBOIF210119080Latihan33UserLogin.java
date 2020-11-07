/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119080.latihan33.userlogin;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Kevin Pratama Sinaga
 * KELAS    : PBOIF2
 * NIM      : 10119080
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * (OBJECT ORIENTED) User Login
 */
public class PBOIF210119080Latihan33UserLogin {

    /**
     * @param args the command line arguments
     */
    private static String usName;
    private static String passWord;
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Username = ");
        usName = scanner.next();
        System.out.print("Masukkan Password = ");
        passWord = scanner.next();
        
        User user = new User();
        user.pengecekkanLogin(usName, passWord);
    }
    
}