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
@Table(name = "user_answer")
public class UserAnswer extends BaseEntity<Integer> implements Serializable {

    private static final long serialVersionUID = 8842521846382975280L;

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
    @JoinColumn(name="ques_bank_id")
    private QuesBank quesBank;

    @Column(name = "answer")
    private String answer;

    @Column(name = "answer_status")
    private Integer answerStatus;

    @Override
    public String toString() {
        return "UserAnswer{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", status=" + status +
                ", user=" + user +
                ", quesBank=" + quesBank +
                ", answer='" + answer + '\'' +
                ", answerStatus=" + answerStatus +
                '}';
    }
}
