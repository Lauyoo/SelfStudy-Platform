package com.lauselfstudy.selfstudyquestion.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lauselfstudy.selfstudycommon.utils.PageUtils;
import com.lauselfstudy.selfstudycommon.utils.Query;

import com.lauselfstudy.selfstudyquestion.dao.QmsQuestionDao;
import com.lauselfstudy.selfstudyquestion.entity.QmsQuestionEntity;
import com.lauselfstudy.selfstudyquestion.service.QmsQuestionService;


@Service("qmsQuestionService")
public class QmsQuestionServiceImpl extends ServiceImpl<QmsQuestionDao, QmsQuestionEntity> implements QmsQuestionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QmsQuestionEntity> page = this.page(
                new Query<QmsQuestionEntity>().getPage(params),
                new QueryWrapper<QmsQuestionEntity>()
        );

        return new PageUtils(page);
    }

}