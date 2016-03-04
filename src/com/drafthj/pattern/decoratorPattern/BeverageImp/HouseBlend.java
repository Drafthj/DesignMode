package com.drafthj.pattern.decoratorPattern.BeverageImp;

import com.drafthj.pattern.decoratorPattern.Beverage;

/**
 * Created by huojia on 2016/3/4 9:59.
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "HouseBlend";
    }
    @Override
    public double cost() {
        return .89;
    }
}
