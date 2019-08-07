package com.figure;

public class Circle implements IFigure {

    int x1;
    int y1;


    @Override
    public void erase(int x1, int y1) {
        System.out.println("Erasing circle");
    }

    @Override
    public void draw(int x1, int y1) {

    }
}
