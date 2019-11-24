package com.example.demo;
import com.sun.tools.javac.comp.Todo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<Todo, Long> {
}

