package com.app.moviereviews_jdbc.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.app.moviereviews_jdbc.User;

@Repository
public class UserDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public User add(User u) {
		
		String sql = "INSERT INTO Users (UserId, Email, LastName, FirstName, Gender, AgeRange, Location, LastModified)"
				+" VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		
		jdbcTemplate.update(sql, u.getUserId(), u.getEmail(), u.getLastName(), u.getFirstName(), 
				u.getGender(), u.getAgeRange(), u.getLocation(), new Date());
		
		return getUserById(u.getUserId());
	}
	
	public List<User> findAll(){
		List<User> users = jdbcTemplate.query("select * from Users", new BeanPropertyRowMapper(User.class));
		return users;
	}
	
	public User getUserById(Integer id) {
		
		String sql = "select * from Users where UserId=?";
		User user = (User)jdbcTemplate.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper(User.class));
		
		return user;
	}
	
	public User getUserById(String id) {
		return getUserById(Integer.valueOf(id));
	}
	
	public void deleteById(Integer id) {
		
		String sql = "delete from Users where UserId=?";
		jdbcTemplate.update(sql, id);
		
	}
	
	public void edit(Integer id, User u) {
		
		String sql = "update Users set Email= ?, LastName=?, FirstName=?, Gender=?, AgeRange=?, Location=?, LastModified=? where UserId=?";
		
		jdbcTemplate.update(sql, u.getEmail(), u.getLastName(), u.getFirstName(), 
				u.getGender(), u.getAgeRange(), u.getLocation(), new Date(), id);
		
	}

}
