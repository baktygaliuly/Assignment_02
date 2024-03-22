package org.example.app.service;

import org.example.app.pojo.Book;
import org.example.app.pojo.Item;
import org.example.app.repo.ItemRepository;

public class BookService implements ItemService {
    private ItemRepository repository;

    public BookService(ItemRepository repository) {
        this.repository = repository;
    }
    public void createItem(Book item) {
        this.repository.createItem(item);
    }

    public Book retrieveItem(String id) {
        return (Book) this.repository.retrieveItem(id);
    }

    public void update(Item item) {
        this.repository.update(item);
    }

    public void removeItem(String id) {
        this.repository.removeItem(id);
    }

}
