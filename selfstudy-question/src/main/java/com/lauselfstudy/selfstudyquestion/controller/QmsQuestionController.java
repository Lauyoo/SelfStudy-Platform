package com.lauselfstudy.selfstudyquestion.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lauselfstudy.selfstudyquestion.entity.QmsQuestionEntity;
import com.lauselfstudy.selfstudyquestion.service.QmsQuestionService;
import com.lauselfstudy.selfstudycommon.utils.PageUtils;
import com.lauselfstudy.selfstudycommon.utils.R;



/**
 * 
 *
 * @author lauyoo
 * @email lauyoo@163.com
 * @date 2021-03-06 22:45:19
 */
@RestController
@RequestMapping("question/qmsquestion")
public class QmsQuestionController {
    @Autowired
    private QmsQuestionService qmsQuestionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("question:qmsquestion:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = qmsQuestionService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("question:qmsquestion:info")
    public R info(@PathVariable("id") Long id){
		QmsQuestionEntity qmsQuestion = qmsQuestionService.getById(id);

        return R.ok().put("qmsQuestion", qmsQuestion);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("question:qmsquestion:save")
    public R save(@RequestBody QmsQuestionEntity qmsQuestion){
		qmsQuestionService.save(qmsQuestion);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("question:qmsquestion:update")
    public R update(@RequestBody QmsQuestionEntity qmsQuestion){
		qmsQuestionService.updateById(qmsQuestion);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("question:qmsquestion:delete")
    public R delete(@RequestBody Long[] ids){
		qmsQuestionService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
