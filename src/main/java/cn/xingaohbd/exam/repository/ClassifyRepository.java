package cn.xingaohbd.exam.repository;

import cn.xingaohbd.exam.model.Classify;
import cn.xingaohbd.exam.model.QuesBank;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassifyRepository extends JpaRepository<Classify,String> {

}
