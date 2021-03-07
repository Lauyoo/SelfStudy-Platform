package com.lauselfstudy.selfstudyquestion.service.impl;

import com.lauselfstudy.selfstudyquestion.dao.QmsTypeDao;
import com.lauselfstudy.selfstudycommon.utils.PageUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lauselfstudy.selfstudycommon.utils.Query;

import com.lauselfstudy.selfstudyquestion.entity.QmsTypeEntity;
import com.lauselfstudy.selfstudyquestion.service.QmsTypeService;


@Service("qmsTypeService")
public class QmsTypeServiceImpl extends ServiceImpl<QmsTypeDao, QmsTypeEntity> implements QmsTypeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QmsTypeEntity> page = this.page(
                new Query<QmsTypeEntity>().getPage(params),
                new QueryWrapper<QmsTypeEntity>()
        );

        return new PageUtils(page);
    }

}