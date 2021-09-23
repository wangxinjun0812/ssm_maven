package com.ssm.wxj.service;

import com.ssm.wxj.entity.Books;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Books)表服务接口
 *
 * @author makejava
 * @since 2021-09-09 04:45:35
 */
public interface BooksService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Books queryById(Integer id);

    /**
     * 分页查询
     *
     * @param books 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Books> queryByPage(Books books, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param books 实例对象
     * @return 实例对象
     */
    Books insert(Books books);

    /**
     * 修改数据
     *
     * @param books 实例对象
     * @return 实例对象
     */
    Books update(Books books);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
