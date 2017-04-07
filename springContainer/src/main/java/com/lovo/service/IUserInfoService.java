package com.lovo.service;

import com.lovo.beans.UserInfo;

public interface IUserInfoService {
	public void saveUserInfo(UserInfo user) throws Exception;	
	public void updateUserInfo(UserInfo user) throws Exception;
}
