package com.ssm.wxj.entity;

import java.io.Serializable;

/**
 * (Books)实体类
 *
 * @author makejava
 * @since 2021-09-22 21:56:34
 */
public class Books implements Serializable {
    private static final long serialVersionUID = 523526136885141865L;
    
    private Integer id;
    
    private String name;
    
    private Integer price;

    //分页字段
    private Integer page;
    private Integer size;


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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    //分页字段
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}

