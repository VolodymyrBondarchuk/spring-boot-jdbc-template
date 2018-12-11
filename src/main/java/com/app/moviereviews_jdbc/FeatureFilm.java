package com.app.moviereviews_jdbc;
import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;


/**
 * The persistent class for the FeatureFilm database table.
 * 
 */

public class FeatureFilm implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String title;
	private String title_URLEncoded;
	private String description; 
	
	private Boolean inTheatres;
	
	private String language;
	private String countryOfRelease;
	private String releasedDate;
	private Date lastModified;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle_URLEncoded() {
		return title_URLEncoded;
	}
	public void setTitle_URLEncoded(String title_URLEncoded) {
		this.title_URLEncoded = title_URLEncoded;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getInTheatres() {
		return inTheatres;
	}
	public void setInTheatres(Boolean inTheatres) {
		this.inTheatres = inTheatres;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCountryOfRelease() {
		return countryOfRelease;
	}
	public void setCountryOfRelease(String countryOfRelease) {
		this.countryOfRelease = countryOfRelease;
	}
	public String getReleasedDate() {
		return releasedDate;
	}
	public void setReleasedDate(String releasedDate) {
		this.releasedDate = releasedDate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public Date getLastModified() {
		return lastModified;
	}
	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}
	
}