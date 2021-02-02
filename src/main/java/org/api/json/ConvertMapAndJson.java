package org.api.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import net.minidev.json.JSONObject;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class ConvertMapAndJson {
    public static void main(String[] args) {
        Map<String, Object> data = new HashMap<String, Object>();
        data.put( "name", "Mars" );
        data.put( "age", 32 );
        data.put( "city", "NY" );

        JSONObject json = new JSONObject(); json.putAll( data );
        System.out.printf( "JSON: %s", json.toString() );

        System.out.println();

        Map<String, Object> map = Map.of("name","Mars","city","NY","age",32);
        System.out.println(getJsonFromMap(map));

        System.out.println(getMapFromJson());
    }

    public static JSONObject getJsonFromMap(Map<String, Object> map) {
        JSONObject jsonData = new JSONObject();
        for (String key : map.keySet()) {
            Object value = map.get(key);
                jsonData.put(key, value);
        }
            return jsonData;
    }

    public static Map getMapFromJson(){
        Map<?, ?> map = null;
        try {
            // create Gson instance
            Gson gson = new Gson();
            // create a reader
            Reader reader = Files.newBufferedReader(Paths.get("src/main/java/org/api/json/mixpayload.json"));
            // convert JSON file to map
            map = gson.fromJson(reader, Map.class);
            // print map entries
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                System.out.println(entry.getKey() + "=" + entry.getValue());
            }
            // close reader
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return map;
    }
}

