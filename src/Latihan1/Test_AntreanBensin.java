package Latihan1;

public class Test_AntreanBensin {
    public static void main(String[] args) {
        AntreanBensin x = new AntreanBensin(5);
        x.enqueue("Motor Matic");
        x.enqueue("Motor Suzuki");
        x.enqueue("Motor Gede");
        x.enqueue("Motor Ojol");
        x.enqueue("Motor Supra X");



        System.out.println("ANTREAN BENSIN PERTAMUNI");
        x.print();
        System.out.println("\n---------------------------");
        System.out.println("YANG SUDAH ISI BENSIN");
        System.out.println(x.dequeue());
        System.out.println(x.dequeue());
        System.out.println("---------------------------");
        System.out.println("YANG MASIH NGANTRE");
        x.lihat();

    }


}
