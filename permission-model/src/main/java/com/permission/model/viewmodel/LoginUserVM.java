package com.permission.model.viewmodel;

import java.util.List;

import com.permission.pojo.Org;
import com.permission.pojo.Resource;

/**
 * 登陆用户视图模型
 * @author milanyangbo
 *
 */
public class LoginUserVM {

	/**
	 * 用户可以访问到的模块（包括所属角色与自己的所有模块）
	 */
	private List<ModuleView> modules ;

    /**
     *用户可以访问的资源
     */
	private List<Resource> resources ;

    /**
     *用户所属机构
     */
	private List<Org> orgs ;

    /**
     * 用户可访问的机构
     */
	private List<Org> accessedorgs ;
    
    
    public  List<ModuleView> getModules() {
        return modules;
    }

    public void setModules(List<ModuleView> modules) {
        this.modules = modules;
    }
    
    public  List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }
    
    
    public  List<Org> getOrgs() {
        return orgs;
    }

    public void setOrgs(List<Org> orgs) {
        this.orgs = orgs;
    }
    
    public  List<Org> getAccessedOrgs() {
        return accessedorgs;
    }

    public void setAccessedOrgs(List<Org> accessedorgs) {
        this.accessedorgs = accessedorgs;
    }
}
