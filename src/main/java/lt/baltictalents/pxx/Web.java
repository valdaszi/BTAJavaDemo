package lt.baltictalents.pxx;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.port;

/**
 * demo
 * http://sparkjava.com/
 *
 * Created by valdas on 2018-03-01.
 */
public class Web {

    public static void main(String[] args) {
        port(12345); // galima pakeisti porta jei netinka 4567

        get("/hello", (request, response) -> "Hello World");

        get("/hello/:name", (request, response) ->
                "Hello " + request.params(":name"));

        get("/api/abc", (request, response) -> {

            Map<String, Object> result = new HashMap<>();
            result.put("vardas", "Jonas");
            result.put("pavardė", "Jonaitis");
            result.put("ūgis", 185);
            result.put("svoris", 99.9);
            result.put("šeima", true);
            result.put("gimimo_data", LocalDate.of(1999, 12, 31));

            response.type("application/json");
            return new GsonBuilder().create().toJson(result);
        });
    }
}
