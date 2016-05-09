package com.permission.model.viewmodel;

import java.util.Date;

public class UserView {
	 private Integer id;

	    private String account;

	    private String password;

	    private String name;

	    private Integer sex;

	    private Integer status;

	    private Integer type;

	    private Date createtime;

	    private String createuser;
	    
	   /**
	    * 所属组织名称，多个可用，分隔
	   */
        public String organizations;

        public String organizationids;

	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public String getAccount() {
	        return account;
	    }

	    public void setAccount(String account) {
	        this.account = account == null ? null : account.trim();
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password == null ? null : password.trim();
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name == null ? null : name.trim();
	    }

	    public Integer getSex() {
	        return sex;
	    }

	    public void setSex(Integer sex) {
	        this.sex = sex;
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

	    public String getCreateUser() {
	        return createuser;
	    }

	    public void setCreateUser(String createuser) {
	        this.createuser = createuser;
	    }
	    
	    public String getOrganizations() {
	        return organizations;
	    }

	    public void setOrganizations(String organizations) {
	        this.organizations = organizations;
	    }
	    
	    public String getOrganizationIds() {
	        return organizationids;
	    }

	    public void setOrganizationIds(String organizationids) {
	        this.organizationids = organizationids;
	    }
}
