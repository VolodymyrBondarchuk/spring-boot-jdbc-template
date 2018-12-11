use moviereviewsdb;
CREATE TABLE Users
(
UserId varchar(55) NOT NULL,
Email varchar(65),

LastName varchar(25),
FirstName varchar(25) ,
Gender varchar(25),
AgeRange varchar(25),
Location varchar(55),  

LastModified TIMESTAMP NOT NULL DEFAULT 0,
PRIMARY KEY (UserId)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

use moviereviewsdb;

CREATE TABLE FeatureFilms
(
FeatureFilm_Id int unsigned NOT NULL AUTO_INCREMENT,
FeatureFilm_Title varchar(55) NOT NULL,
FeatureFilm_Description varchar(1200) ,
FeatureFilm_CurrentlyInTheatres TINYINT(255),  
FeatureFilm_Language varchar (55) NOT NULL,
FeatureFilm_CountryOfRelease varchar (55) NOT NULL,
FeatureFilm_ReleaseDate DATETIME,
LastModified TIMESTAMP NOT NULL DEFAULT 0,
PRIMARY KEY (FeatureFilm_Id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE FeatureFilmRatings
(
FeatureFilmRatings_RowId int unsigned NOT NULL AUTO_INCREMENT,
FeatureFilm_Id int unsigned NOT NULL,
FeatureFilmRating_Score float NOT NULL,

FeatureFilmRating_Latitude varchar(100),
FeatureFilmRating_Longitude varchar(100),
FeatureFilmRating_DeviceIdentifier varchar(100),

RatingUploadedDateOnSite TIMESTAMP NOT NULL DEFAULT 0,
RatingUploadedByUserId varchar(255),

LastModified TIMESTAMP NOT NULL DEFAULT 0,
PRIMARY KEY (FeatureFilmRatings_RowId),
FOREIGN KEY (FeatureFilm_Id) REFERENCES
FeatureFilms(FeatureFilm_Id) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE FeatureFilmReviews
(
FeatureFilmReviews_RowId int unsigned NOT NULL AUTO_INCREMENT,
FeatureFilm_Id int unsigned NOT NULL,
FeatureFilmReview varchar(8500),

LastModified TIMESTAMP NOT NULL DEFAULT 0,
PRIMARY KEY (FeatureFilmReviews_RowId),
FOREIGN KEY (FeatureFilm_Id) REFERENCES
FeatureFilms(FeatureFilm_Id) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

