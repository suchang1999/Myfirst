package com.lovo.dao;

import com.lovo.beans.UserInfo;

public interface IUserInfoDao {
	public void saveUserInfo(UserInfo user) throws Exception;
	public void updateUserInfo(UserInfo user) throws Exception;
}
