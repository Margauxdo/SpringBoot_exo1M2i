package org.example.springboot_exo1m2i.service;

import org.example.springboot_exo1m2i.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    private List<Todo> todos;
    public TodoService() {
        todos = new ArrayList<>();
        todos.add(new Todo(1,"course","LSLCLLMCslm",false ));
        todos.add(new Todo(2,"employed","LSLCLLMCslm",true ));
        todos.add(new Todo(3,"sport","LSLCLLMCslm",true ));
        todos.add(new Todo(4,"action","LSLCLLMCslm",false ));
    }

    public List<Todo> getTodos() {
        return todos;
    }

    public  Todo getTodoById(int id) {
        for (Todo todo : todos) {
            if (todo.getId() == id) {
                return todo;
            }
        }
        return null;
    }
}
