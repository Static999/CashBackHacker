package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackHackServiceTest {
    CashBackHackServiceTest CashBackHackService = new CashBackHackServiceTest();
    private int remain(int amount) {
        return amount;
    }


    @Test
    public void shouldCalculateIfAmountCorrect() {

        int amount = 1700;
        int actual = CashBackHackService.remain( amount );
        int expected = 300;

        assertEquals( actual, expected );

    }


    @Test
    public void shouldCalculateIfAmountZero() {
        int amount = 0;
        int actual = CashBackHackService.remain( amount );
        int expected = 1000;

        assertEquals( actual, expected );

    }


    @Test
    public void shouldCalculateIfAmount999() {
        int amount = 999;
        int actual = CashBackHackService.remain( amount );
        int expected = 1;
        assertEquals( actual, expected );
    }

    @Test
    public void shouldCalculateIfAmount1000() {
        int amount = 1000;
        int actual = CashBackHackService.remain( amount );
        int expected = 0;
        assertEquals( actual, expected );
    }


}