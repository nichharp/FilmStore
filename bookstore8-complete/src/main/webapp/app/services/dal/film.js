"use strict";

(function () {

    angular.module("filmStore").service("filmDal", ["dal", FilmDal]);

    function FilmDal (dal) {

        this.getFilms = function () {
            return dal.http.GET("rest/bookstore/json");
        };

        this.saveFilms = function (filmToSave) {
            return dal.http.POST("rest/bookstore/json", filmToSave);
        };

        this.updateFilm = function (filmToUpdate) {
            return dal.http.PUT("rest/bookstore/json/", filmToUpdate);
        };

        this.deleteFilm = function (filmToDelete) {
            return dal.http.DELETE("/rest/bookstore/json/", filmToDelete);
        };

    }
}());
