package api.endpoints;
import static io.restassured.RestAssured.given;

import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
//UserEndPoints.java
//Create for perform Create,Read,Update,Delete request to the user API

public class UserEndPoints {
	//create methods for endpoint and this endpoints method only can acess from Test Cases's methods
	
	public static  Response createUser(User  payload){
		Response response=given()
		  .contentType(ContentType.JSON)
		  .accept(ContentType.JSON)
		  .body(payload)
		.when()
		  .post(Routes.post_url);
		
		return response;
	}
	//READ USER
	
	public static  Response readUser(String userName ){
		Response response=given()
		     .pathParam("username",userName)
		.when()
		  .get(Routes.get_url);
		
		return response;
	}
	
	//UPDATE  USER
	public static  Response updateUser(String userName ,User payload){
		Response response=given()
		  .contentType(ContentType.JSON)
		  .accept(ContentType.JSON)
		  .pathParam("username",userName )
		  .body(payload)
		.when()
		  .post(Routes.post_url);
		
		return response;
	}
	
//DELETE USER
	
	public static  Response deleteUser(String userName ){
		Response response=given()
		     .pathParam("username",userName)
		.when()
		  .get(Routes.delete_url);
		
		return response;
	}
}
