package cn.xingaohbd.exam.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.xml.internal.bind.v2.model.core.ID;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "examination_paper")
public class ExaminationPaper implements Serializable {

    private static final long serialVersionUID = 281609014299756850L;

    @Id
    @Column(name="id")
    private ID id;

    @Column(name = "create_date")
    private Date createDate = new Date();

    @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss")
    @Column(name = "update_date")
    private Date updateDate = new Date();

    @Column(name = "status")
    private Integer status;

    @Column(name = "exam_name")
    private String examName;

    @Column(name = "exam_count")
    private Integer examCount;

    @Column(name = "exam_star")
    private Integer examStar;

    @Column(name = "exam_time")
    private String examTime;

    @Column(name = "classify_id")
    private Classify classify;

    @Override
    public String toString() {
        return "ExaminationPaper{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", status=" + status +
                ", examName='" + examName + '\'' +
                ", examCount=" + examCount +
                ", examStar=" + examStar +
                ", examTime='" + examTime + '\'' +
                ", classify=" + classify +
                '}';
    }
}
