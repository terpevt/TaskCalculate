package com.company.terpevt;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        String[] strings = str.split(" ");
        solution(strings);

    }
    public static void solution(String[] example) {
        if (example.length != 3) {
            throw new SecurityException();
        }

        Roma[] digits = Roma.values();
        String[] RomaDigits = new String[digits.length];

        for (int i = 0; i < digits.length; i++) {
            RomaDigits[i] = String.valueOf(digits[i]);
        }

        if (existStr(example[0], RomaDigits) & existStr(example[0], RomaDigits)) {
            int a = Roma.valueOf(example[0]).ordinal();
            int b = Roma.valueOf(example[2]).ordinal();
            String operation = example[1];
            //noinspection EnhancedSwitchMigration
            switch(operation) {
                case "+":
                    System.out.println(digits[a + b]);
                    break;
                case "-":
                    int c = a - b;
                    if (c < 1) {
                        throw new SecurityException();
                    }
                    break;
                case "*":
                    System.out.println(digits[a * b]);
                    break;
                case "/":
                    System.out.println(digits[a / b]);
            }
        }
        else {
            if (isDigit(example[0]) & isDigit(example[2])) {
                int a = Integer.parseInt(example[0]);
                int b = Integer.parseInt(example[2]);
                String operation = example[1];
                //noinspection EnhancedSwitchMigration
                switch (operation) {
                    case "+":
                        System.out.println(a + b);
                        break;
                    case "-":
                        System.out.println(a - b);
                        break;
                    case "*":
                        System.out.println(a * b);
                        break;
                    case "/":
                        System.out.println(a / b);
                }
            }
            else {
                throw new SecurityException();
            }
        }
    }

    private static boolean existStr(String str, String[] strings) {
        return Arrays.asList(strings).contains(str);
    }
    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
