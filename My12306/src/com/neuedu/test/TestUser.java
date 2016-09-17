package com.neuedu.test;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.neuedu.business.service.UserService;
import com.neuedu.domain.CertType;
import com.neuedu.domain.City;
import com.neuedu.domain.User;
import com.neuedu.domain.UserType;
import com.neuedu.utils.Md5Utils;

public class TestUser {

	@Test
	public void testAddUser() {
		// fail("Not yet implemented");
		UserService service = UserService.getInstance();
		User user = new User();
		user.setUsername("zhangsan2");
		user.setPassword(Md5Utils.md5("123456"));
		user.setRule("2");
		user.setRealname("张三");
		user.setSex("1");
		
		// city
		City city = new City();
		city.setId(1);
		user.setCity(city);
		
		// certType
		CertType certType = new CertType();
		certType.setId(1);
		user.setCertType(certType);
		
		user.setCert("440901198903127998");
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 1989);
		c.set(Calendar.MONTH, 2);
		c.set(Calendar.DATE, 12);
		user.setBirthday(c.getTime());
		
		// userType
		UserType userType = new UserType();
		userType.setId(1);
		user.setUserType(userType);
		
		user.setContent("无");
		user.setStatus("1");
		user.setLoginIp("192.168.1.2");
		user.setImagePath("/home/a.png");
		
		service.addUser(user);
	}
	
	@Test
	public void testDeleteUsers() {
		// fail("Not yet implemented");
		UserService service = UserService.getInstance();
		int[] userIdList = {1, 2, 3, 4};
		service.deleteUsers(userIdList);
	}
	
	@Test
	public void testFindUser() {
		// fail("Not yet implemented");
		UserService service = UserService.getInstance();
		User user = service.login("zhangsan", Md5Utils.md5("123456"));
		System.out.println(user);
	}

}
