package com.manage.mapper.student;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.manage.entity.StuCommunity;
import com.manage.mapper.BaseMapper;

public interface StuCommunityMapper extends BaseMapper<StuCommunity>{
    
    /**
     * 当删除社团时,自动解除社团和学生的关系
     * 通过社团的id解除关系
     * @param communities
     */
    void deleteByCommids(@Param("ids") List<Integer> communities);
    
}
