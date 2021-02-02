package org.api.gson;

import com.jayway.jsonpath.JsonPath;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BestNode {
    public static void main(String[] args) throws IOException {
        String json = "{\n" +
                "    \"pageInfo\": {\n" +
                "            \"pageName\": \"Homepage\",\n" +
                "            \"logo\": \"https://www.example.com/logo.jpg\"\n" +
                "    },\n" +
                "    \"posts\": [\n" +
                "            {\n" +
                "                \"post_id\": \"0123456789\",\n" +
                "                \"actor_id\": \"1001\",\n" +
                "                \"author_name\": \"Jane Doe\",\n" +
                "                \"post_title\": \"How to parse JSON in Java\",\n" +
                "                \"comments\": [],\n" +
                "                \"time_of_post\": \"1234567890\"\n" +
                "            }\n" +
                "    ]\n" +
                "}";
        String pageName = JsonPath.read(json, "pageInfo.pageName");
        System.out.println(pageName);

        String data = new String(Files.readAllBytes(Paths.get("src/main/java/org/api/json/mixpayload.json")));
        Object obj = JsonPath.read(data, "transaction[0].amount.amount");
        System.out.println(obj);
    }
    }
