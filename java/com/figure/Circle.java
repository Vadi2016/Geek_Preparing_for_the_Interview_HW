package com.figure;

public class Circle implements IFigure {

    int x;
    int y;


    @Override
    public void erase(int x, int y) {
        System.out.println("Erasing circle");
    }

    @Override
    public void draw(int x, int y) {

    }
}
