package Homework6;

public enum  Species {
    Dog(false, 4, true),
    Unicorn(true, 4, true),
    Cat(false,4,true);

    @Override
    public String toString() {
        return "Pet{canfly=" + canfly +
                ", numberOflegs=" + numberOflegs +
                ", hasFur=" + hasFur +
                "}";
    }

    private  boolean canfly;
    private int numberOflegs;
    private boolean hasFur;

    Species() {

    }

    Species(boolean canfly, int numberOflegs, boolean hasFur)
    {
        this.canfly=canfly;
        this.numberOflegs=numberOflegs;
        this.hasFur=hasFur;

    }
}
