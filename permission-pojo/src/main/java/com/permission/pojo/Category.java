package com.permission.pojo;

/**
 * 分类表
 * @author milanyangbo
 *
 */
public class Category {
	/**
	 * 分类表ID
	 */
    private Integer id;

    /**
	 * 节点语义ID
	 */
    private String cascadeid;

    /**
	 * 节点语义ID
	 */
    private String name;

    /**
	 * 节点语义ID
	 */
    private Integer parentid;

    /**
     * 当前状态
     */
    private Integer status;

    /**
     * 排序号
     */
    private Integer sortno;

    /**
     * 分类所属科目
     */
    private String rootkey;

    /**
     * 分类所属科目名称
     */
    private String rootname;
    

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

    public String getRootkey() {
        return rootkey;
    }

    public void setRootkey(String rootkey) {
        this.rootkey = rootkey == null ? null : rootkey.trim();
    }

    public String getRootname() {
        return rootname;
    }

    public void setRootname(String rootname) {
        this.rootname = rootname == null ? null : rootname.trim();
    }
}