package com.company;

public class StaticCalculatorTest {
    public static void main(String[] args) {

        StaticCalculator plusCalculator = new StaticCalculator(10, 4, "plus");
        System.out.println(plusCalculator.Calculate());
        StaticCalculator minusCalculator = new StaticCalculator(10, 4, "minus");
        System.out.println(minusCalculator.Calculate());
        StaticCalculator multiplyCalculator = new StaticCalculator(10, 4, "multiply");
        System.out.println(multiplyCalculator.Calculate());
        StaticCalculator divideCalculator = new StaticCalculator(10, 4, "divide");
        System.out.println(divideCalculator.Calculate());
        StaticCalculator zeroCalculator = new StaticCalculator(10, 0, "divide");
        System.out.println(zeroCalculator.Calculate());
        StaticCalculator nullCalculator = new StaticCalculator();
        System.out.println(nullCalculator.Calculate());
        //на последнем обьекте ошибка при обработке из-за null значения. Создал пустой конструктор как по лекции,
        //можно как-то сделать, чтобы в консоль печаталось null или текущее поведение допустимо?
    }
}
