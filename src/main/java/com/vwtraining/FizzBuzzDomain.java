package com.vwtraining;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Shailesh on 6/27/17.
 */
class FizzBuzzDomain {

    private static final Map<Pair<Boolean, Boolean>, String> foo;

    static {
        foo = new HashMap<>();
        foo.put(new Pair<>(true, true), "FizzBuzz");
        foo.put(new Pair<>(true, false), "Fizz");
        foo.put(new Pair<>(false, true), "Buzz");
    }

    public static String get(Pair<Boolean, Boolean> key, int num) {
        foo.put(new Pair<>(false, false), String.format("%s",num));
        return foo.get(key);
    }
}
