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

import com.app.moviereviews_jdbc.FeatureFilm;
import com.app.moviereviews_jdbc.dao.impl.FeatureFilmDao;


@RestController
@RequestMapping(value = "api/featureFilm")
public class FeatureFilmController {
	
	@Autowired
	private FeatureFilmDao featureFilmDao;


	@CrossOrigin
	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.OK)
	public void addFeatureFilm(@RequestBody FeatureFilm featureFilm) {		
		featureFilmDao.add(featureFilm);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public List<FeatureFilm> viewAll() {
	
		return featureFilmDao.findAll();
	}
	
	@CrossOrigin
	@RequestMapping(value = "/getByLanguage", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.OK)
	public List<FeatureFilm> findByLanguage(@RequestBody String language) {
	
		return featureFilmDao.findByLanguage(language);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/getRecentByLanguage", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.OK)
	public List<FeatureFilm> findRecentByLanguage(@RequestBody String language) {
	
		return featureFilmDao.findRecentByLanguage(language);
	}
		
	@CrossOrigin
	@RequestMapping(value = "/getDetails/movie/{id}", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public FeatureFilm getFeatureFilmById(@PathVariable Integer id) {
	
		
		return featureFilmDao.getFilmById(id);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.OK)
	public void deleteFeatureFilmById(@PathVariable Integer id) {
		
		featureFilmDao.deleteById(id);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.OK)
	public void editFeatureFilm(@PathVariable Integer id, @RequestBody FeatureFilm featureFilm) {
		
		featureFilmDao.edit(id, featureFilm);
	}
	
}
	

	
