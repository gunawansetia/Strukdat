package Latihan1;

public class Test_StackBuku {
    public static void main(String[] args) {
        StackBuku x = new StackBuku(10); //Menumpuk Buku Cetak dan Buku Lainnya, kasus: ingin mengambil BUKU Arsitektur Komputer
        x.push("Naruto");
        x.push("Novel A");
        x.push("Novel B");
        x.push("Algoritma & Pemrograman");
        x.push("Matematika Numerik");
        x.push("Struktur Data");
        x.push("Organisasi Komputer");
        x.push("Arsitektur Komputer;");
        x.push("EBI");
        x.push("makanan");
        System.out.println(x.full());   //Mengecek apakah wadah nya penuh
        x.print();                      //Cek yang ditumpuk
        System.out.println("-------------------------------");
        x.pop();                        //Yang diatas diambil
        System.out.println(x.full()); //Mengecek apakah wadahnya penuh (tidak penuh)
        System.out.println(x.pop());  // print yang diatas diambil
        x.pop();                //yang diatas diambil
        System.out.println("-------------------------------");
        x.ditempat();             //sisanya di tempat/wadah

    }
}