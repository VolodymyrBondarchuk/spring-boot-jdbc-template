package com.app.moviereviews_jdbc;

import java.util.Date;

public class FeatureFilmRatings {
	
	
	private Integer id;
	private Integer filmId;
	private Double score;
	
	private String latitude;
	private String longitude;
	private String DeviceIdentifier;
	
	private Date pusblishedDate;
	private Integer userId;
	
	private Date lastModified;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getFilmId() {
		return filmId;
	}

	public void setFilmId(Integer filmId) {
		this.filmId = filmId;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getDeviceIdentifier() {
		return DeviceIdentifier;
	}

	public void setDeviceIdentifier(String deviceIdentifier) {
		DeviceIdentifier = deviceIdentifier;
	}

	public Date getPusblishedDate() {
		return pusblishedDate;
	}

	public void setPusblishedDate(Date pusblishedDate) {
		this.pusblishedDate = pusblishedDate;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

}
