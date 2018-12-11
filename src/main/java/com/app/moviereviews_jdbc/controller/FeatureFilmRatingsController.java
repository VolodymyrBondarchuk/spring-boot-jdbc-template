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

import com.app.moviereviews_jdbc.FeatureFilmRatings;
import com.app.moviereviews_jdbc.dao.impl.FeatureFilmRatingsDao;


@RestController
@RequestMapping(value = "/FeatureFilmRatings")
public class FeatureFilmRatingsController {
	
	@Autowired
	private FeatureFilmRatingsDao ratingsDao;


	@CrossOrigin
	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.OK)
	public void addReview(@RequestBody FeatureFilmRatings review) {		
		ratingsDao.add(review);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public List<FeatureFilmRatings> viewAll() {
	
		return ratingsDao.findAll();
	}
		
	@CrossOrigin
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public FeatureFilmRatings getRatingsById(@PathVariable Integer id) {
		
		return ratingsDao.getRatingsById(id);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.OK)
	public void deleteReviewById(@PathVariable Integer id) {
		
		ratingsDao.deleteById(id);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.OK)
	public void editRatings(@PathVariable Integer id, @RequestBody FeatureFilmRatings review) {
		
		ratingsDao.edit(id, review);
	}
	
}
	

	
