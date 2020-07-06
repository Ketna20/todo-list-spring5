package spring.mvc.model;
/*
 * ketnakhalasi created on 7/4/20
 * */

import lombok.NonNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class TodoData {
    private static int idValue = 1;

    private final List<TodoItem> items = new ArrayList<>();

    // Constructor
    public TodoData() {
        addItem(new TodoItem("first", "first To do", LocalDate.now()));
        addItem(new TodoItem("second", "second To do", LocalDate.now()));
        addItem(new TodoItem("Third", "Third To do", LocalDate.now()));
        addItem(new TodoItem("Fourth", "Fourth To do", LocalDate.now()));
    }

    public List<TodoItem> getItems() {
        return Collections.unmodifiableList(items);
    }

    public void addItem(@NonNull TodoItem toAdd) {
        toAdd.setId(idValue);
        items.add(toAdd);
        idValue++;
    }

    public void removeItem(@NonNull int id){
        ListIterator<TodoItem> itemIterator = items.listIterator();

        while(itemIterator.hasNext()) {
            TodoItem item = itemIterator.next();

            if(item.getId() == id) {
                itemIterator.remove();
                break;
            }
        }
    }

    public TodoItem getItem(int id) {
        for(TodoItem item : items) {
            if(item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void updateItem(@NonNull TodoItem toUpdate) {
        ListIterator<TodoItem> itemIterator = items.listIterator();

        while (itemIterator.hasNext()) {
            TodoItem item = itemIterator.next();

            if(item.equals(toUpdate)) {
                itemIterator.set(toUpdate);
                break;
            }
        }
    }
}
