package com.javarush.task.task14.task1414;

/* 
MovieFactory
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        ArrayList<String> list = new ArrayList<>();
        while(true){
            str = reader.readLine();
            Movie movie = MovieFactory.getMovie(str);



         //Для каждой введенной строки необходимо вызвать метод MovieFactory.getMovie.
            if(str.equals("cartoon") || str.equals("thriller") || str.equals("soapOpera")){
                System.out.println(movie.getClass().getSimpleName());
                //ввести с консоли несколько ключей (строк), пункт 7
            }else{ break;}
        }

        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */
        Movie movie;
        for (String s : list){
             movie = MovieFactory.getMovie(s);
            System.out.println(movie.getClass().getSimpleName());
        }

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }

            if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }//напишите тут ваш код, пункты 5,6
            if ("thriller".equals(key)) {
                movie = new Thriller();
            }

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {

    }
    static class Thriller extends Movie  {

    }// /Напишите тут ваши классы, пункт 3
}
