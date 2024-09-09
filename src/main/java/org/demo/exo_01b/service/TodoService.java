package org.demo.exo_01b.service;

import org.demo.exo_01b.model.Todo;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TodoService {

    public Todo getOneTodo() {
        return new Todo(1L, "Todo 1", "Description 1", false);
    }

    public List<Todo> getAllTodos() {
        return Arrays.asList(
                new Todo(1L, "Todo 1", "Description 1", false),
                new Todo(2L, "Todo 2", "Description 2", true),
                new Todo(3L, "Todo 3", "Description 3", false)
        );
    }
}