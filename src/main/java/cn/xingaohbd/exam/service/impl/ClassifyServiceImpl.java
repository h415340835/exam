package cn.xingaohbd.exam.service.impl;

import cn.xingaohbd.exam.model.Classify;
import cn.xingaohbd.exam.repository.ClassifyRepository;
import cn.xingaohbd.exam.service.IClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ClassifyServiceImpl implements IClassifyService {

    @Autowired
    private ClassifyRepository classifyRepository;

    @Override
    public List<Classify> allClassify() {
        return classifyRepository.findAll();
    }
}
