package com.itheima.reggie.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.reggie.common.R;
import com.itheima.reggie.entity.Category;
import com.itheima.reggie.service.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 分类管理
 */
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryServiceImpl service;

    @PostMapping
    public R<String> save(@RequestBody Category category){
        service.save(category);
        return R.success("新增分类成功");
    }

    @GetMapping("/page")
    public R<Page> page(int page, int pageSize){
        return service.page(page, pageSize);
    }

    @DeleteMapping
    public R<String> delete(Long ids){
        return service.delete(ids);
    }

    @PutMapping
    public R<String> update(@RequestBody Category category){
        return service.update(category);
    }

    @GetMapping("/list")
    public R<List<Category>> list(Category category){
        return service.list(category);
    }
}












