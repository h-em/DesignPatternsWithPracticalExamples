package builder;

import java.util.Iterator;

public abstract class Burger implements Item {

    public Packing packing(){
        return  new Wrapper();
    }
    public abstract float price();
}
