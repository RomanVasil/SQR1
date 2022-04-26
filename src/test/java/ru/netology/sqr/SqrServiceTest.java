package ru.netology.sqr;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class SqrServiceTest {

    @Test
    void shouldSqrCeil() {
        SqrService service = new SqrService();
        int min = 10;
        int max = 300;
        int expected = 8;
        int actual = service.sqrCeil(max, min);


        assertEquals(expected, actual);
    }
}
