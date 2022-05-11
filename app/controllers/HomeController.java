package controllers;
import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;
import play.mvc.*;
import core.StringCutter;

public class HomeController extends Controller {

    public static final String STRING_TO_CUT = "string_to_cut";

    public Result index() {
        return ok("I ride Lyft.");
    }

    public static class Answer {
        public String return_string;
    }

    public Result lyftTest(Http.Request request) {
        JsonNode json = request.body().asJson();
        String stringToCut = json.get(STRING_TO_CUT).textValue();
        Answer ans = new Answer();
        ans.return_string = StringCutter.cut(stringToCut);
        JsonNode jsonReturn = Json.toJson(ans);
        return ok(jsonReturn);
    }

}
