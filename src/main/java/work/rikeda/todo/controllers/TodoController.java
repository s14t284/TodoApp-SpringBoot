package work.rikeda.todo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import work.rikeda.todo.domains.Todo;
import work.rikeda.todo.forms.TodoForm;
import work.rikeda.todo.mappers.TodoMapper;

@Controller
public class TodoController {

  private final TodoMapper todoMapper;

  @Autowired
  TodoController(TodoMapper todoMapper) {
    this.todoMapper = todoMapper;
  }

  @GetMapping("/")
  public String index(Model model) {
    List<Todo> todos = todoMapper.getAll();
    model.addAttribute("todos", todos);
    return "index";
  }

  @GetMapping("/add")
  public String showAddForm(Model model) {
    model.addAttribute("todoForm", new TodoForm());
    return "add";
  }

  @PostMapping("/api/add")
  public String add(@ModelAttribute TodoForm todoForm) {
    Todo todo = new Todo(todoForm.getTask(), todoForm.getRimitDate());
    todoMapper.addTodo(todo);
    return "redirect:/";
  }

  @PostMapping("/api/complete/{id}")
  public String complete(@PathVariable int id) {
    todoMapper.completeTodo(id);
    return "redirect:/";
  }

}
