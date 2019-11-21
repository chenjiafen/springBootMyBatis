package com.itheima.domain;

/**
 * @author tyler.chen
 * @date 2019/11/21 21:42
 */

/**
 * 存储参数值对象
 */
public class QueryVo {
    private User user;
    private Integer starIndex;
    private Integer pageSize;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getStarIndex() {
        return starIndex;
    }

    public void setStarIndex(Integer starIndex) {
        this.starIndex = starIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
