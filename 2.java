import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        String name = args[0];
        FileInputStream file = new FileInputStream(name);
        double cnt_smb = 0;
        double cnt_spc = 0;
        while (file.available() > 0){
            char c = (char)file.read();
            cnt_smb++;
            if (String.valueOf(c).matches(" "))
            {
                cnt_spc++;
            }
        }
        double result = new BigDecimal(cnt_spc/cnt_smb*100).setScale(2, RoundingMode.UP).doubleValue();
        System.out.println(result);
        file.close();
    }
}
