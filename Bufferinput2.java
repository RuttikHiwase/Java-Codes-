import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bufferinput2 {
    public static void main(String[] args)
        //Ways to read input from console in Java -Buffered
        // Reader
        throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name=reader.readLine();
        System.out.println(name);

    }
}
