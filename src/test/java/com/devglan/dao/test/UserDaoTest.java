/**
 * 
 */
package com.devglan.dao.test;

/*import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.app.moviereviews_jdbc.User;
import com.app.moviereviews_jdbc.config.Application;
import com.app.moviereviews_jdbc.dao.UserDao;

/**
 * @author only2dhir
 *
 */
/*
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class UserDaoTest {

	@Autowired
	private UserDao userDao;

	@Test
	public void createUser() {
		User savedUser = userDao.create(getUser());
		User userFromDb = userDao.findUserById(savedUser.getId());
		assertEquals(savedUser.getName(), userFromDb.getName());
		assertEquals(savedUser.getEmail(), userFromDb.getEmail());
	}

	@Test
	public void findAllUsers() {
		List<User> users = userDao.findAll();
		assertNotNull(users);
		assertTrue(users.size() > 0);
	}

	@Test
	public void findUserById() {
		User user = userDao.findUserById(1);
		assertNotNull(user);
	}
	
	private User getUser() {
		User user = new User();
		user.setAddress("Bangalore, Karnataka");
		user.setEmail("johndoe@gmail.com");
		user.setName("John Doe");
		return user;
	}

}*/
