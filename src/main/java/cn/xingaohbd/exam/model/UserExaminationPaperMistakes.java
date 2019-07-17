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
@Table(name = "user_examination_paper_mistakes")
public class UserExaminationPaperMistakes implements Serializable {

    private static final long serialVersionUID = 7616092384355225031L;

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

    //@ManyToOne
    @Column(name = "user_examination_paper_id")
    private Integer userExaminationPaperId;

    //@ManyToOne
    @Column(name = "ques_bank_id")
    private Integer quesBankId;

    @Column(name = "user_answer")
    private String userAnswer;

    @Override
    public String toString() {
        return "UserExaminationPaperMistakes{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", status=" + status +
                ", userExaminationPaperId=" + userExaminationPaperId +
                ", quesBankId=" + quesBankId +
                ", userAnswer='" + userAnswer + '\'' +
                '}';
    }
}
