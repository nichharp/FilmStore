"use strict";

(function () {

    angular.module('filmStore').config(function ($stateProvider, $urlRouterProvider) {
        $urlRouterProvider.otherwise("/book");

        $stateProvider.state("book", {
            url: "/book",
            templateUrl: "app/feature/book/films.html"
        }).state("dashboard", {
            url: "/dashboard",
            templateUrl: "app/feature/dashboard/dashboard.html"
        })
    });
}());