package com.app.moviereviews_jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.app.moviereviews_jdbc.FeatureFilm;

public class FeatureFilmRowMapper implements RowMapper<FeatureFilm> {

	@Override
	public FeatureFilm mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		FeatureFilm film = new FeatureFilm();
		
		film.setId(rs.getInt("FeatureFilm_Id"));
		film.setTitle(rs.getString("FeatureFilm_Title"));
		film.setDescription(rs.getString("FeatureFilm_Description"));
		film.setInTheatres(rs.getBoolean("FeatureFilm_CurrentlyInTheatres"));
		film.setLanguage(rs.getString("FeatureFilm_Language"));
		film.setCountryOfRelease(rs.getString("FeatureFilm_CountryOfRelease"));
		film.setReleasedDate(rs.getString("FeatureFilm_ReleaseDate"));
		film.setLastModified(rs.getDate("LastModified"));
		
		return film;
	}

}
