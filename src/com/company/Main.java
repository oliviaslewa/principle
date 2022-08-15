package com.company;
public class Main {
    public static void main(String[] args) {
        int[] minimumElementInArray= {29,6,3,9,21};
        System.out.println(minimumNumForArray(minimumElementInArray));}
public static int minimumNumForArray(int[] min){
int minimumElement=min[0];
    for (int i = 0; i < min.length; i++) {
        if (min[i]<minimumElement){
minimumElement=min[i];

        }}return minimumElement;}}