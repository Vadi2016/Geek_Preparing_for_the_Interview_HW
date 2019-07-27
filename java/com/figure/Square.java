package com.figure;

public class Square implements IFigure {

    int x;
    int y;

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing square");
    }

    @Override
    public void erase(int x, int y) {
        System.out.println("Erasing square");
    }
}
