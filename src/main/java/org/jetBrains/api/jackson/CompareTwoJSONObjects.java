package org.jetBrains.api.jackson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class CompareTwoJSONObjects {

    public static void main(String[] args) throws IOException {
        //https://www.baeldung.com/jackson-compare-two-json-objects
        ObjectMapper objectMapper = new ObjectMapper();

        String string1 = "{\"fullName\": \"Emily Jenkins\", \"id\": 1, \"age\": 27}";
        String string2 = "{\"fullName\": \"Emily Jenkins\", \"age\": 27, \"id\": 2}";
        //only a json object
        assertNotEquals(objectMapper.readTree(string1), objectMapper.readTree(string2));

        String objmapper1 = "{    \"employee\":    {        \"id\": \"1212\",        \"fullName\": \"John Miles\",        \"age\": 34    }}";
        String objmapper2 = "{       \"employee\":    {        \"id\": \"1212\",        \"age\": 34,        \"fullName\": \"John Miles\"    }}";
        //A nested json object. It's important to note that even though the order of attributes in input JSON variables s1 and s2 is not the same, the equals() method ignores the order and treats them as equal.
        assertEquals(objectMapper.readTree(objmapper1), objectMapper.readTree(objmapper2));

        String str1 = "{    \"employee\":    {        \"id\": \"1212\",        \"age\": 34,        \"fullName\": \"John Miles\",        \"skills\": [\"Java\", \"C++\", \"Python\"]     } }";
        String str2 = "{    \"employee\":    {        \"id\": \"1212\",        \"fullName\": \"John Miles\",        \"age\": 34,        \"skills\": [\"Java\", \"C++\", \"Python\"]    }}";

        assertEquals(objectMapper.readTree(str1), objectMapper.readTree(str2));

        String s1 = "{\"name\": \"John\",    \"score\": 5.0}";
        String s2 = "{\"name\": \"John\",    \"score\": 5}";

        JsonNode obj1 = objectMapper.readTree(s1);
        JsonNode obj2 = objectMapper.readTree(s2);
        assertNotEquals(obj1, obj2);


    }

}
