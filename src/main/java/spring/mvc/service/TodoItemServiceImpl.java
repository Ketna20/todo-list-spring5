package spring.mvc.service;
/*
 * ketnakhalasi created on 7/5/20
 * */

import lombok.Getter;
import org.springframework.stereotype.Service;
import spring.mvc.model.TodoItem;
import spring.mvc.model.TodoData;

@Service
public class TodoItemServiceImpl implements TodoItemService{

    @Getter
    private final TodoData data = new TodoData();

    @Override
    public void addItem(TodoItem toAdd) {
        data.addItem(toAdd);
    }

    @Override
    public void removeItem(int id) {
        data.removeItem(id);
    }

    @Override
    public TodoItem getItem(int id) {
        return data.getItem(id);
    }

    @Override
    public void updateItem(TodoItem toUpdate) {
        data.updateItem(toUpdate);
    }

}
