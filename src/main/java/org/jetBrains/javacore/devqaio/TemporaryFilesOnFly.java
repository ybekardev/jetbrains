package org.jetBrains.javacore.devqaio;

import io.restassured.internal.common.assertion.Assertion;
import org.apache.logging.log4j.core.util.Assert;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TemporaryFilesOnFly {

    public static void main(String[] args) throws IOException {
        reverseNumberString("033231234");
        //filesOnFlyDir();
        //filesOnFly();
    }

    public static void filesOnFlyDir() throws IOException {
        Path path = Paths.get("src/main/resources/payload/");
        Path tempFile = Files.createTempFile(path, "tempFile", ".json");

        String payload = "{\n \"name\": \"Yasin\",\n \"lastName\": \"Bekar\"\n}\n";

        Files.write(tempFile, payload.getBytes());
        System.out.println(tempFile);
    }

    public static void filesOnFly() {
        try {
            Path tempFile = Files.createTempFile("temporaryFile", ".txt");
            System.out.println(tempFile.getFileName());
            System.out.println(System.getProperty("java.io.tmpdir"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void reverseNumberString(String numbers) {
        String reversed = "";
        for (int i = numbers.length() - 1; i > 0; i--) {
            if (numbers.charAt(i) == '0') {
                continue;
            } else {
                reversed += numbers.charAt(i);
            }
        }
        System.out.println(reversed);
    }
}
