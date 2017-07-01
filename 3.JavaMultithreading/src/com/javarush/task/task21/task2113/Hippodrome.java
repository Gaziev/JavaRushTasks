package com.javarush.task.task21.task2113;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 28.03.2017.
 */
public class Hippodrome {

    public  static Hippodrome game;
    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    private static  List<Horse> horses  = new ArrayList<Horse>() ;

     public void run() throws InterruptedException {
        for(int i =0 ; i < 100; i++ ){
            move();
            print();
            Thread.sleep(200);
        }
    }
   public  void move(){
        for (Horse h : horses) {
            h.move();
        }
    }
   public  void  print(){
        for (Horse h : horses) {
            h.print();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
    public Horse getWinner() {
        Horse winner = horses.get(0);
        for(Horse h : getHorses()){
            if(h.getDistance() > winner.getDistance()){
            winner = h;
            }
        }
        return winner;
    }

    public  void printWinner(){
        System.out.println ("Winner is " + getWinner().getName() + "!");
    }



    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome(new ArrayList<>());
        game.horses.add(new Horse("Horse1", 3, 0));
        game.horses.add(new Horse("Horse2", 3, 0));
        game.horses.add(new Horse("Horse3", 3, 0));
        game.run();
        game.printWinner();
    }
}
