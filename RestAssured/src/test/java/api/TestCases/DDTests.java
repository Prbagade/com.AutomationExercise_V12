package api.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.EndPoints.UserEndPoints;
import api.PayLoad.User;
import api.Utilities.DataProviders;
import io.restassured.response.Response;

public class DDTests {

	@Test(priority = 1,dataProvider = "Data",dataProviderClass = DataProviders.class)
	public void testPostUser(String userID, String userName,String fname,String lname, String userEmail,String pwd, String ph) 
	{
		User userPayload = new User();
		
		userPayload.setId(Integer.parseInt(userID));
		userPayload.setUsername(userName);
		userPayload.setFirstName(fname);
		userPayload.setLastName(lname);
		userPayload.setEmail(userEmail);
		userPayload.setPassword(pwd);
		userPayload.setPhone(ph);
		
		Response response = UserEndPoints.createUser(userPayload);
		Assert.assertEquals(response.getStatusCode(), 200);
		
	}
	
	@Test(priority=2,dataProvider = "UserName", dataProviderClass = DataProviders.class)
	public void testDeleteUserByName(String userName) 
	{
		Response response= UserEndPoints.DeleteUser(userName);
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	
	
}
