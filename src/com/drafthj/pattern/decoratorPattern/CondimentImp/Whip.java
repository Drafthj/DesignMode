package com.drafthj.pattern.decoratorPattern.CondimentImp;

import com.drafthj.pattern.decoratorPattern.Beverage;
import com.drafthj.pattern.decoratorPattern.CondimentDecorator;

/**
 * Created by huojia on 2016/3/4 10:12.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    public int getSize(){
        return beverage.getSize();
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+",whip";
    }

    @Override
    public double cost() {
        return 0.5 + beverage.cost();
    }
}
