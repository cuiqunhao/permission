package com.permission.pojo;

/**
 *  数据字典
 * @author milanyangbo
 *
 */
public class Dicindex {
	/**
	 * 数据字典ID
	 */
    private Integer id;

    /**
	 * 名称
	 */
    private String name;

    /**
	 * 
	 */
    private String key;

    /**
	 * 排序号
	 */
    private Integer sortno;

    /**
	 * 所属分类
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
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