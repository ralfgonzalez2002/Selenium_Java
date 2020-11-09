package Edit.EducacionITPractica1;
import java.io.*;
import java.util.*;

public class Needle {
    public static int count(String needle, InputStream haystack) throws Exception {
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }
    
    public static void main(String[] args) throws Exception {
        String inMessage = "Hello, there!\nHow are you today?\nYes, you over there.";

        try(InputStream inStream = new ByteArrayInputStream(inMessage.getBytes())) {
            System.out.println(Needle.count("there", inStream));
        }
    }
}