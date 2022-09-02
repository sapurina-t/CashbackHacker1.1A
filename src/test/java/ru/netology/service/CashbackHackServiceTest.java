package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldShowTheRecommendedAmountForPurchasesOverBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1999);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldShowTheRecommendedAmountAt1purchase() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldNotShowTheRecommendedAmountForAPurchaseOf1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }


    @Test
    public void shouldShowTheRecommendedAmountForPurchasesOverBoundaryJJ5() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(1999);

        Assertions.assertEquals(expected, actual);
    }

        @Test
    public void shouldShowTheRecommendedAmountAt1purchaseJJ5() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1);


      Assertions.assertEquals(expected, actual);
    }

        @Test
    public void shouldNotShowTheRecommendedAmountForAPurchaseOf1000JJ5() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

      Assertions.assertEquals(expected, actual);
    }
}