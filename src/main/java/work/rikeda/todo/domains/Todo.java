package work.rikeda.todo.domains;

import java.util.Date;

public class Todo {
  private int id;
  private String task;
  private boolean state;
  private Date rimitDate;

  public Todo(int id, String task, boolean state, Date rimitDate) {
    this.id = id;
    this.task = task;
    this.state = false;
    this.rimitDate = rimitDate;
  }

  public Todo(String task, Date rimitDate) {
    this.task = task;
    this.state = false;
    this.rimitDate = rimitDate;
  }

  public Todo(String task, boolean state, Date rimitDate) {
    this.task = task;
    this.state = state;
    this.rimitDate = rimitDate;
  }

  public int getId() {
    return id;
  }

  public String getTask() {
    return task;
  }

  public boolean isState() {
    return state;
  }

  public Date getRimitDate() {
    return rimitDate;
  }

  public void setTask(String task) {
    this.task = task;
  }

  public void setState(boolean state) {
    this.state = state;
  }

  public void setRimitDate(Date rimitDate) {
    this.rimitDate = rimitDate;
  }
}
