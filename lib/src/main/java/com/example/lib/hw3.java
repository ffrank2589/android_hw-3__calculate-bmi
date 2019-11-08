package com.example.lib;

import java.util.Scanner;

public class hw3{
    static double height;
    static double weight;
    static double Bmi;
    public static void main(String args[])  {
        System.out.println("input= height  weight  weight");
        Scanner sc1=new Scanner(System.in);
        height=sc1.nextDouble();
        Scanner sc2=new Scanner(System.in);
        weight=sc2.nextDouble();
        Bmi=weight/((height/100)*(height/100));
        System.out.println(Bmi);
        if(Bmi<=18.5){
            System.out.println("thin"+Bmi);
        }else if(Bmi>=24){
            System.out.println("fat"+Bmi);
        }else{
            System.out.println("nice"+Bmi);
        }
    }

}
