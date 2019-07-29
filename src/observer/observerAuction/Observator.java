package observer.observerAuction;

import java.util.ArrayList;
import java.util.List;

public abstract class Observator {

    protected String name;
    protected List<Item> observedItemList;

    public Observator(String name) {
        this.name = name;
        this.observedItemList = new ArrayList<>();
    }

    public void follow(Item item) {
        observedItemList.add(item);
        item.addFolower(this);
    }

    public abstract void update(Bid bid);
}
