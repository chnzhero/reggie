package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.dto.SetmealDto;
import com.itheima.reggie.entity.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {

    //新增套餐 同时保存套餐和菜品的关联关系
    void saveWithDish(SetmealDto setmealDto);

    //删除套餐以及关联的菜品数据
    void removeWithDish(List<Long> ids);
}
