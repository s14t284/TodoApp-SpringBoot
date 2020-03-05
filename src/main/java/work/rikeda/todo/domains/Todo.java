package work.rikeda.todo.domains;

import java.util.Date;

public class Todo {
  private int id;
  private String task;
  private boolean state;
  private Date limitDate;

  public Todo(int id, String task, boolean state, Date limitDate) {
    this.id = id;
    this.task = task;
    this.state = false;
    this.limitDate = limitDate;
  }

  public Todo(String task, Date limitDate) {
    this.task = task;
    this.state = false;
    this.limitDate = limitDate;
  }

  public Todo(String task, boolean state, Date limitDate) {
    this.task = task;
    this.state = state;
    this.limitDate = limitDate;
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

  public Date getLimitDate() {
    return limitDate;
  }

  public void setTask(String task) {
    this.task = task;
  }

  public void setState(boolean state) {
    this.state = state;
  }

  public void setLimitDate(Date limitDate) {
    this.limitDate = limitDate;
  }
}
