package com.priyank.spring.bridge;

public class BridgeDemo {

    public static void main(String[] args) {
        Shape greenSquare = new Square(new Blue());

        Shape redCircle = new Circle(new Red());

        greenSquare.applyColor();
        redCircle.applyColor();
    }
}
