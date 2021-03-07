package com.lauselfstudy.selfstudyquestion.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lauselfstudy.selfstudycommon.utils.PageUtils;
import com.lauselfstudy.selfstudycommon.utils.PageUtils;
import com.lauselfstudy.selfstudyquestion.entity.QmsTypeEntity;

import java.util.Map;

/**
 * 题目-题目类型表
 *
 * @author lauyoo
 * @email lauyoo@163.com
 * @date 2021-03-06 22:45:19
 */
public interface QmsTypeService extends IService<QmsTypeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

