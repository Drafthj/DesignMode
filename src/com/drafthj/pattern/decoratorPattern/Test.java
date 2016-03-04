package com.drafthj.pattern.decoratorPattern;

import com.drafthj.pattern.decoratorPattern.BeverageImp.Espresso;
import com.drafthj.pattern.decoratorPattern.CondimentImp.Mocha;
import com.drafthj.pattern.decoratorPattern.CondimentImp.Soy;

/**
 * Created by huojia on 2016/3/4 10:05.
 */
public class Test {
    public static void main(String[] args) {
        Espresso espresso = new Espresso();
        Espresso espresso2 = new Espresso();
        Espresso espresso3 = new Espresso();
        espresso.setSize(Beverage.LARGE);
        espresso2.setSize(Beverage.MIDDLE);
        espresso3.setSize(Beverage.SMALL);
        Beverage b = new Soy(new Mocha(espresso));
        Beverage b2 = new Soy(new Mocha(espresso2));
        Beverage b3 = new Soy(new Mocha(espresso3));
        System.out.println("cost:" + b.cost() + ",description:" + b.getDescription());
        System.out.println("cost:" + b2.cost() + ",description:" + b2.getDescription());
        System.out.println("cost:" + b3.cost() + ",description:" + b3.getDescription());
    }
}
