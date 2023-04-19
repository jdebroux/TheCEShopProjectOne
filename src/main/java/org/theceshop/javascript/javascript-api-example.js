$http({
    method: 'GET',
    url: '/api/users/${userId}/courses/${courseId}/progress',
    headers: {
        'Content-Type': 'application/json'
    }
}).then(function successCallback(response) {
    // handle success response here
}, function errorCallback(response) {
    // handle error response here
});