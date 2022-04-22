package ru.netology.sqr;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldSqrCeil () {
        SQRService service = new SQRService();
        long min = 9;
        long max= 100;

        long expected =10;

        long actual = service.sqrCeil(min,max);


        assertEquals(expected, actual);
    }
}