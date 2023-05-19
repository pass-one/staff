package com.lantu.sys.service;

import com.lantu.sys.entity.Menu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author my
 * @since 2023-02-28
 */
public interface IMenuService extends IService<Menu> {

    List<Menu> getAllMenu();
    List<Menu> getMenuListByUserId(Integer userId);
}
