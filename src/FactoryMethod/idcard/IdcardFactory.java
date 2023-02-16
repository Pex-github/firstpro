package FactoryMethod.idcard;

import FactoryMethod.framework.Factory;
import FactoryMethod.framework.Produce;

import java.util.ArrayList;
import java.util.List;

public class IdcardFactory extends Factory {

    private List<String> owners = new ArrayList<String>();

    @Override
    public Produce createProduce(String owner) {
        return new Idcard(owner);
    }

    @Override
    public void registerProduce(Produce p) {
        owners.add(((Idcard) p).getOwner());
    }
}
