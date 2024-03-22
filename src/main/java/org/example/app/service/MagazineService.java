package org.example.app.service;

import org.example.app.pojo.Item;
import org.example.app.pojo.Magazine;
import org.example.app.repo.ItemRepository;

public class MagazineService implements ItemService {
    private ItemRepository repository;

    public MagazineService(ItemRepository repository) {
        this.repository = repository;
    }
    public void createItem(Magazine item) {
        this.repository.createItem(item);
    }

    public Magazine retrieveItem(String id) {
        return (Magazine) this.repository.retrieveItem(id);
    }

    public void update(Item item) {
        this.repository.update(item);
    }

    public void removeItem(String id) {
        this.repository.removeItem(id);
    }
}
