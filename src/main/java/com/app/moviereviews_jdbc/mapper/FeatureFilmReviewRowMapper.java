package com.app.moviereviews_jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.app.moviereviews_jdbc.FeatureFilmReview;

public class FeatureFilmReviewRowMapper implements RowMapper<FeatureFilmReview> {

	@Override
	public FeatureFilmReview mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		FeatureFilmReview review = new FeatureFilmReview();
		
		review.setId(rs.getInt("FeatureFilmReviews_RowId"));
		review.setFilmId(rs.getInt("FeatureFilm_Id"));
		review.setReview(rs.getString("FeatureFilmReview"));
		review.setLastModified(rs.getDate("LastModified"));

		
		return review;
	}

}
