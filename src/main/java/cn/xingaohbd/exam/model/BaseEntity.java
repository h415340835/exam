package cn.xingaohbd.exam.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.stereotype.Controller;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public abstract class BaseEntity<ID extends Serializable> implements Serializable {

	private static final long serialVersionUID = 8925514045582235838L;

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
}
