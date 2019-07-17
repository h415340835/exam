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



    @Override
    public Result addQuesBankList(String filePath) {
//        ExcelParse excelToMysql = new ExcelParse();
//        try {
//            List<QuesBank> listQuesBank = excelToMysql.parse(filePath);
//            for (QuesBank q:
//                 listQuesBank) {
//                System.out.println("-----"+q);
//            }
//            System.out.println(listQuesBank);
//        } catch (IOException e) {
//            e.printStackTrace();
//            return Result.failure();
//        }
        return Result.success();
    }

    @Override
    public Result saveList(List<QuesBank> listQuesBank) {
        try {
            for (QuesBank quesBank:
                    listQuesBank) {
                quesBankRepository.save(quesBank);
            }
        }catch (Exception e){
            return Result.failure();
        }
        return Result.success();
    }
}
