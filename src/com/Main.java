package com;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataBase db = new DataBase();
        String x, y, ans;

        //пока число не является 8-ми разрядным
        do{
            System.out.print("Введите значение X: ");
            x = sc.nextLine();
            System.out.print("Введите значение Y: ");
            y = sc.nextLine();

//            System.out.println("X:"+ x +" Y:"+ y);
        }
        while (x.length() != 8 || y.length() != 8);
        db.serialization("src/com/input.txt", x, y);

        if (x.charAt(0) == '-')
            x=inversionNumber(x);
        else if(y.charAt(0) == '-')
            y=inversionNumber(y);

        ans = add(x,y);

        System.out.println("Ответ: "+ans);
        db.serialization("src/com/output.txt",ans);
    }

    /**
     * Функция для переворота числа<br><br>
     * Function to flip a number
     * @param num
     * @return
     */
    public static String inversionNumber(String num){
        StringBuilder sb = new StringBuilder();

        char replace;
        for (int i = 0; i < num.length(); i++) {
            replace = num.charAt(i);
            if (replace == '1')
                sb.append('0');
            else if (replace == '0')
                sb.append('1');
        }

        return sb.toString();
    }

    /**
     * Сложение двух двоичных чисел<br><br>
     * Addition of two binary numbers
     * @param x
     * @param y
     * @return
     */
    public static String add(String x, String y){
        int num1 = Integer.parseInt(x,2);
        int num2 = Integer.parseInt(y,2);
        int ans = num1+num2;
        int k = 0;

        String out ="";

        while (ans != 0){
            k = ans % 2;
            ans = ans/2;
            out = k + out;
        }
        return out;
    }
}
