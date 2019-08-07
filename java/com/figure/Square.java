package com.figure;

public class Square implements IFigure {

    int x1;
    int y1;

    @Override
    public void draw(int x1, int y1) {
        System.out.println("Drawing square");
    }

    @Override
    public void erase(int x1, int y1) {
        System.out.println("Erasing square");
    }
}
