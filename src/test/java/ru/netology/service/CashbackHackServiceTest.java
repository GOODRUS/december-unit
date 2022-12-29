package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {

        CashbackHackService cashback = new CashbackHackService();

        int actual = cashback.remain(900);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void testIfBuyCostEqualsThousand() { // ожидаемый результат должен был быть равен 0, а не 1000;

        CashbackHackService cashback = new CashbackHackService();

        int actual = cashback.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void testIfBuyCostMoreThousand() {

        CashbackHackService cashback = new CashbackHackService();

        int actual = cashback.remain(1200);
        int expected = 800;

        assertEquals(actual, expected);
    }

    @Test
    public void testIfBuyCostZero() {

        CashbackHackService cashback = new CashbackHackService();

        int actual = cashback.remain(0);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void testIfBuyCostFiveHundred() {

        CashbackHackService cashback = new CashbackHackService();

        int actual = cashback.remain(500);
        int expected = 500;

        assertEquals(actual, expected);
    }

    @Test
    public void testIfBuyCostOne() {

        CashbackHackService cashback = new CashbackHackService();

        int actual = cashback.remain(1);
        int expected = 999;

        assertEquals(actual, expected);
    }
}