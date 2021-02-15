package org.jetBrains.javacore.practice;

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
        //to create a directory say: file.mkdirs();
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


    /*
    Streams are divided into byte and character ones.
    Byte output streams allow writing sequences of bytes.
    It is necessary for working with binary files.
    Character output streams are intended for writing text.

    Readers - input ex: FileInputStream , Writers - output ex: FileOutputStream
    Character input stream classes usually end with Reader.
    Byte input streams end with InputStream.
    */

    @Test
    public void inOut() throws IOException {
        String str = "stream";
        byte [] strByte = str.getBytes();
        System.out.println(strByte);

        Reader reader = new FileReader("src/main/resources/payload.json");

        char first = (char) reader.read(); // i
        char second = (char) reader.read(); // n

        char[] others = new char[12];
        int number = reader.read(others); // 10

        System.out.print(first + "*" + second + "*" + number);
        System.out.println();

        FileReader reader1 = new FileReader("src/main/resources/payload.json");
        int charNum = reader1.read();
        while (charNum != -1){
            char character = (char) charNum;
            System.out.print(character);
            charNum = reader1.read();
        }

        reader1.close();

        System.out.println();

        FileInputStream fis = new FileInputStream("src/main/resources/payload.json");
        byte [] b = new byte[11];
        int numOfB = fis.read(b);
        System.out.println(numOfB); // prints 11

        fis.close();
    }

    //Pressing Enter doesn't close the input stream. It is still opened and waits for input. To actually close the input stream you need to produce an end-of-file event. In IDEA, you should press Ctrl+D (Windows and Linux) or <command>+D (MacOS).
    //If you need to read a text, use character input streams. Otherwise, for example, while reading audio, video, zip and etc., use byte input streams


    @Test
    public void testMemory(){
        Runtime runtime  = Runtime.getRuntime();
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        System.out.println("Total memory: " + totalMemory);
        System.out.println("Free memory: " + freeMemory);
        System.out.println("Used memory:" + (totalMemory - freeMemory));
    }


}
