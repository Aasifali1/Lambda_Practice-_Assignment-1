package com.knoldus.kup;

public class FindMaxNumber {
    public static void main(String[] args) {

//       writing lambda for the requirement
        MaxNumbers maxNumbers = ((num1, num2) ->(num1>num2)?num1:(num1<num2)?num2:0);

//        Calling the function
      int max = maxNumbers.findMax(3,12);
      System.out.println(max);
    }
}
