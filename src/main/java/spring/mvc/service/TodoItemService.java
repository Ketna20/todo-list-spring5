package spring.mvc.service;

import spring.mvc.model.TodoItem;
import spring.mvc.model.TodoData;

public interface TodoItemService {

    void addItem(TodoItem toAdd);

    void removeItem(int id);

    TodoItem getItem(int id);

    void updateItem(TodoItem toUpdate);

    TodoData getData();

}
