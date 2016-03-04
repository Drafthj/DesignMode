package com.drafthj.pattern.decoratorPattern.CondimentImp;

import com.drafthj.pattern.decoratorPattern.Beverage;
import com.drafthj.pattern.decoratorPattern.CondimentDecorator;

/**
 * Created by huojia on 2016/3/4 10:07.
 */
public class Soy extends CondimentDecorator{
    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    public int getSize(){
        return beverage.getSize();
    }
    @Override
    public double cost() {
        double addition = 0;
        switch (beverage.getSize()){
            case Beverage.SMALL:
                addition = 0.1;
                break;
            case Beverage.MIDDLE:
                addition = 0.15;
                break;
            case Beverage.LARGE:
                addition = 0.2;
                break;
        }
        return 0.3 + beverage.cost() + addition;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",soy";
    }
}
