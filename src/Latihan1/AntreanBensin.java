package Latihan1;

public class AntreanBensin {

    private String data[];  //Program antrean motor mengisi bensin
    private int tail;

    public AntreanBensin(int jumlah) {
        data = new String[jumlah];
        tail = -1;
    }

    public void enqueue(String nilai) {
        if (tail < data.length - 1) {
            data[++tail] = nilai;
        }
    }

    public String dequeue() {

        if (tail > 0) {
            //Ambil data index 0
            String temp = data[0];
            //Geser
            for (int i = 0; i < data.length - 1; i++) {
                data[i] = data[i + 1];
            }
            //kurangi tail
            tail--;
            return temp;
        }
        return "";
    }


    public void print() {  //cek yang di masukkan
        for (int i = 0; i < data.length; i++) {
                System.out.print(data[i] + "   ");
            }
        }
        public void lihat(){     //cek yang tersisa
            for (int i = 0; i <=tail; i++) {
                System.out.print(data[i]+"   ");
            }
    }

}