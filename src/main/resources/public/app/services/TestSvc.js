/**
 * Created by musatov on 23.4.2014.
 */
angular.module('springApp').factory('TestSvc', function($http, $q){
    return {
        getData: function() {
            var dfd = $q.defer();
            $http.get('/test').then(function(data, status, headers, config){
                dfd.resolve(data);
            }, function(err){
                console.log(err);
                dfd.reject('Reason');
            });
            return dfd.promise;
        },
        getUsers: function() {
            var dfd = $q.defer();
            $http.get('/users').then(function(data, status, headers, config){
                dfd.resolve(data);
            }, function(err){
                dfd.reject('Reason');
            });
            return dfd.promise;
        }
    };
});