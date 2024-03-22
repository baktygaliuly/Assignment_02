package org.example.app.service;

import org.example.app.pojo.CD;
import org.example.app.pojo.Item;
import org.example.app.repo.ItemRepository;

public class CDService implements ItemService {

    private ItemRepository repository;

    public CDService(ItemRepository repository) {
        this.repository = repository;
    }
    public void createItem(CD item) {
        this.repository.createItem(item);
    }

    public CD retrieveItem(String id) {
        return (CD) this.repository.retrieveItem(id);
    }

    public void update(Item item) {
        this.repository.update(item);
    }

    public void removeItem(String id) {
        this.repository.removeItem(id);
    }
}
