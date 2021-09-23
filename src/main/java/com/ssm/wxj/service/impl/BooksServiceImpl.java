package com.ssm.wxj.service.impl;

import com.ssm.wxj.entity.Books;
import com.ssm.wxj.dao.BooksDao;
import com.ssm.wxj.service.BooksService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Books)表服务实现类
 *
 * @author makejava
 * @since 2021-09-09 04:45:35
 */
@Service("booksService")
public class BooksServiceImpl implements BooksService {
    @Resource
    private BooksDao booksDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Books queryById(Integer id) {
        return this.booksDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param books 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Books> queryByPage(Books books, PageRequest pageRequest) {
        long total = this.booksDao.count(books);
        return new PageImpl<>(this.booksDao.queryAllByLimit(books, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param books 实例对象
     * @return 实例对象
     */
    @Override
    public Books insert(Books books) {
        this.booksDao.insert(books);
        return books;
    }

    /**
     * 修改数据
     *
     * @param books 实例对象
     * @return 实例对象
     */
    @Override
    public Books update(Books books) {
        this.booksDao.update(books);
        return this.queryById(books.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.booksDao.deleteById(id) > 0;
    }
}
