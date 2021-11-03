package com.NetDoc.DataBase;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CalendarData {

    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String task_text;
    private String task_name;
    // необходимо добавить указатель на дедлайн (чтобы в ячейке календаря это было видно)


    public CalendarData(long id, String task_text, String task_name) {
        this.id = id;
        this.task_text = task_text;
        this.task_name = task_name;
    }

    public CalendarData() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTask_text() {
        return task_text;
    }

    public void setTask_text(String task_text) {
        this.task_text = task_text;
    }

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }


}
