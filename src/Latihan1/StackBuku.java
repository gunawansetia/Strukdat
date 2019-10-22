package Latihan1;

public class StackBuku {
    private String data[];
    private int top;
    public int penuh;

    public StackBuku(int jumlah) {
        data = new String[jumlah];
        top = -1;
        penuh = jumlah;

    }

    public void push(String value) {
        if (top < data.length - 1) {
            data[++top] = value;

        }
    }

    public String pop() {
        if (top >= 0) {
            String temp = data[top--];
            return temp;
        }
        return ("");
    }

    public boolean full() {         //Kodingan cek apakah penuh
        return top == penuh - 1;
    }

    public void print() {    //Kodingan menampilkan yang di push saja
        for (int i = data.length - 1; i > -1; i--) {
            System.out.println(data[i]);
        }

    }

    public boolean empety() {           //Kodingan cara cek kosong
        return top == (penuh) - (penuh - 1);
    }
    public void ditempat (){   //Kodingan pada sisa atau di tempat
        for (int i = top; i >=0 ; i--) {
            System.out.println(data[i]);
        }
    }
}