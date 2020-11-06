/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan33.objectorienteduserlogin;

/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan user Login
 * yang berbasis object oriented 
 */

public class User {
    
    private String username;
    private String password;
    private boolean statusAkun;
    
    private boolean cekAkun(String parUserName, String parPassword){
       statusAkun = ("RizkiAdam".equals(parUserName) && "terbaikselalu".equals(parPassword));
        return statusAkun;
    }
    
    private void hasilLogin(boolean status, String parUserName){
        if (status==true){
            System.out.println();
            System.out.println("******HALLO "+parUserName.toUpperCase()+"******");
            System.out.println("Selamat Datang di Aplikasi ini");
        }else{
            System.out.println("Ooops, Username atau Password anda salah");
        }
    }
    
    public void pengecekkanLogin(String parUserName, String parPassword) {
        cekAkun(parUserName,parPassword);
        hasilLogin(statusAkun,parUserName);
    } 
}
