package com.company;

public class InsertionSorter implements ISorter {
    public void sort(long[] input) {
        System.out.println("Insertion:");

        for (int i = 0; i < input.length; i++) {
            long value = input[i];

            int j = i - 1;
            for (; j >= 0; j--) {
                if (input[j] > value) {
                    input[j + 1] = input[j];
                    input[j] = value;
                } else break;

            }
        }
    }
}
