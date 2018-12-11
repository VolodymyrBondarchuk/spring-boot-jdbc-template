package com.app.moviereviews_jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.app.moviereviews_jdbc.User;
import com.app.moviereviews_jdbc.dao.impl.UserDao;


@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	private UserDao userDao;


	@CrossOrigin
	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.OK)
	public User addUser(@RequestBody User user) {		
		return userDao.add(user);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public List<User> viewAll() {
	
		return userDao.findAll();
	}
		
	@CrossOrigin
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public User getUserById(@PathVariable Integer id) {
	
		
		return userDao.getUserById(id);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.OK)
	public void deleteUserById(@PathVariable Integer id) {
		
		userDao.deleteById(id);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.OK)
	public void editUser(@PathVariable Integer id, @RequestBody User user) {
		
		userDao.edit(id, user);
	}
	
}
	

	
