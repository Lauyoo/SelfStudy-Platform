package com.lauselfstudy.selfstudyquestion.dao;

import com.lauselfstudy.selfstudyquestion.question.entity.QmsTypeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 题目-题目类型表
 * 
 * @author lauyoo
 * @email lauyoo@163.com
 * @date 2021-03-06 22:45:19
 */
@Mapper
public interface QmsTypeDao extends BaseMapper<QmsTypeEntity> {
	
}
