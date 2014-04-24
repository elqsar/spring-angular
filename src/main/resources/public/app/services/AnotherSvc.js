/**
 * Created by musatov on 23.4.2014.
 */
angular.module('springApp').factory('AnotherSvc', function($http, $q){
    return {
        getData: function() {
            var dfd = $q.defer();
            $http.get('/another').then(function(data, status, headers, config){
                dfd.resolve(data);
            }, function(err){
                dfd.reject('Reason');
            });
            return dfd.promise;
        }
    };
});