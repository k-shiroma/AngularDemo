var myApp = angular.module('myApp', []);
myApp.controller('MyController', ['$scope', function($scope){
    $scope.myData = [
      {group:"AAAGrp", kbn:"aaaKbn", name:"apple", cost:2, costTime:30},
      {group:"AAAGrp", kbn:"aaaKbn", name:"bear", cost:4, costTime:40},
      {group:"AAAGrp", kbn:"aaaKbn", name:"cream", cost:32, costTime:50},
      {group:"AAAGrp", kbn:"aa2Kbn", name:"diet", cost:3, costTime:120},
      {group:"AAAGrp", kbn:"aa2Kbn", name:"element", cost:5, costTime:240},
      {group:"AAAGrp", kbn:"aa2Kbn", name:"final", cost:2015, costTime:720},
      {group:"AAAGrp", kbn:"abaKbn", name:"great", cost:3, costTime:30},
      {group:"AAAGrp", kbn:"abaKbn", name:"high", cost:5, costTime:40},
      {group:"AAAGrp", kbn:"abaKbn", name:"interface", cost:32, costTime:50},
      {group:"AAAGrp", kbn:"ab2Kbn", name:"javascript", cost:1, costTime:120},
      {group:"AAAGrp", kbn:"ab2Kbn", name:"knockout.js", cost:4, costTime:240},
      {group:"AAAGrp", kbn:"ab2Kbn", name:"layer", cost:2015, costTime:360},
      {group:"BBBGrp", kbn:"baaKbn", name:"merge", cost:3, costTime:40},
      {group:"BBBGrp", kbn:"baaKbn", name:"notice", cost:6, costTime:50},
      {group:"BBBGrp", kbn:"baaKbn", name:"operation", cost:34, costTime:60}
    ];
}]);