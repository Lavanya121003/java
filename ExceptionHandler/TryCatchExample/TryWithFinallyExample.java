package com.xworkz.ExceptionHandler.TryCatchExample;

public class TryWithFinallyExample {
    public static void main(String[] args) {
        try{
            int [] numbers={1,2,3};
            System.out.println(numbers[3]);
        }finally{
            System.out.println("finally executes always");
        }
    }
}
