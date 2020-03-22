package com.company;

public class CalculatorWithOperator {

        int sum (int a,int b){
            int q = a + b;
            return q;
        }
        int sub (int a,int b){
            int w = a - b;
            return w;
        }
        double div (int a,int b){
          int e = a / b;
          return e;
        }
        int mul (int a,int b){
            int r = a * b;
            return r;
        }
        int step (int a,int b){
            int t=1;
            for (int i = 0; i < b; i++) {
              t = t * a;
            }
            return t;
        }
         double abs(double a){
            double y = Math.abs(a);
            return y;
           }
         double kor(double a){
            double o = Math.sqrt(a);
            return o;
           }



}
