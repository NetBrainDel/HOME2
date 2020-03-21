package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите номер цвета");
        int number = in.nextInt();
        Color Color = new Color(number);
        System.out.println(Color.getColorname());





    }
}
