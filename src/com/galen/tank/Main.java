package com.galen.tank;

public class Main {
    public static void main(String[] args) throws Exception {
        TankFrame tf = new TankFrame();
        for (int i = 0; i < 5; i++) {
            tf.tanks.add(new Tank(50 + i * 80, 200, Dir.DOWN, Group.BAD, tf));
        }
        while (true) {
            Thread.sleep(10);
            tf.repaint();
        }
    }
}
