# DecodeIdToken

Decode ID TOKEN by JWT

This program decode the Id_token and retreive user information.

# Project Creation

- Craete project as Maven 

- Add the following dependency into pom.xml
    
```
        <dependency>       
          <groupId>com.auth0</groupId>
          <artifactId>java-jwt</artifactId>
          <version>3.2.0</version>
        </dependency>
```
  
  - Sample Code
  	
    
```
      //Give your Id Token to decrypt
		String id_token = "eyJ0eXAiOiJKV1QiLCJraWQiOiJ3VTNpZklJYUxPVUFSZVJCL0ZHNmVNMVAxUU09IiwiYWxnIjoiUlMyNTYifQ.eyJhdF9oYX";
		
		//decrypt id_token
		DecodedJWT jwt = JWT.decode(id_token);
		
		String iss=jwt.getClaim("iss").asString();
 ```   
    
### For more details www.narayanatutorial.com

