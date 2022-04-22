package ru.netology.sqr;

import static java.lang.Integer.compare;

public class SQRService {



    public long sqrCeil(long max,long min) {

        for (long i = 10; i <= 99; i++) {
            if (i*i>=min && i * i <= max) {
                return i;
            }
        }
        return 0;
    }
}
