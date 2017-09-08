"use strict";

(function () {

    angular.module('filmStore').config(function ($stateProvider, $urlRouterProvider) {
        $urlRouterProvider.otherwise("/film");

        $stateProvider.state("film", {
            url: "/film",
            templateUrl: "app/feature/book/films.html"
        }).state("dashboard", {
            url: "/dashboard",
            templateUrl: "app/feature/dashboard/dashboard.html"
        })
    });
}());