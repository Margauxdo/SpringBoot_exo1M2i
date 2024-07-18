package org.example.springboot_exo1m2i.controller;

import org.example.springboot_exo1m2i.model.Todo;
import org.example.springboot_exo1m2i.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping("/todoList")
    public String getAllTodos(Model model) {
        List<Todo> todos = List.of();
        model.addAttribute("todos", todoService.getTodos());
        return "todos";

    }
    @RequestMapping("/todo")
    public String getTodo(Model model, Long id) {
        model.addAttribute(1);
        model.addAttribute(2);
        List<Todo> todos = List.of();
        model.addAttribute("todos", todoService.getTodos());
        return "todo";

    }



}
