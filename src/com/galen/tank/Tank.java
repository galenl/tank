package com.galen.tank;

import java.awt.*;

public class Tank {
    private int x;
    private int y;
    private Dir dir;
    private static final int SPEED = 10;
    private static final int WIDTH = 50;
    private static final int HEIGHT = 50;

     private TankFrame tankFrame;

    private boolean moving = false;

    public Tank(int x, int y, Dir dir, TankFrame tankFrame) {
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.tankFrame = tankFrame;
    }

    public void paint(Graphics g) {
        Color c = g.getColor();
        g.setColor(Color.YELLOW);
        g.fillRect(x, y, WIDTH, HEIGHT);
        g.setColor(c);
        move();
    }

    public void move() {
        if (!moving) return;

        switch (dir) {
            case LEFT:
                x -= SPEED;
                break;
            case UP:
                y -= SPEED;
                break;
            case RIGHT:
                x += SPEED;
                break;
            case DOWN:
                y += SPEED;
                break;
            default:
                break;
        }
    }

    public void setDir(Dir dir) {
        this.dir = dir;
    }

    public Dir getDir() {
        return dir;
    }

    public boolean isMoving() {
        return moving;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
    }

    public void fire() {
        tankFrame.b =  new Bullet(this.x, this.y, this.dir);
    }
}
