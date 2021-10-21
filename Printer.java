package com.company;

public class Printer implements IPrinter {
    public void printResults(long[] input) {

        for (long el : input) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

}
