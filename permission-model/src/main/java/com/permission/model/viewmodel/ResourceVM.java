package com.permission.model.viewmodel;

/**
 * 资源表视图模型
 * @author milanyangbo
 *
 */
public class ResourceVM {
	/**
	 * 资源表ID
	 */
    private Integer id;

  
    /**
   	 * 
   	 */
    private String key;
       
    /**
   	 * 名称
   	 */
    private String name;

  
    /**
   	 * 状态
   	 */
    private Integer status;
    
    private Boolean isbelonguser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

  
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
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

    public Boolean getIsBelongUser() {
        return isbelonguser;
    }

    public void setIsBelongUser(Boolean isbelonguser) {
        this.isbelonguser = isbelonguser;
    }

}
