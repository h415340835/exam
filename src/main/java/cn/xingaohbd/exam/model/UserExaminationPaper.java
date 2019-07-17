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
@Table(name = "user_examination_paper")
public class UserExaminationPaper implements Serializable {

    private static final long serialVersionUID = -1922053755896998652L;

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
    @Column(name="user_id")
    private Integer userId;

   // @ManyToOne
    @Column(name="examination_paper_id")
    private Integer examinationPaperId;

    @Column(name = "examination_paper_score")
    private Integer examinationPaperScore;

    @Override
    public String toString() {
        return "UserExaminationPaper{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", status=" + status +
                ", userId=" + userId +
                ", examinationPaperId=" + examinationPaperId +
                ", examinationPaperScore=" + examinationPaperScore +
                '}';
    }
}
