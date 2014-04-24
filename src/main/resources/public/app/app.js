/**
 * Created by musatov on 22.4.2014.
 */
angular.module('springApp',['ui.router']).config(function($stateProvider, $urlRouterProvider) {
    // states
    $urlRouterProvider.otherwise('/');
    $stateProvider
        .state('home', {
            url: '/',
            views:{
                'viewOne': {templateUrl: 'partials/home.html'}
            }
        })
        .state('template1', {
            url: "/template1",
            views: {
                'viewOne': {templateUrl: "partials/template1.html"}
            }
        })
        .state('template2', {
            url: "/template2",
            views: {
                'viewOne': {templateUrl: "partials/template2.html"},
                'viewTwo': {templateUrl: "partials/template3.html"}
            }
        });
});
