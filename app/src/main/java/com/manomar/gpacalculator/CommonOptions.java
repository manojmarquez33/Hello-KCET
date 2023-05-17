package com.manomar.gpacalculator;

public class CommonOptions {
    private static CommonOptions commonOptions = null;
    public static CommonOptions getData() {
        if (commonOptions == null) {
            commonOptions = new CommonOptions();
        }
        return commonOptions;
    }
}
