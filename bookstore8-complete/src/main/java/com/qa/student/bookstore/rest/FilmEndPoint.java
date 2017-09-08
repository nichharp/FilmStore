package com.qa.student.bookstore.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.student.bookstore.service.FilmService;

@Path("/bookstore")
public class FilmEndPoint {

	@Inject
	private FilmService filmService;

	@GET
	@Path("/json")
	@Produces({ "application/json" })
	public String getFilmsAsJson() {
		return filmService.getAllFilms();
	}

	@POST
	@Path("/json")
	@Produces({ "application/json" })
	public String addNewFilmToMap(String filmJson) {
		return filmService.addNewFilm(filmJson);
	}

	@PUT
	@Path("/json/{id}")
	@Produces({ "application/json" })
	public String replaceFilmFromFilmStore(@PathParam("id") Integer id, String filmJson) {
		return filmService.replaceFilm(id, filmJson);
	}

	@DELETE
	@Path("/json/{id}")
	@Produces({ "application/json" })
	public String deleteFilmFromFilmStore(@PathParam("id") Integer id) {
		return filmService.deleteFilm(id);
	}

}
