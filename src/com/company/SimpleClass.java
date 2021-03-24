package com.company;


public class SimpleClass {

    double firstField;
    double secondField;
    double thirdField;

    public SimpleClass(double firstField, double secondField, double thirdField) {
        this.firstField = firstField;
        this.secondField = secondField;
        this.thirdField = thirdField;
    }
        public double fieldSum(){
            return this.firstField + 10 + 10;
        }
    }
class Test {
       public static void main (String[] args){
            SimpleClass example = new SimpleClass(10, 14, 23);
            System.out.println(example.fieldSum());
        }
}


