package api.EndPoints;

public class Routes {

	/*
	 * Create User	POST	https://petstore.swagger.io/v2/user
	   Get User		GET		https://petstore.swagger.io/v2/user/{username}
	   Update User	PUT		https://petstore.swagger.io/v2/user/{username}
	   Delete User	DELETE	https://petstore.swagger.io/v2/user/{username}
	 */
	
	
	public static String base_Url = "https://petstore.swagger.io/v2";

	//User model urls
	public static String post_Url = base_Url+"/user";
	public static String get_Url = base_Url+"/user/{username}";
	public static String put_Url = base_Url+"/user/{username}";
	public static String del_Url = base_Url+"/user/{username}";
	
	
	

}
