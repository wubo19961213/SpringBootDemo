package com.winter;

import com.winter.Controller.UserController;
import com.winter.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisDemoApplicationTests {
	@Autowired
	private UserController userController;
	@Test
	public void contextLoads() {
		User user = new User();
		user.setPhone("wegweg");
		user.setUserId(3);
		user.setUserName("和我2");
		user.setPassword("24tt4");
		userController.insertSelective(user);
	}

}
