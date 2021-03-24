package com.company;

import java.sql.SQLOutput;
import java.util.Random;

public class Initialization {
    private static int nextActicle;
    private int article;
    String type;
    String size;
    //Dynamic Initialization block
    {
        article = nextActicle;
        nextActicle++;
        System.out.println("Created object article = " + article);
    }
    //Static Initialization block
    static {
        var firstNumber = new Random();
        nextActicle = firstNumber.nextInt(100);
        System.out.println("Numbers starts from = " + nextActicle);
    }

    public Initialization (String type, String size) {
        this.type = type;
        this.size = size;
    }

    public int getArticle() {
        return this.article;
    }
}

class Function{
    public static void main (String[] args) {
        Initialization Shirt = new Initialization("Short", "XL");
        System.out.println("Shirt article = " + Shirt.getArticle());
        Initialization Hat = new Initialization("Wide", "M");
        System.out.println("Hat article = " + Hat.getArticle());
    }
}
