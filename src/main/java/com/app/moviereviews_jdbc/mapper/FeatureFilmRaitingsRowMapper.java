package com.app.moviereviews_jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.app.moviereviews_jdbc.FeatureFilmRatings;
import com.app.moviereviews_jdbc.FeatureFilmReview;

public class FeatureFilmRaitingsRowMapper implements RowMapper<FeatureFilmRatings> {

	@Override
	public FeatureFilmRatings mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		FeatureFilmRatings rating = new FeatureFilmRatings();
		
		rating.setId(rs.getInt("FeatureFilmRatings_RowId"));
		rating.setFilmId(rs.getInt("FeatureFilm_Id"));
		rating.setScore(rs.getDouble("FeatureFilmRating_Score"));
		
		rating.setLatitude(rs.getString("FeatureFilmRating_Latitude"));
		rating.setLongitude(rs.getString("FeatureFilmRating_Longitude"));
		
		rating.setDeviceIdentifier(rs.getString("FeatureFilmRating_DeviceIdentifier"));
		rating.setPusblishedDate(rs.getDate("RatingUploadedDateOnSite"));
		rating.setUserId(rs.getInt("RatingUploadedByUserId"));
		
		rating.setLastModified(rs.getDate("LastModified"));

		
		return rating;
	}

}
