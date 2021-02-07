package org.jetBrains.api.json;

import com.google.gson.*;
import com.jayway.jsonpath.JsonPath;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JsonNodes {

    public static void main(String[] args) throws IOException, ParseException {

        ObjectMapper objectMapper = new ObjectMapper();
        String str1 = "{    \"employee\":    {        \"id\": \"1212\",        \"age\": 34,        \"fullName\": \"John Miles\",        \"skills\": [\"Java\", \"C++\", \"Python\"]     } }";
        String str2 = "{    \"employee\":    {        \"id\": \"1212\",        \"fullName\": \"John Miles\",        \"age\": 34,        \"skills\": [\"Java\", \"C++\", \"Python\"]    }}";

        assertEquals(objectMapper.readTree(str1), objectMapper.readTree(str2));

        JsonNode obj1 = objectMapper.readTree(str1);
        JsonNode obj2 = objectMapper.readTree(str2);
        assertEquals(obj1, obj2);
        JsonNode jnode = obj1.get("employee");
        System.out.println(jnode);

        File file = new File("src/main/java/org/api/gson/payload.json");
        JsonNode fileNode = objectMapper.readTree(file);
        JsonNode getFileNode2 = fileNode.get("customer");
        System.out.println(getFileNode2);
        JsonNode getNode = getFileNode2.get("fullName");
        System.out.println(getNode);

        String body = "{\"firstName\":\"Johnson\",\"age\":34,\"mail\":\"johnson@yahoo.com\",\"address\":{\"country\":\"USA\",\"city\":\"Charlotte\"},\"familyMemberList\":[{\"role\":\"wife\",\"age\":30},{\"role\":\"son\",\"age\":6}]}";

        String jsonValueFamilyMember = JsonPath.read(body, "familyMemberList[1].role");
        System.out.println(jsonValueFamilyMember);

        JsonParser parser = new JsonParser();
        JsonObject rootObject = parser.parse(body).getAsJsonObject();
        JsonArray transactions = rootObject.getAsJsonArray("familyMemberList");
        System.out.println(transactions);
        JsonObject memberListObject = transactions.get(0).getAsJsonObject();
        System.out.println(memberListObject);
        String role= memberListObject .get("role").getAsString();
        System.out.println("role: " + role);

        Gson gson = new Gson();
        JsonElement element = gson.fromJson (body, JsonElement.class); //Converts the json string to JsonElement without POJO
        JsonObject jsonObj = element.getAsJsonObject(); //Converting JsonElement to JsonObject
        System.out.println(jsonObj);

        String jsonValueAge = jsonObj.get("age").getAsString();
        System.out.println(jsonValueAge + " is the node value");

        JsonElement jsonValueAddress = jsonObj.getAsJsonObject("address").get("country");
        String jsonAddress = jsonObj.getAsJsonObject("address").get("country").getAsString();
        System.out.println("JsonElement - country " + jsonValueAddress + " as string - " + jsonAddress);

        JsonArray jsonValueFamily = jsonObj.getAsJsonArray("familyMemberList");
        System.out.println(jsonValueFamily);

        JSONParser parser1 = new JSONParser();
        JSONArray jsonArray2 = (JSONArray) parser1.parse(String.valueOf(jsonValueFamily));
        JSONObject jsonObject2 = (JSONObject) jsonArray2.get(0);
        System.out.println(jsonObject2.get("role"));

        String jsonValueFamilyMember1 = JsonPath.read(body, "familyMemberList[1].role");
        System.out.println(jsonValueFamilyMember1);

        String jsonValueCountry = JsonPath.read(body, "address.country");
        System.out.println(jsonValueCountry);

        test();

    }

    public static void test() throws FileNotFoundException {
        String node = jsonParser("src/main/java/org/api/gson/payloadArray.json", "customer[0].fullName");
        System.out.println(node);
        assertEquals(node, "Emily Jenkins");
    }

    public static String jsonParser(String fileName, String jsonPath) throws FileNotFoundException {
        Gson gson = new Gson();
        Object object =gson.fromJson(new FileReader(fileName), Object.class);
        String element = JsonPath.read(object, jsonPath);
        return element;
    }

    /*The above helper was used in cucumber scenario:
  Scenario Outline: Customer Info - <nodeValue>
    Given The json file "<fileName>" node "<node>"should include the value "<nodeValue>"

    Examples:
      |fileName|node|nodeValue|
      |src/main/resources/payloads/payloadArray.json|customer[0].fullName |Emily Jenkins|
      |src/main/resources/payloads/payloadArray.json| customer[0].age     |          27 |
      |src/main/resources/payloads/payloadArray.json| customer[0].id      |       44521 |
    @Given("The json file {string} node {string}should include the value {string}")
    public void the_json_file_node_should_include_the_value(String fileName, String node, String nodeVal) throws FileNotFoundException {
            Object val = jsonParser(fileName, node);
            System.out.println("***");
            assertEquals(val, nodeVal);
            System.out.println(val);
    }
     */

}
