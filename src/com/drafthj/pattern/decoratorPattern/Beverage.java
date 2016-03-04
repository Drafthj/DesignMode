package com.drafthj.pattern.decoratorPattern;

/**
 * Created by huojia on 2016/3/4 9:41.
 *  饮料类
 */
public abstract class Beverage {
    public static final int SMALL = 1;
    public static final int MIDDLE = 2;
    public static final int LARGE = 3;
    public String description = "Unknown Beverage";
    public int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
