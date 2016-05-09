package com.permission.pojo;

import java.util.Date;

/**
 * 角色表
 * @author milanyangbo
 *
 */
public class Role {
	/**
	 *  流水号
	 */
    private Integer id;

    /**
   	 * 名称
   	 */
    private String name;

    /**
   	 * 状态
   	 */
    private Integer status;
    
    /**
   	 * 角色类型
   	 */
    private Integer type;

    /**
   	 * 创建时间
   	 */
    private Date createtime;
    
    /**
   	 * 创建人ID
   	 */
    private String createid;
    
    /**
   	 * 所属部门流水号
   	 */
    private Integer orgid;

    /**
   	 * 所属部门节点语义ID
   	 */
    private String orgcascadeid;
    
    /**
   	 * 所属部门名称
   	 */
    private String orgname;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreateid() {
        return createid;
    }

    public void setCreateid(String createid) {
        this.createid = createid == null ? null : createid.trim();
    }

    public Integer getOrgid() {
        return orgid;
    }

    public void setOrgid(Integer orgid) {
        this.orgid = orgid;
    }

    public String getOrgcascadeid() {
        return orgcascadeid;
    }

    public void setOrgcascadeid(String orgcascadeid) {
        this.orgcascadeid = orgcascadeid == null ? null : orgcascadeid.trim();
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname == null ? null : orgname.trim();
    }
}