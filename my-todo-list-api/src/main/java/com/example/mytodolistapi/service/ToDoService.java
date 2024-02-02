package com.example.mytodolistapi.service;

import com.example.mytodolistapi.model.ToDo;

import java.util.List;

public interface ToDoService {

    ToDo getToDo(long id);

    List<ToDo> getToDos();

    ToDo addToDo(String description);

    void deleteToDo(long id);

    void updateToDo(long id, boolean completed);
}