/**
 * Created by musatov on 23.4.2014.
 */
angular.module('springApp').controller('AnotherCtrl', function($scope, AnotherSvc){
    AnotherSvc.getData().then(function(response){
        $scope.result = response.data;
    });
});