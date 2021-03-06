package cz.uhk.fim.todolist.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TodoList {

    private List<TodoItem> items = new ArrayList<>();

    public void add(TodoItem item) {
        items.add(item);
    }

    public TodoItem get(int index) {
        return items.get(index);
    }

    public int getItemCount() {
        return items.size();
    }

    public void changeItemState(int index){
        TodoItem item = get(index);
        DateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        item.setComplete(!item.isComplete());
        item.setDateTime((item.isComplete())? format.format(new Date()) : "");
    }
}
