angular.module('hello', [])
  .controller('home', function($scope, $http) {
  // Simple GET request example:
$scope.greeting = {};
  $http({
    method: 'GET',
    url: '/api/livro/getLivro',
     headers: {
       'Content-Type': 'application/json'
     }
  }).then(function successCallback(response) {
      $scope.greeting = response;
    }, function errorCallback(response) {
    console.log(response);
    $scope.greeting = "erro";
      // called asynchronously if an error occurs
      // or server returns response with an error status.
    });
});

