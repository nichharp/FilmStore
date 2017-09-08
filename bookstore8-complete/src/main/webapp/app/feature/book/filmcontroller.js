(function() {

    var FilmController =  function(filmService)
    {
        var vm = this;
        
        vm.reverse =false;

        vm.doSort = function()
        {
            vm.sortby = 'Title';
            vm.reverse= !vm.reverse
        };

        function init() {
             filmService.getFilms().then(function (results) {
            	 console.log("In film controller about to return data to the client with results " + results);
            	 vm.books  = results;
             }, function (error) {
                 vm.error = true;
                 vm.errorMessage = error;
             });
        }
        
        init();
    };
    angular.module('filmStore').controller('FilmController', ['filmService', FilmController]);
}());