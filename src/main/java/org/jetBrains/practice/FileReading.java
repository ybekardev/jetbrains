package org.jetBrains.practice;

import org.junit.jupiter.api.Test;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.UUID;
import java.io.*;

public class FileReading {

    @Test
    public void reader() throws IOException {
        //Convenience class for reading character files.
        //The constructors of this class assume that the default character encoding and the default byte-buffer size are appropriate.
        String path = "src/main/resources/payload.json";
        File file = new File(path);
        System.out.println("File Name is: " + file.getName());
        char[] c = new char[(int) file.length()];
        FileReader fileReader = new FileReader(path);
        fileReader.read(c);
        for(char letter : c){
            System.out.print(letter);
        }
    }

    @Test
    public void reader2() throws IOException {
        //Reads text from a character-input stream.
        //It does buffering for efficient reading of characters, arrays, and lines.
        String path = "src/main/resources/payload.json";
        File file = new File(path);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null)
                System.out.println(st);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void scannerReader() throws FileNotFoundException {
        //A simple text scanner which can parse primitive types and strings using regular expressions.
        //A Scanner breaks its input into tokens using a delimiter pattern, which by default matches whitespace.
        //The resulting tokens may then be converted into values of different types using the various next methods.
        File file = new File("src/main/resources/payload.json");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
    }

    @Test
    public void reader4() throws IOException {
        //Reading from text file as string in Java
        String data = new String(Files.readAllBytes(Paths.get("src/main/resources/payload.json")));
        System.out.println(data);
    }

    @Test
    public void createAndRead() throws IOException {
        UUID id = UUID.randomUUID();
        String path = "src/main/resources/payloads/" + id + ".json";
        File file = new File(path);
        System.out.println("File Name is: " + file.getName());
        file.createNewFile();
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("This is a test file for: \n" + id );
        fileWriter.flush();
        fileWriter.close();

        //let's read what we wrote
        char[] c = new char[(int) file.length()];
        FileReader fileReader = new FileReader(file);
        fileReader.read(c);
        for(char letter : c){
            System.out.print(letter);
        }
    }

    @Test
    public void fileInPut() throws IOException {
        //FileInputStream is useful to read data from a file in the form of sequence of bytes.
        //FileInputStream is meant for reading streams of raw bytes such as image data.
        FileInputStream file = new FileInputStream("src/main/resources/payload.json");
        System.out.println("The lenght of the characters: " + file.read());
        int i;
        while((i = file.read()) != -1){
            System.out.print((char)i);
            //file.skip(1); skips 1 char each time
        }
        file.close();
    }

    @Test
    public void fileOutPut() throws IOException {
        UUID id = UUID.randomUUID();
        String path = "src/main/resources/payloads/" + id +".txt";
        //write byte
        FileOutputStream file = new FileOutputStream(path);
        file.write(65);
        file.close();
        System.out.println(file);

        //write string
        FileOutputStream file2 = new FileOutputStream(path);
        String s = "Hello World!";
        byte[] b = s.getBytes();
        file2.write(b);
        file2.close();
    }


}
