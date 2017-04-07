package com.lovo.test.pojos;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lovo.beans.UserInfo;
import com.lovo.dao.IUserInfoDao;
import com.lovo.service.IUserInfoService;

public class TestUserInfoService {
	
	private ApplicationContext ac;
	private IUserInfoService userService;
	private IUserInfoDao userDao;
	
	@Before
	public void before(){
		ac = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
		userService = (IUserInfoService) ac.getBean("userInfoServiceImpl");
		userDao = (IUserInfoDao) ac.getBean("userInfoDaoImpl");
	}
	
	@Test
	public void testSaveUserInfo(){
		UserInfo user = new UserInfo(1,"xiaowang",12);
		
		try {
			userService.saveUserInfo(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			userDao.updateUserInfo(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
