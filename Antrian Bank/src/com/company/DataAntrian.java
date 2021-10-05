package com.company;

import java.util.Scanner;

public class DataAntrian {

    public int id;
    public String nama, keperluan;
    public DataAntrian next;

    static Scanner in = new Scanner(System.in);
    static Scanner str = new Scanner(System.in);

    public void input (){
        System.out.println();
        System.out.println("\t\t\t\t\tMasukan id         : ");
        id= in.nextInt();
        System.out.println("\t\t\t\t\tMasukan nama       : ");
        nama= str.nextLine();
        System.out.println("\t\t\t\t\tMasukan keperluan  : ");
        keperluan= str.nextLine();
        next=null;
    }

    public void read() {

        System.out.println("\t\t\t\t|| "+id+"\t|| "+nama+"  \t\t|| "+keperluan+"\t\t||");
    }

}
