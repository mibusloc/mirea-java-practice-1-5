package ru.mirea.lab2.shop4;

import java.util.ArrayList;
import java.util.Stack;

public class Shop {
    private ArrayList<PC> pcs;
    private Stack<Integer> deleted;
    private int size;

    public Shop() {
        this.pcs = new ArrayList<PC>();
        this.deleted = new Stack<Integer>();
        this.size = 0;
    }

    public int add(String name, float price) {
        size++;
        if (!deleted.isEmpty()) {
            int id = deleted.pop();
            pcs.set(id, new PC(name, price));
            return id;
        }
        pcs.add(new PC(name, price));
        return pcs.size() - 1;
    }

    public PC get(int id) {
        if (id >= pcs.size() || pcs.get(id) == null) {
            return null;
        }
        return new PC(pcs.get(id).getName(), pcs.get(id).getPrice());
    }

    public void removeById(int id) {
        if (id >= pcs.size()) {
            return;
        }
        size--;
        if (id == pcs.size() - 1) {
            pcs.remove(id);
        } else {
            pcs.set(id, null);
            deleted.push(id);
        }
    }

    public int getIdByName(String name) {
        for (int i = 0; i < pcs.size(); i++) {
            if (pcs.get(i) != null) {
                if (pcs.get(i).getName().equals(name)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int getIdByPrice(float price) {
        for (int i = 0; i < pcs.size(); i++) {
            if (pcs.get(i) != null) {
                if (pcs.get(i).getPrice() == price) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int getSize() {
        return size;
    }
}