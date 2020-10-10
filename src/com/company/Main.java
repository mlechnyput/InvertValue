package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sequence of numbers. To exit press any letter.");
        Vector<Integer> v = new Vector<Integer>();
        int i = 0;

        while (input.hasNextInt()) {
            v.addElement(input.nextInt());
            i++;
        }

        Integer mass[] = new Integer[i];
        v.copyInto(mass);
        
        String str = Arrays.toString(invertMethod(mass));
        System.out.println("invert (" + Arrays.toString(mass) + ") ==" + str);
    }

    public static int[] invertMethod(Integer[] array) {
        int[] arrayInverted = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayInverted[i] = -1 * array[i];
        }
        return arrayInverted;
    }
}
