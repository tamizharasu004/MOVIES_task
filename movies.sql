CREATE DATABASE movi;
USE movi;

CREATE TABLE movies (
    id INT PRIMARY KEY NOT NULL,
    movie_name VARCHAR(150) NOT NULL,
    rating INT,
    year INT
);