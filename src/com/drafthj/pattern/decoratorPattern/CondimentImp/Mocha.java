package com.drafthj.pattern.decoratorPattern.CondimentImp;

import com.drafthj.pattern.decoratorPattern.Beverage;
import com.drafthj.pattern.decoratorPattern.CondimentDecorator;

/**
 * Created by huojia on 2016/3/4 10:01.
 */
public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(){}
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    public int getSize(){
        return beverage.getSize();
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+",mocha";
    }

    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }
}
