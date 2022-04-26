package ru.netology.sqr;

public class SqrService {

    public int sqrCeil(int max, int min) {
        int amountSqr = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min && i * i <= max) {
                amountSqr += 1;
            }
        }
        return amountSqr;
    }
}