function UserController($scope) {
   $scope.userList = [
      new User("John", "Doe"),
      new User("Henri", "de Bourbon"),
      new User("Marguerite", "de Valois"),
      new User("Gabrielle", "d'Estrees")
   ];

   // select the first user of the list
   $scope.currentUser = $scope.userList[0];

   // expose a callable method to the view
   $scope.selectUser = function (user) {
      $scope.currentUser = user;
   }
}