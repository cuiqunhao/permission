package com.permission.pojo;

import java.util.Date;

/**
 * 多对多关系集中映射
 * @author milanyangbo
 *
 */
public class Relevance {
	/**
	 * 流水号
	 */
    private Integer id;

    /**
	 * 第一个表主键ID
	 */
    private Integer firstid;

    /**
	 * 第二个表主键ID
	 */
    private Integer secondid;

    /**
   	 * 描述
   	 */
    private String description;

    /**
   	 * 
   	 */
    private String key;

    /**
   	 * 状态
   	 */
    private Integer status;

    /**
   	 * 授权时间
   	 */
    private Date operatetime;

    /**
   	 * 授权人
   	 */
    private Integer operatorid;
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFirstid() {
        return firstid;
    }

    public void setFirstid(Integer firstid) {
        this.firstid = firstid;
    }

    public Integer getSecondid() {
        return secondid;
    }

    public void setSecondid(Integer secondid) {
        this.secondid = secondid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getOperatetime() {
        return operatetime;
    }

    public void setOperatetime(Date operatetime) {
        this.operatetime = operatetime;
    }

    public Integer getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(Integer operatorid) {
        this.operatorid = operatorid;
    }
}