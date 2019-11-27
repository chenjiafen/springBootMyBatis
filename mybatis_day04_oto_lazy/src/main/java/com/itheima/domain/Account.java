package com.itheima.domain;

/**
 * @author tyler.chen
 * @date 2019/11/27 23:00
 */
public class Account {
   private  Integer id;
   private String name;
   private Float money;
   private Integer u_id;

    //一个账户对应一个用户对象
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getMonkey() {
        return money;
    }

    public void setMonkey(Float monkey) {
        this.money = money;
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", monkey=" + money +
                ", u_id=" + u_id +
                ", user=" + user +
                '}';
    }
}
