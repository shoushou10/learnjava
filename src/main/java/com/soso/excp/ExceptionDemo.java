package com.soso.excp;

public class ExceptionDemo {
    public double div(int m,int n) throws ArithmeticException{
        return m/n;
    }

    public  static void main(String[] agr){
        try {
            System.out.println("1/2=" + new ExceptionDemo().div(1,0));
        } catch (Exception e){
            System.out.println("get you:" + e.getMessage());
            e.printStackTrace();
        }
    }
}
