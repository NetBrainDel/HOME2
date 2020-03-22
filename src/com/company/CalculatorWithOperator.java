package com.company;

import java.util.Objects;

public class CalculatorWithOperator {



        double sum (double a,double b){
            double q = a + b;
            return q;
        }
       /* int sub (int a,int b){
            int w = a - b;
            return w;
        }*/
        double div (double a,double b){
            double e = a / b;
          return e;
        }
        double mul (double a,double b){
            double r = a * b;
            return r;
        }
        double step (double a,double b){
            double t=1;
            for (int i = 0; i < b; i++) {
              t = t * a;
            }
            return t;
        }
        /* double abs(double a){
            double y = Math.abs(a);
            return y;
           }
         double kor(double a){
            double o = Math.sqrt(a);
            return o;
           }*/
}



