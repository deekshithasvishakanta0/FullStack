function xorstackViewController($rootScope,$scope,Restangular,$q,$state,$http) {
    $rootScope.navSelectedLi = 2;
    $scope.$on('$locationChangeStart', function(event) {
        event.preventDefault();
    })

   //$scope.userImage = "file:///"+pathUrl;
};

    $scope.list={};
    Restangular.one('profile',$rootScope.data).get().then(function(result){
        //newResDeferred.resolve(result);
        $scope.list =  result.data; 
    });
    $scope.modify = function(list){

				$scope.modifyField = true;
				$scope.viewField = true;
			};

            $scope.profileModel={};
			$scope.update = function(list){
                $scope.xorstackModel.Id=list.Id;
				$scope.xorstackModel.firstName =list.firstName;
                $scope.xorstackModel.middleName =list.middleName;
                $scope.xorstackModel.lastName = list.lastName;
                
                $scope.xorstackModel.status = "true";
                $http.put('http://localhost:8083/ltt/api/v1/updatexorstack',$scope.xorstackModel).then(function(response){
                $scope.result=response;
				  if($scope.result.status=="200")
				  {
					  alert("Success");
					 
				  }
				  else{
					  alert("fail");
					}
                 });
                $scope.modifyField = false;
				$scope.viewField = false;
			};
module.exports = xorstackViewController;