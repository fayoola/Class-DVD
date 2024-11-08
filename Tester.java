package Bupasha;

import java.util.Scanner;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Pilih 1. CD atau 2. DVD");
        int pilihan = in.nextInt();
        in.nextLine();
        if(pilihan == 1) {
            System.out.println("numSong");
            String numSong = in.nextLine();
            System.out.println("artist");
            String artist = in.nextLine();
            System.out.println("Label");
            String label  = in.nextLine();
            System.out.println("Name");
            String name = in.nextLine();
            System.out.println("Number");
            int number = in.nextInt();
            System.out.println("Quantity");
            int quantity = in.nextInt();
            System.out.println("Price");
            double price = in.nextDouble();
            CD cd1 = new CD (number, name,quantity,price, artist,numSong, label);
            cd1.print();
        }else if (pilihan ==2){
            System.out.println("Nama");
            String nama = in.nextLine();
            System.out.println("number");
            String number = in.nextLine();
            System.out.println("Rating");
            String rating = in.nextLine();
            System.out.println("Studio");
            String studio =in.nextLine();
            System.out.println("Quantity");
            int quantity =in.nextInt();
            System.out.println(" length");
            int length = in.nextInt();
            System.out.println("audio");
            int audio = in.nextInt();
            System.out.println("price");
            double price = in.nextDouble();
            DVD dvd1= new DVD (number, nama ,quantity ,price ,length ,rating,audio,studio);
            dvd1.print();
        }else {
            System.out.println("Input Salah");

        }
    }
}