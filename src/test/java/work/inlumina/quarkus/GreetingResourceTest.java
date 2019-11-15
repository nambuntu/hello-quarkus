package work.inlumina.quarkus;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import java.util.UUID;

@QuarkusTest
public class GreetingResourceTest {

	@Test
	public void testGreetingEndpoint() {
		String uuid = UUID.randomUUID().toString();
		
		given()
		.pathParam("name", uuid)
		.when()
		.get("/greeting/hello/{name}")
		.then()
		.statusCode(200)
		.body(is("hello " + uuid));
	}

}