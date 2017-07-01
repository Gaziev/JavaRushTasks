package com.javarush.task.task14.task1413;

/**
 * Created by Admin on 19.02.2017.
 */
public class Computer
{
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;



    public Computer()
    {
        this.keyboard = new  Keyboard();
        this.mouse =   new Mouse();
        this.monitor = new  Monitor();
    }
    public Keyboard getKeyboard()
    {
        return keyboard;
    }

    public Mouse getMouse()
    {
        return mouse;
    }

    public Monitor getMonitor()
    {
        return monitor;
    }


}