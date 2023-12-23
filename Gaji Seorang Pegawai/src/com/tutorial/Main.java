package com.tutorial;

public class Main {
    public String nama;
    public String jabatan;
    public double pajak = 0.1; // Pajak sebesar 10% 
    public double gajiPokok;
    private double gajiBersih;

    public Main (String nama, String jabatan, double gajiPokok) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
        hitungGajiBersih();
    }

    //Getter dan setter untuk variabel yang di-modifikasi private
    public void hitungGajiBersih() {
        this.gajiBersih = this.gajiPokok * (1 - this.pajak);
    }

    public double getGajiBersih() {
        return this.gajiBersih;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
        hitungGajiBersih();
    }

    public double getGajiPokok() {
        return this.gajiPokok;
    }

    public static void main(String[] args) {
        // Menggunakan setter untuk pengaturan gaji bersih

        String namaPegawai = "Riska Niswati Hasanah";
        String jabatanPegawai = "PNS";
        double gajiPokokPegawai = 3500000;

        Main pegawai1 = new Main(namaPegawai, jabatanPegawai, gajiPokokPegawai);

        System.out.println("Nama Pegawai: " + pegawai1.nama);
        System.out.println("Jabatan Pegawai: " + pegawai1.jabatan);
        System.out.println("Gaji Pokok Pegawai: " + pegawai1.getGajiPokok());
        System.out.println("Gaji Bersih Pegawai: " + pegawai1.getGajiBersih());
        System.out.println("Pajak: " + (pegawai1.pajak * 100) + "%");


        // Menggunakan setter untuk mengubah gaji pokok
        pegawai1.setGajiPokok(6000000);

        System.out.println("Gaji Pokok Pegawai setelah diubah: " + pegawai1.getGajiPokok());
        System.out.println("Gaji Bersih Pegawai setelah diubah: " + pegawai1.getGajiBersih());
        System.out.println("Pajak: " + (pegawai1.pajak * 100) + "%");
 
    }
}



