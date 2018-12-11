Documented steps

1. git clone https://github.com/spring-guides/gs-rest-service.git
2. git clone https://github.com/spring-guides/gs-relational-data-access.git
3. Merge manually project 1 and project 2 in order to have rest controller and jdbc template in one project
- dependencies in pom.xml
- controller & dao classes

4. Add models: User, FetureFilms,FetureFilmsRatings, FetureFilmsReview
5. Add dao classes for above models
6. Add controllers classes for above models 
7. Add row mapper classes
8. Configure Application.java class
9. Add 
	<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<scope>runtime</scope>
		</dependency>
in pom.xml
10. Configure DataSource bean (mysql)
11. Add in pom.xml
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-tomcat</artifactId>
			<scope>provided</scope>
		</dependency>

How to build from Eclipse
1. Import as Maven project into Eclipse
2. Run Application.java file
3. open in your browser http://localhost:8080
4. use api to access data, for example http://localhost:8080/FeatureFilmReview/all

How to build war file for external usage:
1. Navigate from command line to project dir
2. run command 'mvn clean package'
3. copy war file (spring-boot-jdbc-template-0.0.1-SNAPSHOT.war) to tomcat/webapps dir
4. run catalina.bat in tomcat/bin by typing 'catalina.bat run' command
5. open in your browser http://localhost:8080/spring-boot-jdbc-template-0.0.1-SNAPSHOT
6. use api to access data, for example http://localhost:8080/spring-boot-jdbc-template-0.0.1-SNAPSHOT/FeatureFilmReview/all
