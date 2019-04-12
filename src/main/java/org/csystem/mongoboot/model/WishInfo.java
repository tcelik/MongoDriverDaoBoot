package org.csystem.mongoboot.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "wishs")
public class WishInfo {
    private String todo;

    public WishInfo()
    {

    }

    public WishInfo(String todo)
    {
        this.todo = todo;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    @Override
    public String toString() {
        return "WishInfo{" +
                "todo='" + todo + '\'' +
                '}';
    }
}
