package com.lauselfstudy.selfstudyquestion.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lauselfstudy.selfstudyquestion.question.entity.QmsTypeEntity;
import com.lauselfstudy.selfstudyquestion.question.service.QmsTypeService;
import com.lauselfstudy.common.utils.PageUtils;
import com.lauselfstudy.common.utils.R;



/**
 * 题目-题目类型表
 *
 * @author lauyoo
 * @email lauyoo@163.com
 * @date 2021-03-06 22:45:19
 */
@RestController
@RequestMapping("question/qmstype")
public class QmsTypeController {
    @Autowired
    private QmsTypeService qmsTypeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("question:qmstype:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = qmsTypeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("question:qmstype:info")
    public R info(@PathVariable("id") Long id){
		QmsTypeEntity qmsType = qmsTypeService.getById(id);

        return R.ok().put("qmsType", qmsType);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("question:qmstype:save")
    public R save(@RequestBody QmsTypeEntity qmsType){
		qmsTypeService.save(qmsType);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("question:qmstype:update")
    public R update(@RequestBody QmsTypeEntity qmsType){
		qmsTypeService.updateById(qmsType);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("question:qmstype:delete")
    public R delete(@RequestBody Long[] ids){
		qmsTypeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
