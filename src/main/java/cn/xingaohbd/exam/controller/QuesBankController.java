package cn.xingaohbd.exam.controller;

import cn.xingaohbd.exam.model.Classify;
import cn.xingaohbd.exam.service.IClassifyService;
import cn.xingaohbd.exam.util.ExcelFileParse;
import lombok.extern.slf4j.Slf4j;
import cn.xingaohbd.exam.base.result.Result;
import cn.xingaohbd.exam.model.QuesBank;
import cn.xingaohbd.exam.service.IQuesBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

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

    @RequestMapping(value = "/fileUploadQuesBankList")
    @ResponseBody
    public Result addFileQuesBankList(@RequestParam MultipartFile file, HttpServletRequest request) throws IOException {
        //把MultipartFile转化为File
        File fo = null;
        try {
            fo = File.createTempFile("prefix", "_" + file.getOriginalFilename());
            file.transferTo(fo);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<QuesBank> listQuesBank = ExcelFileParse.parse(fo);

        return quesBankService.saveList(listQuesBank);
    }

    @PostMapping("/add")
    @ResponseBody
    public Result<QuesBank> saveUser( QuesBank quesBank) {
        System.out.println(quesBank);
        return quesBankService.save(quesBank);
    }
}