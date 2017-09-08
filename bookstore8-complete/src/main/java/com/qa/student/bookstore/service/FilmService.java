package com.qa.student.bookstore.service;

public interface FilmService {

	String getAllFilms();

	String addNewFilm(String filmJson);

	String replaceFilm(Integer filmId, String updatedFilm);

	String deleteFilm(Integer filmId);

}