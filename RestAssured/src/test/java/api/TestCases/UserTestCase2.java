package api.TestCases;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.github.javafaker.Faker;
import api.EndPoints.UserEndPoints2;
import api.PayLoad.User;
import io.restassured.response.Response;

public class UserTestCase2 {

	Faker faker;
	User userPayload;
	public Logger logger;
	
	@BeforeClass
	public void UserTest() {
		faker = new Faker();
		userPayload = new User();

		userPayload.setId(faker.idNumber().hashCode());
		userPayload.setUsername(faker.name().username());
		userPayload.setFirstName(faker.name().firstName());
		userPayload.setLastName(faker.name().lastName());
		userPayload.setEmail(faker.internet().safeEmailAddress());
		userPayload.setPassword(faker.internet().password(5, 10));
		userPayload.setPhone(faker.phoneNumber().cellPhone());

		//logs
		logger =LogManager.getLogger(this.getClass());
		
//		logger.debug("debugging...");
	}

	@Test(priority = 1)
	public void testCreateUser() {
		
		logger.info("*********Creating user**********");
		Response response = UserEndPoints2.createUser(userPayload);
		System.out.println("User created...");

		// log response
		response.then().log().all();

		// validation
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("*********User is created**********");
	}

	@Test(priority = 2)
	public void testGetUser() {

		logger.info("*********Reading user info**********");
		Response response = UserEndPoints2.getUser(this.userPayload.getUsername());
		System.out.println("Get User data...");

		// log response
		response.then().log().all();

		// validation
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("*********User info is displayed**********");

	}

	@Test(priority = 3)
	public void testPutUser() {

		logger.info("*********User info is Updating**********");
		userPayload.setFirstName(faker.name().firstName());
		Response response = UserEndPoints2.putUser(this.userPayload.getUsername(), userPayload);
//		System.out.println("Update User data...");

		// log response
		response.then().log().all();

		// validation
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("*********User is Updated**********");

		// read user data is updated or not?

		Response responsePostUpdate = UserEndPoints2.getUser(this.userPayload.getUsername());
		System.out.println("After Update User data...");
		responsePostUpdate.then().log().all();

	}

	@Test(priority = 4)
	public void testDeleteUser() {

		logger.info("*********User is Deleting**********");
		Response response = UserEndPoints2.DeleteUser(this.userPayload.getUsername());
		System.out.println("Delete User data...");

		// log response
		response.then().log().all();

		// validation
		Assert.assertEquals(response.getStatusCode(), 200);
		logger.info("*********User is Deleted**********");
	}
}
