package com.tensquare.base.dao;


import com.tensquare.base.pojo.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 标签数据库访问接口
 */
//JpaRepository提供基本的增删改查
//JpaSpecificationExecutor 用于复杂的条件查询
public interface LabelDao extends JpaRepository<Label,String> , JpaSpecificationExecutor<Label> {
}
