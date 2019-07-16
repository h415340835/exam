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
@Table(name = "user")
public class User implements Serializable {

    private static final long serialVersionUID = 722493138506456783L;

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

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_tel")
    private String userTel;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", status=" + status +
                ", userName='" + userName + '\'' +
                ", userTel='" + userTel + '\'' +
                '}';
    }
}
