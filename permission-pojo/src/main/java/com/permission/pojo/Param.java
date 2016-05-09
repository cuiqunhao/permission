package com.permission.pojo;

/**
 * 键值参数
 * @author milanyangbo
 *
 */
public class Param {
	/**
	 * ID
	 */
    private Integer id;

    /**
	 * 值
	 */
    private String value;


    /**
	 * 
	 */
    private String key;

    /**
	 * 所属分类
	 */
    private Integer categoryid;

    /**
	 * 排序号
	 */
    private Integer sortno;

    /**
   	 * 状态
   	 */
    private Integer status;

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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public Integer getSortno() {
        return sortno;
    }

    public void setSortno(Integer sortno) {
        this.sortno = sortno;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}