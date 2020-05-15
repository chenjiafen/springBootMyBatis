package com.itheima.domain;

import com.itheima.domain.User;

import java.io.Serializable;
import java.util.List;

/**
 * ClassName:    QueryVo
 * Package:    com.itheima.vo
 * Description:
 * Datetime:    2020-01-08   21:00
 * Author:   tyler.chen
 */
public class QueryVo implements Serializable  {

    private List<Integer> ids;

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;

    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }
}
