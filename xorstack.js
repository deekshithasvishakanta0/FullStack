function xorstackController($rootScope,$scope,Restangular,$q,$window,$state,$http) {
	//Hide home screen 
	$rootScope.homeScreen = true;
	$scope.$on('$locationChangeStart', function(event) {
        event.preventDefault();
    })
	
	//*****************************controller for post*********************/
	$scope.employeeModel={};
	$scope.savexorstackData=function(isValid){
	  $scope.submitted = true;
	  if(isValid){
		   
			$scope.submitted = false;
			$scope.xorstack.id = $scope.id;
			$scope.xorstack.firstName = $scope.fname;
            $scope.xorstack.middleName = $scope.mname;
			$scope.xorstack.lastName = $scope.lname;
			$scope.xorstack.roleId="2";
			$scope.xorstack.status = "true";
		  if($scope.password == $scope.cpswd){
			   $scope.equalsTo = false;
			  Restangular.all('profile').post($scope.xorstack).then(function(response){
				  $scope.result=response;
				  if(response.status=="SUCCESS")
				  {
					  alert("Registration Succesfull");
					  $scope.id=undefined
					  $scope.fname=undefined;
                      $scope.mname=undefined;
					  $scope.lname=undefined;
					 
				  }
				  else{
					  alert("fail");
					}
			  });
		  }
		else
			$scope.equalsTo = true;
	  }
	};

}
module.exports = xorstackController;