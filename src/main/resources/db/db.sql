CREATE TABLE users (
  record_id bigint NOT NULL AUTO_INCREMENT,
  name varchar(100),
  address varchar(250),
  email varchar(100),
  PRIMARY KEY (record_id)
);

insert into users(record_id, name, address, email) values(1,'John Doe','Bangalore, Karnataka','johndoe@gmail.com');