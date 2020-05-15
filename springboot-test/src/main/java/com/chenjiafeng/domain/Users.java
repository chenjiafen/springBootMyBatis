package com.chenjiafeng.domain;

/**
 * @author tyler.chen
 * @data 2020-01-06 17:33
 */
public class Users {
    private  Integer id;
    private String username;
    private String password;
    private String name;
    private Integer gae;
    private String  gender;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGae() {
        return gae;
    }

    public void setGae(Integer gae) {
        this.gae = gae;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", gae=" + gae +
                ", gender='" + gender + '\'' +
                '}';
    }
}

