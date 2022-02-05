package app.cart.item;

public class Item{
    protected int id;
    protected int count;

    public Item(int id, int count) {
        this.id = id;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public int getCount() {
        return count;
    }
}
