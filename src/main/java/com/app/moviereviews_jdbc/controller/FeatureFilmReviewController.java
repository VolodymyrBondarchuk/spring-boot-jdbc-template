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

import com.app.moviereviews_jdbc.FeatureFilmReview;
import com.app.moviereviews_jdbc.dao.impl.FeatureFilmReviewDao;


@RestController
@RequestMapping(value = "/FeatureFilmReview")
public class FeatureFilmReviewController {
	
	@Autowired
	private FeatureFilmReviewDao reviewDao;


	@CrossOrigin
	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.OK)
	public void addReview(@RequestBody FeatureFilmReview review) {		
		reviewDao.add(review);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public List<FeatureFilmReview> viewAll() {
	
		return reviewDao.findAll();
	}
		
	@CrossOrigin
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public FeatureFilmReview getFeatureFilmById(@PathVariable Integer id) {
		
		return reviewDao.getReviewById(id);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.OK)
	public void deleteReviewById(@PathVariable Integer id) {
		
		reviewDao.deleteById(id);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.OK)
	public void editFeatureFilm(@PathVariable Integer id, @RequestBody FeatureFilmReview review) {
		
		reviewDao.edit(id, review);
	}
	
}
	

	
