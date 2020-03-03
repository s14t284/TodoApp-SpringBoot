package work.rikeda.todo.forms;

import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

public class TodoForm implements Serializable {

  @NotNull
  @Size(min=1, max=100)
  private String task;

  @NotNull
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date rimitDate;

  public String getTask() {
    return task;
  }

  public Date getRimitDate() {
    return rimitDate;
  }

  public void setTask(String task) {
    this.task = task;
  }

  public void setRimitDate(Date rimitDate) {
    this.rimitDate = rimitDate;
  }
}
