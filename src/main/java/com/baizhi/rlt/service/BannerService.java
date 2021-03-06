package com.baizhi.rlt.service;

import com.baizhi.rlt.entity.Banner;
import com.baizhi.rlt.entity.BannerPageDto;

import java.util.List;
import java.util.Map;

public interface BannerService {
    //查所有
    List<Banner> selectAll();
    //分页查
    BannerPageDto selectPage(Integer curPage, Integer pageSize);
    //添加
    Map insert(Banner banner);
    //修改
    void update(Banner banner);
    //删除
    void delete(List ids);
    //集合添加
    void insertList(List list);

}
