package com.galen.tank;

public class Main {
    public static void main(String[] args) throws Exception {
        TankFrame tf = new TankFrame();
        while (true) {
            Thread.sleep(10);
            tf.repaint();
        }
    }
}
