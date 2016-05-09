package com.permission.pojo;

/**
 * 用户配置表
 * @author milanyangbo
 *
 */
public class UserCfg {
	/**
	 * 用户ID
	 */
    private Integer id;

    /**
	 * 用户界面主题
	 */
    private String theme;

    /**
	 *  用户界面皮肤
	 */
    private String skin;

    /**
	 * 导航条按钮风格
	 */
    private String navbarstyle;

    /**
	 * Tab高亮颜色
	 */
    private String tabfocuscolor;

    /**
	 * 导航缺省活动页
	 */
    private Integer navtabindex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme == null ? null : theme.trim();
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin == null ? null : skin.trim();
    }

    public String getNavbarstyle() {
        return navbarstyle;
    }

    public void setNavbarstyle(String navbarstyle) {
        this.navbarstyle = navbarstyle == null ? null : navbarstyle.trim();
    }

    public String getTabfocuscolor() {
        return tabfocuscolor;
    }

    public void setTabfocuscolor(String tabfocuscolor) {
        this.tabfocuscolor = tabfocuscolor == null ? null : tabfocuscolor.trim();
    }

    public Integer getNavtabindex() {
        return navtabindex;
    }

    public void setNavtabindex(Integer navtabindex) {
        this.navtabindex = navtabindex;
    }
}