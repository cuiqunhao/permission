package com.permission.pojo;

public class ModuleElementWithBLOBs extends ModuleElement {
	/**
	 * 元素附加属性
	 */
    private String attr;

    /**
	 * 元素调用脚本
	 */
    private String script;

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr == null ? null : attr.trim();
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script == null ? null : script.trim();
    }
}