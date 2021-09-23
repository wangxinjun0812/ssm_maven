package com.ssm.wxj.dao;

import com.ssm.wxj.entity.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Books)表数据库访问层
 *
 * @author makejava
 * @since 2021-09-09 04:45:35
 */
public interface BooksDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Books queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param books 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Books> queryAllByLimit(@Param("books")Books books, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param books 查询条件
     * @return 总行数
     */
    long count(Books books);

    /**
     * 新增数据
     *
     * @param books 实例对象
     * @return 影响行数
     */
    int insert(Books books);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Books> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Books> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Books> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Books> entities);

    /**
     * 修改数据
     *
     * @param books 实例对象
     * @return 影响行数
     */
    int update(Books books);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

