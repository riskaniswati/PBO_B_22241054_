package com.tutorial;

class Mahasiswa{
    // Data Member
    String Nama;
    String NIM;
    String Prodi;

    // Konstruktor
    Mahasiswa(String Nama, String NIM, String Prodi){
        this.Nama= Nama;
        this.NIM = NIM;
        this.Prodi = Prodi;
    }

    // Method tanpa return dan tanpa parameter
    void show(){
        System.out.println("Nama : " + this.Nama);
        System.out.println("NIM : " + this.NIM);
        System.out.println("Prodi : " + this.Prodi);
    }

    // Method tanpa dengan parameter
    void setNama(String Nama, String NIM, String Prodi) {
        this.Nama = Nama;
        this.NIM = NIM;
        this.Prodi = Prodi;
    
    }


    // Method tanpa parameter dengan return
    String getNama(){
        return this.Nama;

    }

    String getNIM(){
        return this.NIM;

    }

    
        
    // Method dengan parameter dengan return
    String sayHi(String pesan) {
        return pesan + " My name is " + this.Nama + " Mahasiswa Disiplin";

    }

}

public class Main {

    public static void main(String[] args) {
        // Membuat objek baru atau instansiasi
        Mahasiswa mhs1 = new Mahasiswa("SAIFUL BAHRIL", "22101776", "STI");

        //Memanggil method
        mhs1.show();
        mhs1.setNama("RISKA NISWATI HASANAH", "22241054", "PTI");
        mhs1.show();

        System.out.println(mhs1.getNama());
        System.out.println(mhs1.getNIM());
        
        String pesan = mhs1.sayHi("hello");
        System.out.println(pesan);
    
    }

}
