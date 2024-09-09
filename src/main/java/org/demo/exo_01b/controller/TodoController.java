package org.demo.exo_01b.controller;

import org.demo.exo_01b.model.Todo;
import org.demo.exo_01b.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping("/todo")
    public String todo(Model model) {
        Todo todo = todoService.getOneTodo();
        model.addAttribute("todo", todo);

        return "todoView";
    }

    @RequestMapping("/todos")
    @ResponseBody
    public List<Todo> getTodos() {
        return todoService.getAllTodos();
    }

    @RequestMapping("/")
    public String home() {
        return "home";
    }
}