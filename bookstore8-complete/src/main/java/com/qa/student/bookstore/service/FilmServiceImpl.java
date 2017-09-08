package com.qa.student.bookstore.service;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import com.qa.bookstore.model.Film;
import org.apache.log4j.Logger;

import com.qa.bookstore.util.JSONUtil;

@ApplicationScoped
@Alternative
public class FilmServiceImpl implements FilmService {

	private static final Logger LOGGER = Logger.getLogger(FilmServiceImpl.class);
	private final int INITIAL_COUNT = 1;
	private Map<Integer, Film> filmMap;
	private int ID;

	@Inject
	private JSONUtil util;

	public FilmServiceImpl() {
		this.filmMap = new HashMap<Integer, Film>();
		ID = INITIAL_COUNT;
		initFilmStore();
	}

	@Override
	public String getAllFilms() {
		return util.getJSONForObject(filmMap.values());
	}

	@Override
	public String addNewFilm(String filmJson) {
		ID++;
		Film newFilm = util.getObjectForJSON(filmJson, Film.class);
		LOGGER.info("In add film method about to add to map");
		filmMap.put(ID, newFilm);
		LOGGER.info("In add film method book added to map");
		return filmJson;
	}

	@Override
	public String replaceFilm(Integer filmId, String updatedFilm) {
		Film newFilm = util.getObjectForJSON(updatedFilm, Film.class);
		filmMap.put(filmId, newFilm);
		return updatedFilm;
	}

	@Override
	public String deleteFilm(Integer filmId) {
		LOGGER.info("In delete film method about to remove film");
		filmMap.remove(filmId);
		LOGGER.info("In delete film method film removed");
		return "{\"message\": \"film sucessfully removed\"}";
	}

	private void initFilmStore() {
		Film aFilm = new Film("Eragon", "Stefan Fangmeier", 2006, "PG", 104, "In his homeland of Alagaesia, a farm boy happens upon a dragon's egg -- a discovery that leads him on a predestined journey where he realizes he's the one person who can defend his home against an evil king.", "<iframe width=\"640\" height=\"360\" src=\"https://www.youtube.com/embed/b5eMJkuJHwo\" frameborder=\"0\" allowfullscreen></iframe>" );
		filmMap.put(1, aFilm);
	}

}
