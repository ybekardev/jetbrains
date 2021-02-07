package org.jetBrains.api.json;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ParserClass {

    public static void main(String[] args) throws IOException {
        String data = new String(Files.readAllBytes(Paths.get("src/main/java/org/api/json/mixpayload.json")));
        // read this from a file, receive from webservice etc.
        JsonParser parser = new JsonParser();
        JsonObject rootObject = parser.parse(data).getAsJsonObject();
        // Get the "transaction" array
        JsonArray transactions = rootObject.getAsJsonArray("transaction");
        System.out.println(transactions);
        JsonElement subType = transactions.get(0).getAsJsonObject().get("subType");
        System.out.println(subType);
        // Get the first transaction object
        JsonObject transactionObject = transactions.get(0).getAsJsonObject();
        System.out.println(transactionObject);
        JsonElement id = transactionObject.get("id");
        System.out.println(id);
        // Get the value of the "CONTAINER" element
        String container = transactionObject.get("CONTAINER").getAsString();
        System.out.println("Container: " + container);

    }

}
