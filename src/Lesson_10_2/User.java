package Lesson_10_2;

import java.util.Arrays;

public class User implements Cloneable {
    private int id;
    private String name;
    private String[] email;

    public User(int id, String name, String[] email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String[] getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String[] email) {
        this.email = email;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public User deepClone() throws CloneNotSupportedException {
        User cloned = (User) super.clone();
        cloned.email = new String[this.email.length];
        cloned.email = this.email.clone();
        return cloned;
    }

    @Override
    public String toString() {
        return "User{id=" + id + ", name='" + name + "', emails=" + Arrays.toString(email) + "}";
    }
}