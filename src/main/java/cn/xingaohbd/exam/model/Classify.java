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
@Entity
@Table(name = "classify")
public class Classify implements Serializable {

    private static final long serialVersionUID = -8085563460518525696L;

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

    @Column(name = "classify_type")
    private String classifyType;

    @Override
    public String toString() {
        return "Classify{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", status=" + status +
                ", classifyType='" + classifyType + '\'' +
                '}';
    }
}
