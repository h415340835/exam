package cn.xingaohbd.exam.controller;

import cn.xingaohbd.exam.base.result.Result;
import cn.xingaohbd.exam.model.QuesBank;
import cn.xingaohbd.exam.service.IQuesBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/quesBank")
public class QuesBankController {

    @Autowired
    private IQuesBankService quesBankService;

    @RequestMapping(value = "/getQuesBankList")
    @ResponseBody
    public Result<List<QuesBank>> getQuestionsList(){
        return Result.success(0,"获取成功",quesBankService.allQuesBank());
    }

}
