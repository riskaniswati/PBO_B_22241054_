package com.tutorial;

class Mahasiswa {
String nama;
String nim;
String prodi;
}


public class Main {
    public static void main(String[] args) {
        //instasiasi objek dari calss Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa();//
        //memberi atribut pada objek mhs1
        mhs1.nama = "Riska Niswati Hasanah";
        mhs1.nim = "22241054";
        mhs1.prodi = "PTI";


        System.out.println("Nama : " + mhs1.nama);
        System.out.println("NIM : " + mhs1.nim);
        System.out.println("Prodi : " + mhs1.prodi);

        
        
    }
}
