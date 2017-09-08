(function() {

    var FilmService =  function(filmDal) {

    	this.getFilms = function()
        {
            return filmDal.getFilms();
        };
    };

    angular.module('filmStore').service('filmService', ['filmDal', FilmService]);
}());