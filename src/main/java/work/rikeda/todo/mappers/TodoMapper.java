package work.rikeda.todo.mappers;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import work.rikeda.todo.domains.Todo;

@Mapper
public interface TodoMapper {
  public List<Todo> getAll();
  public void addTodo(Todo todo);
}
