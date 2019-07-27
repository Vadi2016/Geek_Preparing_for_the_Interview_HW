package com.figure;

public class Triangle implements IFigure {

    int x1;
    int y1;

    @Override
    public void draw(int x1, int y1) {
        System.out.println("Drawing triangle");
    }

    @Override
    public void erase(int x1, int y1) {
        System.out.println("Erasing triangle");
    }
}
