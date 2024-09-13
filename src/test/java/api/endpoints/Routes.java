package api.endpoints;

/*
 maintain urls
 Swagger url--> https://petstore.swagger.io
 
  create user(Post) :https://petstore.swagger.io/v2/user
  Get user(Get):https://petstore.swagger.io/v2/user/{username}
  update user(post)  :https://petstore.swagger.io/v2/user/{username}
  Delete user(Delete):https://petstore.swagger.io/v2/user/{username}
 */

public class Routes {
  public static String base_url="  create user(Post) :https://petstore.swagger.io/v2"; /*static because call it without creating any object directly call by class name Routes/*
  */
  //user module
  public static String post_url=base_url+"/user";//use above variable
  public static String get_url=base_url+"/user/{username}";
  public static String update_url=base_url+"/user/{username}";
  public static String delete_url=base_url+"/user/{username}";
  
  //STORE MODULE
    //HERE WE WILL CREATE STORE MODULE URL'S
  
  //PET MODULE
    //HERE WE CREATE PET MODULE URL'S

}
