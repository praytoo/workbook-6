package com.pluralsight.workshops;

public class Turtle {
        public void move(double distance) {
            System.out.println("Turtle moves " + distance);
        }

        public void turn(double angle) {
            System.out.println("Turtle turns " + angle + " degrees");
        }

        public void setColor(java.awt.Color color) {
            System.out.println("Turtle color set to " + color);
        }

        public void setPosition(java.awt.Point p) {
            System.out.println("Turtle moves to " + p);
        }
    }

