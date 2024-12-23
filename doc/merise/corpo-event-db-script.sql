DROP DATABASE corpo_event;

CREATE USER corpo_event WITH PASSWORD 'corpo_event';
CREATE DATABASE corpo_event;

\c corpo_event;

CREATE TABLE roles(
   role_id UUID,
   role_name VARCHAR(50) ,
   PRIMARY KEY(role_id)
);

CREATE TABLE locations(
   location_id UUID,
   location_name VARCHAR(50) ,
   PRIMARY KEY(location_id)
);

CREATE TABLE users(
   user_id UUID,
   first_name VARCHAR(50) ,
   last_name VARCHAR(50) ,
   pass VARCHAR(50) ,
   mail VARCHAR(50) ,
   role_id UUID NOT NULL,
   PRIMARY KEY(user_id),
   FOREIGN KEY(role_id) REFERENCES roles(role_id)
);

CREATE TABLE event(
   event_id UUID,
   event_name VARCHAR(50) ,
   event_description VARCHAR(255) ,
   starts_at TIMESTAMP,
   created_at TIMESTAMP,
   finish_at TIMESTAMP,
   location_id UUID NOT NULL,
   user_id UUID NOT NULL,
   PRIMARY KEY(event_id),
   FOREIGN KEY(location_id) REFERENCES locations(location_id),
   FOREIGN KEY(user_id) REFERENCES users(user_id)
);

CREATE TABLE comments(
   comment_id UUID,
   comment_body VARCHAR(255) ,
   created_at TIMESTAMP,
   event_id UUID NOT NULL,
   user_id UUID NOT NULL,
   PRIMARY KEY(comment_id),
   FOREIGN KEY(event_id) REFERENCES event(event_id),
   FOREIGN KEY(user_id) REFERENCES users(user_id)
);

GRANT all privileges on database corpo_event to corpo_event;
