package com.permission.pojo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 出入库信息表
 * @author milanyangbo
 *
 */
public class Stock {
	/**
	 * 数据ID
	 */
    private Integer id;

    /**
	 * 产品数量
	 */
    private Integer number;

    /**
	 * 产品单价
	 */
    private BigDecimal price;

    /**
	 * 出库/入库
	 */
    private Integer status;

    /**
	 * 
	 */
    private String user;

    /**
	 * 操作时间
	 */
    private Date time;

    /**
	 * 组织ID
	 */
    private Integer orgid;

    /**
	 * 产品名称
	 */
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getOrgid() {
        return orgid;
    }

    public void setOrgid(Integer orgid) {
        this.orgid = orgid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}