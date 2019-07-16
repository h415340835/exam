package cn.xingaohbd.exam.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.xml.internal.bind.v2.model.core.ID;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "ques_examination_paper")
public class QuesExaminationPaper extends BaseEntity<Integer> implements Serializable {

    private static final long serialVersionUID = -2550255097877203017L;

    @Id
    @Column(name="id")
    private ID id;

    @Column(name = "create_time")
    private Date createTime = new Date();

    @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss")
    @Column(name = "update_time")
    private Date updateTime = new Date();

    @Column(name = "status")
    private Integer status;

    @ManyToOne
    @JoinColumn(name="examination_paper_id")
    private ExaminationPaper examinationPaper;

    @ManyToOne
    @JoinColumn(name="ques_bank_id")
    private QuesBank quesBank;

    @Override
    public String toString() {
        return "QuesExaminationPaper{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", status=" + status +
                ", examinationPaper=" + examinationPaper +
                ", quesBank=" + quesBank +
                '}';
    }
}
