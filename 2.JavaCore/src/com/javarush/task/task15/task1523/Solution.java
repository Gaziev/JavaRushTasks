package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    public Solution(int a) {}
   // public Solution(int a, int b) {}
   // public Solution(String s, int a, int b) {}
    protected Solution(Integer a) {}
   // protected Solution(String s) {}
   // protected Solution(Double d) {}
    private Solution(float f) {}
   // private Solution(double d) {}
   // private Solution(short s) {}
    Solution(Object o) {}
   // Solution(float f, double d) {}
   // Solution(String s, int i) {}
}

