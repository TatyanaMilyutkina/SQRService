package ru.netology.sqr;

public class SQRService {

    public int sqr(int began, int end) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int x = i * i;
            if (x >= began & x <= end)
                count++;

        }
        return count;
    }


}