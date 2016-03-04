package com.drafthj.pattern.decoratorPattern.BeverageImp;

import com.drafthj.pattern.decoratorPattern.Beverage;

/**
 * Created by huojia on 2016/3/4 9:51.
 */
public class Espresso extends Beverage {
    public Espresso(){
        description = "Espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
