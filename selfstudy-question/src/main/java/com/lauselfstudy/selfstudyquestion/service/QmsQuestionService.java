package com.lauselfstudy.selfstudyquestion.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lauselfstudy.selfstudycommon.utils.PageUtils;
import com.lauselfstudy.selfstudyquestion.entity.QmsQuestionEntity;

import java.util.Map;

/**
 * 
 *
 * @author lauyoo
 * @email lauyoo@163.com
 * @date 2021-03-06 22:45:19
 */
public interface QmsQuestionService extends IService<QmsQuestionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

