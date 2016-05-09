/**
 * 
 */
package com.permission.service;

import com.permission.model.viewmodel.LoginUserVM;

/**
 * @author milanyangbo
 *
 */
public interface ILoginService {

	public LoginUserVM Login(String userName, String password);
	
	public LoginUserVM LoginByDev();
}
