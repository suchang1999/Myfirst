package com.lovo.service.impl;

import com.lovo.beans.UserInfo;
import com.lovo.dao.IUserInfoDao;
import com.lovo.service.IUserInfoService;

public class UserInfoServiceImpl implements IUserInfoService {

	private IUserInfoDao dao;

	// public void setDao(IUserInfoDao dao) {
	// this.dao = dao;
	// }

	public UserInfoServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserInfoServiceImpl(IUserInfoDao dao) {
		super();
		this.dao = dao;
	}


	public void saveUserInfo(UserInfo user) throws Exception {
		// TODO Auto-generated method stub
		dao.saveUserInfo(user);
	}
	
	public void updateUserInfo(UserInfo user) throws Exception {
		// TODO Auto-generated method stub
		dao.updateUserInfo(user);
	}

}
