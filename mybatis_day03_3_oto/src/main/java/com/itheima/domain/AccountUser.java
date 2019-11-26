package com.itheima.domain;

/**
 * @author tyler.chen
 * @date 2019/11/26 21:02
 */

/**
 * 继承了Account，就拥有了Account中所有属性
 * 要显示所有信息，把User的属性都拿过来
 */
public class AccountUser extends Account {
    private Integer uid;
    private String username;
    private String password;
    private String name;
    private String birthday;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
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

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "AccountUser{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                "} " + super.toString();
    }
}
