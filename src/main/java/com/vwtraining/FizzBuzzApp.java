package com.vwtraining;

import javafx.util.Pair;

public class FizzBuzzApp {

    public boolean rprint(int n) {
        return n > 0 && print(n) != null && rprint(--n);
    }

    public String print(int num) {
        boolean fizz = isFizz(num);
        boolean buzz = isBuzz(num);

        String result = FizzBuzzDomain.get(new Pair<>(fizz, buzz), num);
        System.out.println(result);
        return result;
    }

    private boolean isBuzz(int num) {
        int remainder = num % 5;
        int digitLeft = num / 10;
        int digitRight = num % 10;
        return remainder == 0 || digitLeft == 5 || digitRight ==5;
    }

    private boolean isFizz(int num) {
        int remainder = num % 3;
        int digitLeft = num / 10;
        int digitRight = num % 10;
        return remainder == 0 || digitLeft == 3 || digitRight ==3;
    }
}
