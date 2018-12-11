package com.app.moviereviews_jdbc.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.app.moviereviews_jdbc.FeatureFilm;
import com.app.moviereviews_jdbc.mapper.FeatureFilmRowMapper;

@Repository
public class FeatureFilmDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void add(FeatureFilm u) {
		
		Date lastModified = new Date();
		String sql = "INSERT INTO FeatureFilms "
				+ "(FeatureFilm_Title,"
				+ " FeatureFilm_Description,"
				+ " FeatureFilm_CurrentlyInTheatres,"
				+ " FeatureFilm_Language,"
				+ " FeatureFilm_CountryOfRelease,"
				+ " FeatureFilm_ReleaseDate,"
				+ " LastModified)"
				+" VALUES (?, ?, ?, ?, ?, ?, ?)";
		
		jdbcTemplate.update(sql, u.getTitle(), u.getDescription(), u.getInTheatres(), u.getLanguage(), u.getCountryOfRelease(),
				u.getReleasedDate(), lastModified);
		
		
	}
	
	public List<FeatureFilm> findAll(){
		List<FeatureFilm> featureFilms = jdbcTemplate.query("select * from FeatureFilms", new FeatureFilmRowMapper());
		return featureFilms;
	}
	
	public FeatureFilm getFilmById(Integer id) {
		
		String sql = "select * from FeatureFilms where FeatureFilm_Id=?";
		FeatureFilm featureFilms = (FeatureFilm)jdbcTemplate.queryForObject(sql, new Object[] { id }, new FeatureFilmRowMapper());
		
		return featureFilms;
	}
	
	public FeatureFilm getFilmById(String id) {
		return getFilmById(Integer.valueOf(id));
	}
	
	public void deleteById(Integer id) {
		
		String sql = "delete from FeatureFilms where FeatureFilm_Id=?";
		jdbcTemplate.update(sql, id);
		
	}
	
	public void edit(Integer id, FeatureFilm u) {
		
		String sql = "update FeatureFilms set "
				+ " FeatureFilm_Title=?,"
				+ " FeatureFilm_Description=?,"
				+ " FeatureFilm_CurrentlyInTheatres=?,"
				+ " FeatureFilm_Language=?,"
				+ " FeatureFilm_CountryOfRelease=?,"
				+ " FeatureFilm_ReleaseDate=?,"
				+ " LastModified=?"
				+" where FeatureFilm_Id=?";
		
		jdbcTemplate.update(sql, u.getTitle(), u.getDescription(), u.getInTheatres(), 
				u.getLanguage(), u.getCountryOfRelease(), u.getReleasedDate(), new Date(), id);
		
	}

	public List<FeatureFilm> findByLanguage(String language) {
		String sql = "select * from FeatureFilms where FeatureFilm_Language=?";
		List<FeatureFilm> featureFilms = jdbcTemplate.query(sql, new Object[] { language }, new FeatureFilmRowMapper());
		return featureFilms;
	}

	public List<FeatureFilm> findRecentByLanguage(String language) {
		String sql = "select * from FeatureFilms where FeatureFilm_Language=? and "
				+" FeatureFilm_ReleaseDate < DATE_ADD(NOW(), INTERVAL -6 MONTH)";
		List<FeatureFilm> featureFilms = jdbcTemplate.query(sql, new Object[] { language }, new FeatureFilmRowMapper());
		return featureFilms;
	}
	
}
