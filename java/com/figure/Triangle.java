package com.figure;

public class Triangle implements IFigure {

    int x;
    int y;

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing triangle");
    }

    @Override
    public void erase(int x, int y) {
        System.out.println("Erasing triangle");
    }
}
