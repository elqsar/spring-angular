/**
 * Created by musatov on 23.4.2014.
 */
angular.module('springApp').controller('TemplateCtrl', function ($scope, TestSvc) {
    TestSvc.getData().then(function (response) {
        $scope.result = response.data;
    });
    TestSvc.getUsers().then(function (response) {
        $scope.users = response.data;
    });
});