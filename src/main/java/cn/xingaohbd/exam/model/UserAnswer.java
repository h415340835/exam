package cn.xingaohbd.exam.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.xml.internal.bind.v2.model.core.ID;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "user_answer")
public class UserAnswer implements Serializable {

    private static final long serialVersionUID = 8842521846382975280L;

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
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", status=" + status +
                ", user=" + user +
                ", quesBank=" + quesBank +
                ", answer='" + answer + '\'' +
                ", answerStatus=" + answerStatus +
                '}';
    }
}
