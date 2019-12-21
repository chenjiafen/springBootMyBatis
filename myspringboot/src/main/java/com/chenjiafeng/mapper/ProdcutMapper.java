package com.chenjiafeng.mapper;

import com.chenjiafeng.domain.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author tyler.chen
 * @data 2019-11-20 13:35
 */

@Mapper
public interface ProdcutMapper {
    public List<Product> findAll();
}
