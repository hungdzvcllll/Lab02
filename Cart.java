import java.util.*;

public class Cart {
    private ArrayList<DigitalVideoDisc> list = new ArrayList<DigitalVideoDisc>();
    private final int quantityOrdered = 20;

    public void setList(ArrayList<DigitalVideoDisc> list) {
        this.list = list;
    }

    public ArrayList<DigitalVideoDisc> getList() {
        return list;
    }

    public int getQuntityOrdered() {
        return quantityOrdered;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc d) {
        if (list.size() < getQuntityOrdered()) {
            list.add(d);
        } else
            System.out.println("Can't add more");
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc d) {
        list.remove(d);
    }

    public float totalCost() {
        float sum = 0;
        for (DigitalVideoDisc d : list) {
            sum += d.getPrice();
        }
        return sum;
    }

}