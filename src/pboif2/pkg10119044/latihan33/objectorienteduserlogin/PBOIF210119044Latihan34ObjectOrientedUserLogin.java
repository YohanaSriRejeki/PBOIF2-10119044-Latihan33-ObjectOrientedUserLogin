/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan33.objectorienteduserlogin;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan user Login
 * yang berbasis object oriented 
 */

public class PBOIF210119044Latihan34ObjectOrientedUserLogin {
    
    private static String usName;
    private static String passWord;
    
    public static void main(String args[]) {
       User usr = new User();
       Scanner input = new Scanner(System.in);
       System.out.print("Masukkan Username = ");
       usName = input.next();
       System.out.print("Masukkan Password = ");
       passWord = input.next();
       
       usr.pengecekkanLogin(usName, passWord);        
    }   
}
