package com.javarush.task.task21.task2113;

/**
 * Created by Admin on 28.03.2017.
 */
       public class Horse {

     public   String name;
     public   double speed;
      public double distance;

       public Horse(String name,double speed,double distance) {
              this.name = name;
              this.speed = speed;
              this.distance = distance;
       }

       public double getDistance() {
              return distance;
       }

       public void setDistance(double distance) {
              this.distance = distance;
       }

       public String getName() {
              return name;
       }

       public void setName(String name) {
              this.name = name;
       }

       public double getSpeed() {
              return speed;
       }

       public void setSpeed(double speed) {
              this.speed = speed;
       }

       public void move(){
           distance += speed*Math.random();
       }
       public void print(){
          int dis = (int) distance;
           String tochka = " ";
           for(int i = 0; i < dis; i++){
               tochka = tochka + ".";
           }
           System.out.println(tochka + name);
       }
}
