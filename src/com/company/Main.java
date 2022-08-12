package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter the value for num: " + i);
            array[i] = sc.nextInt();}
        for (int i = 0; i < array.length; i++) {
            System.out.println("value of num " + i + " is: " + array[i]);}
        System.out.println("--------------------------------");
        int[] Array = {1, 2, 3};
        System.out.println("sum of array is: " + arraySum(Array));}
    public static int arraySum(int[] Array) {
        int sum = 0;
        for (int i = 0; i < Array.length; i++) {
            sum = sum + Array[i];}
        return sum;}}
