package com.permission.pojo;

/**
 * 功能模块表
 * @author milanyangbo
 *
 */
public class Module {
	/**
	 * 功能模块流水号
	 */
    private Integer id;

    /**
	 * 节点语义ID
	 */
    private String cascadeid;

    /**
	 * 功能模块名称
	 */
    private String name;

    /**
	 * 主页面URL
	 */
    private String url;

    /**
	 * 热键
	 */
    private String hotkey;

    /**
   	 * 父节点流水号
   	 */
    private Integer parentid;

    /**
   	 * 是否叶子节点
   	 */
    private Boolean isleaf;

    /**
   	 * 是否自动展开
   	 */
    private Boolean isautoexpand;
    
    /**
   	 * 节点图标文件名称
   	 */
    private String iconname;

    /**
   	 * 当前状态
   	 */
    private Integer status;

    /**
   	 * 父节点名称
   	 */
    private String parentname;

    /**
   	 * 矢量图标
   	 */
    private String vector;

    /**
   	 * 排序号
   	 */
    private Integer sortno;
    
 
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getHotkey() {
        return hotkey;
    }

    public void setHotkey(String hotkey) {
        this.hotkey = hotkey == null ? null : hotkey.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Boolean getIsleaf() {
        return isleaf;
    }

    public void setIsleaf(Boolean isleaf) {
        this.isleaf = isleaf;
    }

    public Boolean getIsautoexpand() {
        return isautoexpand;
    }

    public void setIsautoexpand(Boolean isautoexpand) {
        this.isautoexpand = isautoexpand;
    }

    public String getIconname() {
        return iconname;
    }

    public void setIconname(String iconname) {
        this.iconname = iconname == null ? null : iconname.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getParentname() {
        return parentname;
    }

    public void setParentname(String parentname) {
        this.parentname = parentname == null ? null : parentname.trim();
    }

    public String getVector() {
        return vector;
    }

    public void setVector(String vector) {
        this.vector = vector == null ? null : vector.trim();
    }

    public Integer getSortno() {
        return sortno;
    }

    public void setSortno(Integer sortno) {
        this.sortno = sortno;
    }
}