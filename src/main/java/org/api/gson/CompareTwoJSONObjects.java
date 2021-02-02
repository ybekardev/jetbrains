package org.api.gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import io.restassured.path.json.JsonPath;

import java.io.File;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

public class CompareTwoJSONObjects {

    public static void main(String[] args) {
        //https://www.baeldung.com/gson-compare-json-objects
        String string1 = "{\"fullName\": \"Emily Jenkins\", \"age\": 27}";
        String string2 = "{\"fullName\": \"Emily Jenkins\", \"age\": 27}";

        assertThat(string1, equalTo(string2));

        JsonParser parser = new JsonParser();
        String objectString = "{\"customer\": {\"fullName\": \"Emily Jenkins\", \"age\": 27 }}";
        String arrayString = "[10, 20, 30]";
        String objectMix = "{\"customer\": [{\"fullName\": \"Emily Jenkins\", \"age\": 27 }]}";

        JsonElement json1 = parser.parse(objectString);
        JsonElement json2 = parser.parse(arrayString);
        JsonElement json3 = parser.parse(objectMix);

        //or we can directly validate without Json
        assertTrue(json1.isJsonObject());
        assertTrue(json2.isJsonArray());
        assertTrue(json3.isJsonObject());

        assertTrue(parser.parse(objectString).isJsonObject());
        assertTrue(parser.parse(arrayString).isJsonArray());
        assertTrue(parser.parse(objectMix).isJsonObject());

        String str1 = "\"{\"customer\":{\"id\":44521,\"fullName\":\"Emily Jenkins\",\"age\":27}}\"";
        String str2 = "\"{\"customer\":{\"id\":44521,\"age\":27,\"fullName\":\"Emily Jenkins\"}}\"";

        assertEquals(parser.equals(str1), parser.equals(str2));

        String str3 = "[12, 20, 30]";
        assertTrue(parser.parse(str3).isJsonArray());

        String str4 = "[21,2,30]";
        assertNotEquals(parser.parse(str3), parser.parse(str4));

        File file = new File("src/main/java/org/api/gson/payload.json");
        File file2 = new File("src/main/java/org/api/gson/payload2.json");

        assertEquals(parser.equals(file), parser.equals(file2));

    }

}
