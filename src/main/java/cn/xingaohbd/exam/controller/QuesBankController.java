package cn.xingaohbd.exam.controller;

import cn.xingaohbd.exam.model.Classify;
import cn.xingaohbd.exam.service.IClassifyService;
import lombok.extern.slf4j.Slf4j;
import cn.xingaohbd.exam.base.result.Result;
import cn.xingaohbd.exam.model.QuesBank;
import cn.xingaohbd.exam.service.IQuesBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@Slf4j
@RequestMapping(value = "/quesBank")
public class QuesBankController {

    @Autowired
    private IClassifyService classifyService;

    @Autowired
    private IQuesBankService quesBankService;

    /**
     * 获取所有试题
     *
     * @return
     */
    @RequestMapping(value = "/getQuesBankList")
    @ResponseBody
    public Result<List<QuesBank>> getQuestionsList() {
        return Result.success(0, "获取成功", quesBankService.allQuesBank());
    }

    @GetMapping("/add")
    public String addUsers(Model model) {
        model.addAttribute(new QuesBank());
        model.addAttribute(new Classify());
        return "questions/questions-add";
    }

    @PostMapping("/add")
    @ResponseBody
    public Result<QuesBank> saveUser( QuesBank quesBank) {
        System.out.println(quesBank);
        return quesBankService.save(quesBank);
    }
}