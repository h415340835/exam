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
@Table(name = "sys")
public class Sys implements Serializable {

    private static final long serialVersionUID = 3563819130531705340L;

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

    @Column(name = "sys_account")
    private String sysAccount;

    @Column(name = "sys_password")
    private String sysPassword;

    @Column(name = "sys_tel")
    private String sysTel;

    @Column(name = "sys_name")
    private String  sysName;

    @Override
    public String toString() {
        return "Sys{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", status=" + status +
                ", sysAccount='" + sysAccount + '\'' +
                ", sysPassword='" + sysPassword + '\'' +
                ", sysTel='" + sysTel + '\'' +
                ", sysName='" + sysName + '\'' +
                '}';
    }
}
