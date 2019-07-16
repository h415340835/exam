package cn.xingaohbd.exam.repository;

import cn.xingaohbd.exam.model.QuesBank;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuesBankRepository extends JpaRepository<QuesBank,String> {

    List<QuesBank> findAll(Sort sort);


}
