package com.company;

public class SelectionSorter implements ISorter {
    public void sort(long[] input) {
        System.out.println("Selection:");

        for (int min = 0; min < input.length - 1; min++) {
            int least = min;

            for (int i = min + 1; i < input.length; i++) {
                if (input[least] > input[i])
                    least = i;
            }

            long temp = input[min];
            input[min] = input[least];
            input[least] = temp;

        }
    }
}
