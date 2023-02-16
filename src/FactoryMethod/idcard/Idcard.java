package FactoryMethod.idcard;

import FactoryMethod.framework.Produce;

public class Idcard extends Produce {

    private String owner;

    public Idcard(String owner) {
        this.owner = owner;
        System.out.println("制作" + owner + "的ID卡");
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡");
    }

    public String getOwner() {
        return owner;
    }
}
