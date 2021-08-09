package com.example.demo;

import org.junit.jupiter.api.Test;

public class ConstantPollTest {
    @Test
    public void aVoid() {
        Double d1 = 1.0;
        Double d2 = 1.0;
        System.out.println(d1 == d2);

        Float f1 = 1.0F;
        Float f2 = 1.0F;
        System.out.println(f1 == f2);

        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1 == i2);
        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i3 == i4);
        Integer i5 = -128;
        Integer i6 = -128;
        System.out.println(i5 == i6);
        Integer i7 = -129;
        Integer i8 = -129;
        System.out.println(i7 == i8);

        Long l1 = 127L;
        Long l2 = 127L;
        System.out.println(l1 == l2);

        Character c1 = 'z';
        Character c2 = 'z';
        System.out.println(c1 == c2);


    }
}
