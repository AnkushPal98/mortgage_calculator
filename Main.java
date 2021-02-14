package com.codewithankush;
//import java.util.Arrays;
import java.text.NumberFormat;
import java.util.Scanner;


// Program 1 ******************      Mortgage calculator    ***********************  //

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new  Scanner(System.in);
        float r,p,n,R,N;
        double m;
        System.out.print("Principle ($1K - $1M): ");
        p = sc.nextFloat();
        while(p < 1000 || p > 1000000) {
            System.out.println("Enter the number between 1,000 and 1,000,000 : ");
            System.out.print("Principle ($1K - $1M): ");
            p = sc.nextFloat();
            continue;
        }
        System.out.print("Annual Interest rate: ");
        r = sc.nextFloat();
        while(r < 0 || r >= 30){
            System.out.println("Enter the Annual Interest rate between 0 (exclusive) and 30 (inclusive) ");
            System.out.print("Annual Interest rate: ");
            r = sc.nextFloat();
            continue;
        }
        System.out.print("Period (Years): ");
        n = sc.nextFloat();
        while(n < 0 || n >= 30){
            System.out.println("Enter the Period (Years) between 0 (exclusive) and 30 (inclusive) ");
            System.out.print("Period (Years): ");
            n = sc.nextFloat();
            continue;
        }
        R = r/12;
        N = n*12;
        m = ((p * R * Math.pow(1+R , N)) / (Math.pow(1+R , N) - 1)) / 68.91 ;   //   $1 = Rs 68.91
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(m);
        System.out.println("Answer is: " + result);
    }
}

// Program 2 **************   merge two array in the sorted form  **************** //



//class Main {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int m ,n;
//        m = sc.nextInt();
//        n = sc.nextInt();
///*
//
////        int intArray[];    //declaring array
////        intArray = new int[20];  // allocating memory to array
////                         OR
////        int[] intArray = new int[20]; // combining both statements in one
//
//        //1. The elements in the array allocated by new will automatically be initialized to zero (for numeric types),
//        // false (for boolean), or null (for reference types).
//        //2. Obtaining an array is a two-step process. First, you must declare a variable of the desired array type.
//        // Second, you must allocate the memory that will hold the array, using new, and assign it to the array variable.
//        // Thus, in Java all arrays are dynamically allocated.
//
// */
//        int[] arr1 = new int[m];
//        int[] arr2 = new int[n];
//        int[] arr3 = new int[m+n];
//        for(int i=0;i<m;i++){
//            arr1[i] = sc.nextInt();
//        }
//        for(int i=0;i<n;i++){
//            arr2[i] = sc.nextInt();
//        }
//
//        for(int i=0;i<m;i++){
//            arr3[i] = arr1[i];
//        }
//        for(int i=0;i<n;i++){
//            arr3[m + i] = arr2[i];
//        }
//
//        Arrays.sort(arr3);
//
//        for(int i=0;i<arr3.length;i++){
//            System.out.print(arr3[i] + " ");
//        }
//    }
//}

// Program 3 ******************** Popular interview question *********************8 //
/*
class Main{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the number:  ");
        int n = sc.nextInt();
        if(n%5 == 0 && n%3 == 0) System.out.println("FIZZBUZZ");
        else if(n%5 == 0) System.out.println("FIZZ");
        else if(n%3 == 0) System.out.println("BUZZ");
        else System.out.println(n);
    }
}
*/
