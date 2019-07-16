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
@Table(name = "user_examination_paper")
public class UserExaminationPaper extends BaseEntity<Integer> implements Serializable {

    private static final long serialVersionUID = -1922053755896998652L;

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
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name="examination_paper_id")
    private ExaminationPaper examinationPaper;

    @Column(name = "examination_paper_score")
    private Integer examinationPaperScore;

    @Override
    public String toString() {
        return "UserExaminationPaper{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", status=" + status +
                ", user=" + user +
                ", examinationPaper=" + examinationPaper +
                ", examinationPaperScore=" + examinationPaperScore +
                '}';
    }
}
