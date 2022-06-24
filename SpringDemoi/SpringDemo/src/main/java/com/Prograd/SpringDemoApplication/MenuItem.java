package com.Prograd.SpringDemoApplication;

public class MenuItem {
    private int i;
    private String color;
    public MenuItem(int i, String color)
    {
        this.i=i;
        this.color=color;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getI() {
        return i;
    }

    public String getColor() {
        return color;
    }
}
