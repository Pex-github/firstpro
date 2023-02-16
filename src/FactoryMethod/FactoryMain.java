package FactoryMethod;

import FactoryMethod.framework.Factory;
import FactoryMethod.framework.Produce;
import FactoryMethod.idcard.IdcardFactory;

public class FactoryMain {
    public static void main(String[] args) {
        Factory factory = new IdcardFactory();
        Produce p = factory.create("小明");
        Produce p1 = factory.create("小红");
        Produce p2 = factory.create("小刚");
        p.use();
        p1.use();
        p2.use();
    }
}
