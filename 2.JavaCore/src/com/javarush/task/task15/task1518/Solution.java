package com.javarush.task.task15.task1518;

/* 
Статики 3
*/

public class Solution {
    public static Cat cat;



        static {
            Cat myCat = new Cat();
            cat = myCat;

            System.out.println(cat.name);
        }
        public static class Cat{
            public  String name = "Tom";
    }

    public static void main(String[] args) {

    }
}
