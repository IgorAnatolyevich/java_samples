import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        String name = args[0];
        FileInputStream file = new FileInputStream(name);
        int cnt = 0;
        while (file.available() > 0){
            char c = (char)file.read();
            if (String.valueOf(c).matches("[a-zA-Z]"))
                cnt++;
        }
        System.out.println(cnt);

        file.close();
    }
}
