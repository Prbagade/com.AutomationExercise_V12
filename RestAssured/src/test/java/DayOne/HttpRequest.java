package DayOne;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;

public class HttpRequest {

	int id;
	
	@Test(priority=1)
	void getUser() {

				given()

//				.when().get("https://reqres.in/api/users?page=2")
				.when().get("http://localhost:3000/students")
				

				.then()
					.statusCode(200)
//		 			.body("id", equalTo(1))
					.log().all();

	}

	
	
	@Test(priority=2)
	void creatUser() {
		
		HashMap hm = new HashMap();
		hm.put("name", "Prafull");
		hm.put("location", "manora");

		id=given()
			.contentType("application/json")	
			.body(hm)

		.when()
			.post("http://localhost:3000/students")
			.jsonPath().getInt("id");

//		.then()
//			.statusCode(201)
//			.log().all();

	}
	
	@Test(priority=3,dependsOnMethods = {"creatUser"})
	void updateUser() 
	{
		HashMap hm = new HashMap();
			hm.put("name", "Ganesh");
			hm.put("location", "akola");
		
		given()
			.contentType("application/json")
			.body(hm)
		
		
		.when()
			.put("http://localhost:3000/students/"+id)
		
			
		.then()
			.statusCode(200)
			.log().all();
	}
	
	@Test(priority=4)
	void deleteUser() 
	{
		
		given()
			
		
		.when()
			.delete("http://localhost:3000/students/"+id)
		
		.then()
			.statusCode(204)
			.log().all();
	}	
}
