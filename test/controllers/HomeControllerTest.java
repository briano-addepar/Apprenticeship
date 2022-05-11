package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.Test;
import play.Application;
import play.inject.guice.GuiceApplicationBuilder;
import play.libs.Json;
import play.mvc.Http;
import play.mvc.Result;
import play.test.WithApplication;
import static org.junit.Assert.assertEquals;
import static play.mvc.Http.Status.OK;
import static play.test.Helpers.*;


public class HomeControllerTest extends WithApplication {

    @Override
    protected Application provideApplication() {
        return new GuiceApplicationBuilder().build();
    }

    @Test
    public void testIndex() {
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/");

        Result result = route(app, request);
        assertEquals(OK, result.status());
        assertEquals("I ride Lyft.", contentAsString(result));
    }

    public static class TestBody {
        public String string_to_cut;
    }

    @Test
    public void testEndpointTest() {
        TestBody testBody = new TestBody();
        testBody.string_to_cut = "iamyourlyftdriver";
        JsonNode bodyJson = Json.toJson(testBody);

        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(POST)
                .bodyJson(bodyJson)
                .uri("/test");

        Result result = route(app, request);
        assertEquals(OK, result.status());
        JsonNode jsonResponse = Json.parse(contentAsString(result));
        assertEquals("muydv", jsonResponse.get("return_string").textValue());
    }


}
