package DayOne;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class Demo {

	
	
	public static void main(String[] args) {
		
		
//		RestAssured.baseURI="https://jobs.postmanatwork.com/";
		
		given()
		.queryParam("location","San Francisco")
		
		.when().get("https://jobs.postmanatwork.com/jobs")
		
		.then()
		.statusCode(200)
		.log().all();
		
	}
}
