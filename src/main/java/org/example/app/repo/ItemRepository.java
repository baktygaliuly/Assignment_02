package org.example.app.repo;

import org.example.app.pojo.Book;
import org.example.app.pojo.CD;
import org.example.app.pojo.Item;

import java.util.HashMap;
import java.util.Map;

public class ItemRepository {
    private Map<String, Item> datastore = new HashMap<>();

    public void createItem(Item item) {
        this.datastore.put(item.getId(), item.clone());
    }

    public Item retrieveItem(String id) {
        return datastore.get(id).clone();
    }

    public void update(Item item) {
        this.datastore.put(item.getId(), item.clone());
    }

    public void removeItem(String id) {
        this.datastore.remove(id);
    }

    public void displayInfo() {
        for (Item item: datastore.values()) {
            if (item instanceof Book) {
                System.out.print("Book");
            } else if (item instanceof CD) {
                System.out.print("CD");
            } else {
                System.out.print("Magazine");
            }
            System.out.println(item);
        }
    }
}
