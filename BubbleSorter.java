package com.company;

public class BubbleSorter implements ISorter {
    public void sort(long[] input) {
        System.out.println("Bubble:");



        for (int i = 0; i < input.length - 1; i++)
            for (int j = 0; j < input.length - i - 1; j++)
                if (input[j] > input[j + 1]) {
                    long temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
    }
}
/*3 10 5 8 7




 */