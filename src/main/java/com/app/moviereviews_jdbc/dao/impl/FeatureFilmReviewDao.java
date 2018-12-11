package com.app.moviereviews_jdbc.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.app.moviereviews_jdbc.FeatureFilm;
import com.app.moviereviews_jdbc.FeatureFilmReview;
import com.app.moviereviews_jdbc.mapper.FeatureFilmReviewRowMapper;
import com.app.moviereviews_jdbc.mapper.FeatureFilmRowMapper;

@Repository
public class FeatureFilmReviewDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void add(FeatureFilmReview u) {

		String sql = "INSERT INTO FeatureFilmReviews "
				+ "(FeatureFilm_Id,"
				+ " FeatureFilmReview,"
				+ " LastModified)"
				+" VALUES (?, ?, ?)";
		
		jdbcTemplate.update(sql, u.getFilmId(), u.getReview(), new Date());
	}
	
	public List<FeatureFilmReview> findAll(){
		List<FeatureFilmReview> featureFilms = jdbcTemplate.query("select * from FeatureFilmReviews", new FeatureFilmReviewRowMapper());
		return featureFilms;
	}
	
	public FeatureFilmReview getReviewById(Integer id) {
		
		String sql = "select * from FeatureFilmReviews where FeatureFilmReviews_RowId=?";
		FeatureFilmReview review = (FeatureFilmReview)jdbcTemplate.queryForObject(sql, new Object[] { id }, new FeatureFilmReviewRowMapper());
		
		return review;
	}
	
	public FeatureFilmReview getFilmById(String id) {
		return getReviewById(Integer.valueOf(id));
	}
	
	public void deleteById(Integer id) {
		
		String sql = "delete from FeatureFilmReviews where FeatureFilmReviews_RowId=?";
		jdbcTemplate.update(sql, id);
		
	}
	
	public void edit(Integer id, FeatureFilmReview u) {
		String sql = "update FeatureFilmReviews set "
				+ " FeatureFilm_Id=?,"
				+ " FeatureFilmReview=?,"
				+ " LastModified=?"
				
				+" where FeatureFilmReviews_RowId=?";
		
		jdbcTemplate.update(sql, u.getFilmId(), u.getReview(), new Date(), id);
		
	}

}
