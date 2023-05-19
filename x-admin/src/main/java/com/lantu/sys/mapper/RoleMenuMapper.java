package com.lantu.sys.mapper;

import com.lantu.sys.entity.RoleMenu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.catalina.LifecycleState;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author my
 * @since 2023-02-28
 */
public interface RoleMenuMapper extends BaseMapper<RoleMenu> {
    public List<Integer> getMenuIdListByRoleId(Integer roleId);
}
