package com.vwtraining;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FizzBuzzAppTest {

    @Test
    public void buzz() throws Exception {
        FizzBuzzApp app = new FizzBuzzApp();
        String result = app.print(100);
        assertEquals("Buzz", result);
    }

    @Test
    public void fizz() throws Exception {
        FizzBuzzApp app = new FizzBuzzApp();
        String result = app.print(78);
        assertEquals("Fizz", result);
    }

    @Test
    public void fizzBuzz() throws Exception {
        FizzBuzzApp app = new FizzBuzzApp();
        String result = app.print(15);
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void number() throws Exception {
        FizzBuzzApp app = new FizzBuzzApp();
        String result = app.print(7);
        assertEquals("7", result);
    }

    @Test
    public void listNumbers() throws Exception {
        FizzBuzzApp app = new FizzBuzzApp();
        app.rprint(100);
    }

    @Test
    public void fizz_buzz_when_contains_digit_three() throws Exception {
        FizzBuzzApp app = new FizzBuzzApp();
        String result = app.print(54);
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void fizz_when_contains_digit_three() throws Exception {
        FizzBuzzApp app = new FizzBuzzApp();
        String result = app.print(13);
        assertEquals("Fizz", result);
    }
}
