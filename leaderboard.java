
import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class leaderboard {


    public static void updatelb(String lbRecord) throws IOException {
        String ReadData=getlb();

        String writelb = ReadData+lbRecord;
        FileWriter fileWriter = new FileWriter("src\\save\\lb.txt");

        fileWriter.write(writelb);
        fileWriter.close();
    }

    public static String getlb() throws IOException {
        String lbstring = "";
        int buffer = 0;

        FileReader fileReader = new FileReader("src\\save\\lb.txt");

        buffer = fileReader.read();

        while (buffer != -1) {
            lbstring=lbstring+(char) buffer;
            buffer = fileReader.read();
        }
        fileReader.close();
        System.out.println("=="+lbstring);

        return lbstring;

    }

}
