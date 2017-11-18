# spring-boot
This is basic spring boot app which includes simple CRUD operation 

# Endpoints 

1. POST localhost:8080/spring-boot/v1/users/ 
   This endpoint call will create new user .
   Input body :
   {"id":"1","fName":"Bharat","lName":"devre","email":"abc@xyz.com","pinCode":11,"birthDate":"12-JAN-2017","active":false}

2. PUT localhost:8080/spring-boot/v1/users/ 
   This endpoint call will update expisting user .
   Input body :
   {"id":"1","fName":"Bharat","lName":"devre","email":"abc@xyz.com","pinCode":11,"birthDate":"12-JAN-2017","active":false}

3. DELETE localhost:8080/spring-boot/v1/users/{id} 
   This endpoint call will delete the user .
   
   
4. GET localhost:8080/spring-boot/v1/users/
   This enpoint will give you list of users .
