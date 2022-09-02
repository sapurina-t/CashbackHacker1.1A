package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    void shouldShowTheRecommendedAmountForPurchasesOverBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1999);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    void shouldShowTheRecommendedAmountAt1purchase() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    void shouldNotShowTheRecommendedAmountForAPurchaseOf1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }
}