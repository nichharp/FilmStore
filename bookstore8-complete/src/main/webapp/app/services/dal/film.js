"use strict";

(function () {

    angular.module("filmStore").service("filmDal", ["dal", FilmDal]);

    function FilmDal (dal) {

        this.getFilms = function () {
            return dal.http.GET("rest/filmstore/json");
        };

        this.saveFilms = function (filmToSave) {
            return dal.http.POST("rest/filmstore/json", filmToSave);
        };

        this.updateFilm = function (filmToUpdate) {
            return dal.http.PUT("rest/filmstore/json/", filmToUpdate);
        };

        this.deleteFilm = function (filmToDelete) {
            return dal.http.DELETE("/rest/filmstore/json/", filmToDelete);
        };

    }
}());
