package api.EndPoints;

import static io.restassured.RestAssured.given;

import api.PayLoad.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class UserEndPoints {

	
	public static Response createUser(User payload) 
	{
		Response response = given()
		.accept(ContentType.JSON)
		.contentType(ContentType.JSON)
		.body(payload)
		
		.when()
		.post(Routes.post_Url);
		
		return response;
		
	}
	
	public static Response getUser(String userName) 
	{
		Response response = given()
				.accept(ContentType.JSON)
				.pathParam("username", userName)
				
				.when()
				.get(Routes.get_Url);
		
		return response;	
	}
	
	public static Response putUser(String userName,User payload) 
	{
		Response response = given()
				.accept(ContentType.JSON)
				.contentType(ContentType.JSON)
				.pathParam("username", userName)
				.body(payload)
				
				.when()
				.put(Routes.put_Url);
		
		return response;	
	}
	
	public static Response DeleteUser(String userName) 
	{
		Response response = given()
				.accept(ContentType.JSON)
				.pathParam("username", userName)
				
				.when()
				.delete(Routes.del_Url);
		
		return response;	
	}
}
