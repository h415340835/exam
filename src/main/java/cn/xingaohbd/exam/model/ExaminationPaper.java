package cn.xingaohbd.exam.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.xml.internal.bind.v2.model.core.ID;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "examination_paper")
public class ExaminationPaper extends BaseEntity<Integer> implements Serializable {

    private static final long serialVersionUID = 281609014299756850L;

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
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", status=" + status +
                ", examName='" + examName + '\'' +
                ", examCount=" + examCount +
                ", examStar=" + examStar +
                ", examTime='" + examTime + '\'' +
                ", classify=" + classify +
                '}';
    }
}
