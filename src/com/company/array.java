package com.company;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayToFindElement = {1,2,3,4};
        System.out.println("the element index is: "+searchForItemInArray(arrayToFindElement,2));
    }
public static int searchForItemInArray(int [] array, int num){
    for (int i = 0; i < array.length; i++) {
        System.out.println("Array index: " + i + " and its element is: " + array[i]);
        System.out.println("num is: " + num);
        if (array[i] == num) {
            System.out.println("founded");
            return i;
        }
    }
            return -1;
}}