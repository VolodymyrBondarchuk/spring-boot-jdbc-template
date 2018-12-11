package com.app.moviereviews_jdbc.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.app.moviereviews_jdbc.FeatureFilmRatings;
import com.app.moviereviews_jdbc.mapper.FeatureFilmRaitingsRowMapper;

@Repository
public class FeatureFilmRatingsDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void add(FeatureFilmRatings u) {
		
		String sql = "INSERT INTO FeatureFilmRatings "
				+ "(FeatureFilm_Id,"
				+ " FeatureFilmRating_Score,"
				+ " FeatureFilmRating_Latitude,"
				+ " FeatureFilmRating_Longitude,"
				+ " FeatureFilmRating_DeviceIdentifier,"
				+ " RatingUploadedDateOnSite,"
				+ " RatingUploadedByUserId,"
				+ " LastModified)"
				+" VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		
		jdbcTemplate.update(sql, u.getFilmId(), u.getScore(),
				u.getLatitude(), u.getLongitude(), u.getDeviceIdentifier(),
				u.getPusblishedDate(), u.getUserId(), new Date());
	}
	
	public List<FeatureFilmRatings> findAll(){
		List<FeatureFilmRatings> featureFilms = jdbcTemplate.query("select * from FeatureFilmRatings", new FeatureFilmRaitingsRowMapper());
		return featureFilms;
	}
	
	public FeatureFilmRatings getRatingsById(Integer id) {
		
		String sql = "select * from FeatureFilmRatings where FeatureFilmRatings_RowId=?";
		FeatureFilmRatings review = (FeatureFilmRatings)jdbcTemplate.queryForObject(sql, new Object[] { id }, new FeatureFilmRaitingsRowMapper());
		
		return review;
	}
	
	public FeatureFilmRatings getFilmById(String id) {
		return getRatingsById(Integer.valueOf(id));
	}
	
	public void deleteById(Integer id) {
		
		String sql = "delete from FeatureFilmRatings where FeatureFilmRatings_RowId=?";
		jdbcTemplate.update(sql, id);
		
	}

	public void edit(Integer id, FeatureFilmRatings u) {
		String sql = "update FeatureFilmRatings set "
				+ " FeatureFilm_Id=?,"
				+ " FeatureFilmRating_Score=?,"
				+ " FeatureFilmRating_Latitude=?,"
				+ " FeatureFilmRating_Longitude=?,"
				+ " FeatureFilmRating_DeviceIdentifier=?,"
				+ " RatingUploadedDateOnSite=?,"
				+ " RatingUploadedByUserId=?,"
				+ " LastModified=?"
				
				+" where FeatureFilmRatings_RowId=?";
		
		jdbcTemplate.update(sql, u.getFilmId(), u.getScore(),
				u.getLatitude(), u.getLongitude(), u.getDeviceIdentifier(),
				u.getPusblishedDate(), u.getUserId(), new Date(), id);
		
	}

}
