package com.permission.pojo;

/**
 * 资源表
 * @author milanyangbo
 *
 */
public class Resource {
	/**
	 * 资源表ID
	 */
    private Integer id;

    /**
	 * 节点语义ID
	 */
    private String cascadeid;

    /**
   	 * 
   	 */
    private String key;
    
    /**
   	 *父节点流水号
   	 */
    private Integer parentid;


    /**
   	 * 名称
   	 */
    private String name;

    /**
   	 * 排序号
   	 */
    private Integer sortno;

    /**
   	 * 状态
   	 */
    private Integer status;
    
    /**
   	 * 资源分类
   	 */
    private Integer categoryid;

    /**
   	 * 描述
   	 */
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCascadeid() {
        return cascadeid;
    }

    public void setCascadeid(String cascadeid) {
        this.cascadeid = cascadeid == null ? null : cascadeid.trim();
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

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSortno() {
        return sortno;
    }

    public void setSortno(Integer sortno) {
        this.sortno = sortno;
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}