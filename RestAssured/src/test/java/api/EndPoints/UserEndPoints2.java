package api.EndPoints;

import static io.restassured.RestAssured.given;
import java.util.ResourceBundle;
import api.PayLoad.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UserEndPoints2 {

	// method created for get urls from properties file
	static ResourceBundle getURL() {
		ResourceBundle routes = ResourceBundle.getBundle("routes"); // load properties file
		return routes;
	}

	public static Response createUser(User payload) {
		String post_url = getURL().getString("post_Url");

		Response response = given().accept(ContentType.JSON).contentType(ContentType.JSON).body(payload)

				.when().post(post_url);

		return response;

	}

	public static Response getUser(String userName) {
		String get_url = getURL().getString("get_Url");

		Response response = given().accept(ContentType.JSON).pathParam("username", userName)

				.when().get(get_url);

		return response;
	}

	public static Response putUser(String userName, User payload) {
		String put_url = getURL().getString("put_Url");

		Response response = given().accept(ContentType.JSON).contentType(ContentType.JSON)
				.pathParam("username", userName).body(payload)

				.when().put(put_url);

		return response;
	}

	public static Response DeleteUser(String userName) {
		String del_url = getURL().getString("del_Url");

		Response response = given().accept(ContentType.JSON).pathParam("username", userName)

				.when().delete(del_url);

		return response;
	}
}
