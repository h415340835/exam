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
@Table(name = "sys")
public class Sys extends BaseEntity<Integer> implements Serializable {

    private static final long serialVersionUID = 3563819130531705340L;

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
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", status=" + status +
                ", sysAccount='" + sysAccount + '\'' +
                ", sysPassword='" + sysPassword + '\'' +
                ", sysTel='" + sysTel + '\'' +
                ", sysName='" + sysName + '\'' +
                '}';
    }
}
