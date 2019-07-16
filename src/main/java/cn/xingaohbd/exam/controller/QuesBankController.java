package cn.xingaohbd.exam.controller;

import lombok.extern.slf4j.Slf4j;
import cn.xingaohbd.exam.base.result.Result;
import cn.xingaohbd.exam.model.QuesBank;
import cn.xingaohbd.exam.service.IQuesBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Slf4j
@RequestMapping(value = "/quesBank")
public class QuesBankController {

    @Autowired
    private IQuesBankService quesBankService;

    /**
     * 获取所有试题
     * @return
     */
    @RequestMapping(value = "/getQuesBankList")
    @ResponseBody
    public Result<List<QuesBank>> getQuestionsList(){
        return Result.success(0,"获取成功",quesBankService.allQuesBank());
    }

}
