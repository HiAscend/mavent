package cn.edu.zua.mavent;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * Student
 *
 * @author ascend
 * @date 2017/12/5 16:59.
 */
public class Student {
    private String userId;
    private String username;
    private int age;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
