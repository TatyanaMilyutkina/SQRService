package ru.netology.sqr;

public class Main {

    public static void main(String[] args) {

        SQRService squareRoot = new SQRService();
        int began = 100;
        int end = 300;
        int num = squareRoot.sqr(began, end);
        System.out.println(num);

    }
}

