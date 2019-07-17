package cn.xingaohbd.exam.service;

import cn.xingaohbd.exam.base.result.Result;
import cn.xingaohbd.exam.model.QuesBank;

import java.util.List;

public interface IQuesBankService {

    public List<QuesBank> allQuesBank();

    Result<QuesBank> save(QuesBank quesBank);
}
