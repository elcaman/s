package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    /*@BeforeClass
    public void Service(){
        CashbackHackService CashService = new CashbackHackService();
    }*/

    @Test
    public void purchaseAmount0(){
        CashbackHackService CashService = new CashbackHackService();
        int amount = 0;
        int actual = CashService.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void purchaseAmount700(){
        CashbackHackService CashService = new CashbackHackService();
        int amount = 700;
        int actual = CashService.remain(amount);
        int expected = 300;

        assertEquals(actual, expected);
    }

    @Test
    public void purchaseAmount1000(){
        CashbackHackService CashService = new CashbackHackService();
        int amount = 1000;
        int actual = CashService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void purchaseAmount1500(){
        CashbackHackService CashService = new CashbackHackService();
        int amount = 1500;
        int actual = CashService.remain(amount);
        int expected = 500;

        assertEquals(actual, expected);
    }
}
