package com.lantu.sys.mapper;

import com.lantu.sys.entity.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.lettuce.core.dynamic.annotation.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author my
 * @since 2023-02-28
 */
public interface MenuMapper extends BaseMapper<Menu> {
    public List<Menu> getMenuListByUserId(@Param("userId") Integer userId,@Param("pid") Integer pid);
}
