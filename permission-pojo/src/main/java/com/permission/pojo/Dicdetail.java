package com.permission.pojo;

/**
 *  数据字典详情
 * @author milanyangbo
 *
 */
public class Dicdetail {
	/**
	 * ID
	 */
    private Integer id;

    /**
	 * 值
	 */
    private String value;

    /**
   	 * 文本描述
   	 */
    private String text;

    /**
   	 * 所属字典ID
   	 */
    private Integer dicid;

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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    public Integer getDicid() {
        return dicid;
    }

    public void setDicid(Integer dicid) {
        this.dicid = dicid;
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