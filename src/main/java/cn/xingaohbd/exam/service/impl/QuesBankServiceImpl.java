package cn.xingaohbd.exam.service.impl;

import cn.xingaohbd.exam.base.result.Result;
import cn.xingaohbd.exam.model.QuesBank;
import cn.xingaohbd.exam.repository.QuesBankRepository;
import cn.xingaohbd.exam.service.IQuesBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class QuesBankServiceImpl implements IQuesBankService {

    @Autowired
    private QuesBankRepository quesBankRepository;

    @Override
    public List<QuesBank> allQuesBank() {
        return quesBankRepository.findAll(new Sort(Sort.Direction.DESC,"createDate"));
    }

    @Override
    public Result<QuesBank> save(QuesBank quesBank) {

        return Result.success(0,"成功",quesBankRepository.save(quesBank));
    }


}
