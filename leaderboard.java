
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class leaderboard {

    public static void updatelb(String lbRecord) throws IOException {
        FileWriter fileWriter = new FileWriter("src\\save\\lb.txt");
        String ReadData=getlb();
        String writelb = ReadData+lbRecord;

        System.out.println(ReadData+":::::"+lbRecord);
        System.out.println(writelb+":::::::::::::");

        fileWriter.write(writelb);
        fileWriter.close();
    }

    public static String getlb() throws IOException {
        String lb = "";
        int buffer = 0;

        FileReader fileReader = new FileReader("src\\save\\lb.txt");

        buffer = fileReader.read();

//////////////////////////////////////////FIX FIX FIX FIX !!!!!!!!!!!!!!!!!!!!!!!!!!
        while (buffer != -1) {
            lb=lb+(char) buffer;
            System.out.println((char) buffer);
            buffer = fileReader.read();
        }
        fileReader.close();
        System.out.println("=="+lb);

        return lb;

    }

}
