package ru.netology.test;

import static org.junit.Assert.assertEquals;

import ru.netology.service.CashbackHackService;

public class CashbackHackerTest {

    @org.junit.Test
    public void shouldReturnHowMuchBuyElseLess1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;
        int actual = cashbackHackService.remain(amount);
        int expected = 1;
        assertEquals (actual, expected);
    }

    @org.junit.Test
    public void shouldReturnElse1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldReturnHowMuchBuyElseMore1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1001;
        int actual = cashbackHackService.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldReturnElse0() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;
        int actual = cashbackHackService.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldReturnHowMuchBuyElse1() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1;
        int actual = cashbackHackService.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldReturnHowMuchBuyElse2() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 2;
        int actual = cashbackHackService.remain(amount);
        int expected = 998;
        assertEquals(actual, expected);
    }
}


