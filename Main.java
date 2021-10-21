package com.company;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.name.Names;
import com.google.inject.Key;
import com.google.inject.Binding;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Отримуємо масив(перетворюємо у long)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give an array");
        String stringArr = scanner.nextLine();
        long[] array;
        try {
            IConverter conv = new StringToLongArrConverter();
            array = conv.convert(stringArr);
        } catch (NumberFormatException e) {
            System.out.println("Not an Array");
            return;
        }
        // Отримуємо алгоритм сортировки
        System.out.println("Give an algoritm(Insertion/Selection/Bubble)");
        String alg = scanner.next();
        //згідно обраного алгоритму створюємо об'єкт необхідного класу
        Injector inj = Guice.createInjector(new SortModule());

        Binding<ISorter> binding = inj.getExistingBinding(Key.get(ISorter.class, Names.named(alg)));
        if (binding == null) {
            System.out.println("I don`t know this algoritm =(");
            return;
        }

        //сортуємо
        ISorter ex = binding.getProvider().get();
        ex.sort(array);
        //Виводимо відсортований масив

        IPrinter printer = new Printer();
        printer.printResults(array);
    }
}
