package ru.netology.sqr.NumberOfSquares.services;

public class SQRService {

    public int squaring(int lowerLimit, int upperLimit) {
        int x = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowerLimit & i * i <= upperLimit) {
                x = x + 1;
            }
        }
        return x;
    }
}
