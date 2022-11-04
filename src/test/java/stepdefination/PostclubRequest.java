package stepdefination;

import org.json.simple.JSONObject;
import static io.restassured.RestAssured.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostclubRequest {
	
	RequestSpecification req;
	Response res;
	ValidatableResponse validate;
	@Given("user wants to provide the data in the database")
	public void user_wants_to_provide_the_data_in_the_database() {
		
		
	   JSONObject obj = new JSONObject();
	   obj.put("id", 65);
	   obj.put("name","pencil");
	   obj.put("duration", 12);
	   obj.put("price", 700);
	   obj.put("packageStatus","run");
	  req=RestAssured.given();
	  req.body(obj);
	  req.contentType(ContentType.JSON);
	}

	@When("user posts the data bu using the api is {string}")
	public void user_posts_the_data_bu_using_the_api_is(String url) {
		res = req.post(url);
	   
	}

	@Then("user checks the status code is {int}")
	public void user_checks_the_status_code_is(Integer int1) {
		validate =res.then();
		validate.assertThat().statusCode(int1).log().all();
	  
	}


}
