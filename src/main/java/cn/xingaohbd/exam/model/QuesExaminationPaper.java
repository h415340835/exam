package cn.xingaohbd.exam.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.xml.internal.bind.v2.model.core.ID;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "ques_examination_paper")
public class QuesExaminationPaper implements Serializable {

    private static final long serialVersionUID = -2550255097877203017L;

    @Id
    @Column(name="id")
    private Integer id;

    @Column(name = "create_date")
    private Date createDate = new Date();

    @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss")
    @Column(name = "update_date")
    private Date updateDate = new Date();

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
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", status=" + status +
                ", examinationPaper=" + examinationPaper +
                ", quesBank=" + quesBank +
                '}';
    }
}
