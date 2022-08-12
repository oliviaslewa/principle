package com.company;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]array=new int[4];
        System.out.println("enter the numbers: ");
        for (int i = 0; i < array.length; i++) {
        array[i]= sc.nextInt();}
        squaredArray(array);}
            public static int[] squaredArray(int []array){
                for (int i = 0; i <4 ; i++) {
                    array[i]= array[i] * array[i];}
                for (int i = 0; i < 4; i++) {
                    System.out.println(array[i]+ " ");}
                return array;}}