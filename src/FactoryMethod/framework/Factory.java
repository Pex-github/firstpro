package FactoryMethod.framework;

public abstract class Factory {
    public final Produce create(String owner) {
        Produce produce = createProduce(owner);
        registerProduce(produce);
        return produce;
    }

    ;

    public abstract Produce createProduce(String produce);

    public abstract void registerProduce(Produce p);
}
