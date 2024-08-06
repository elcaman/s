package ru.netology.service;

import org.junit.*;
import static org.junit.Assert.*;


public class CashbackHackServiceTest {
    @Test
    public void purchaseAmount0(){
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        assertTrue(expected, actual);
    }
}
