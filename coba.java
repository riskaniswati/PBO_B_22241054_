package COM.tutorial;

class mahasiswa{
    // data member/ciri/atribut
    String nama;
    String nim;
    String prodi;

    //membuat konstruktor parameter
    mahasiswa(String inputnama, String inputnim, String inputprodi){
       nama = inputnama;
       nim  = inputnim;
       prodi= inputprodi;

        System.out.println("nama : " + nama);
        System.out.println("nim : " + nim);
        System.out.println("prodi : " + prodi);


    }

}

public class coba {
    public static void main(String[] args) {
        mahasiswa mhs1 = new mahasiswa("RISKA NISWATI HASANAH", "22241054", "PTI");
        //masukkan nilai objek

        mahasiswa mhs2 = new mahasiswa("UYUN HAFIZAH", "22241079", "PTI");

    }
}
