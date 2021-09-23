package com.ssm.wxj.controller;

import com.ssm.wxj.entity.Books;
import com.ssm.wxj.service.BooksService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Books)表控制层
 *
 * @author xp
 * @since 2021-09-22 22:06:36
 */
@RestController
@RequestMapping("books")
public class BooksController {
    /**
     * 服务对象
     */
    @Resource
    private BooksService booksService;

    /**
     * 分页查询
     *
     * @param books 筛选条件
     * @return 查询结果
     */
    @GetMapping("queryByPage")
    public ResponseEntity<Page<Books>> queryByPage(@RequestBody Books books) {
        return ResponseEntity.ok(this.booksService.queryByPage(books, PageRequest.of(books.getPage(),books.getSize())));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("queryById/{id}")
    public ResponseEntity<Books> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.booksService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param books 实体
     * @return 新增结果
     */
    @PostMapping("add")
    public ResponseEntity<Books> add(@RequestBody Books books) {
        return ResponseEntity.ok(this.booksService.insert(books));
    }

    /**
     * 编辑数据
     *
     * @param books 实体
     * @return 编辑结果
     */
    @PutMapping("edit")
    public ResponseEntity<Books> edit(@RequestBody Books books) {
        return ResponseEntity.ok(this.booksService.update(books));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("deleteById")
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.booksService.deleteById(id));
    }

}

