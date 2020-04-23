package OfficeHours.Practice_04_22_2020;

import java.util.Arrays;

public class return_method2 {

    public static int secondMaxNum(int[] arr){

        Arrays.sort(arr);

        int maxsecondnum =arr[arr.length-2];

        return maxsecondnum;

    }

    public static void main(String[] args) {
        int[] arr ={30,60,70,53,87,56,34};

        int num = secondMaxNum(arr);

        System.out.println(num);
    }




















}
