/**
 * Created by Dima on 23.02.2016.
 */
import static org.junit.Assert.*;
import org.junit.Test;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class DivideTest {
    @Test
    public void TestDivision() throws IOException {
        Str str1 = new Str(0);
        Str str2 = new Str(1);
        Str str3 = new Str(2);
        Str str4 = new Str(3);
        if (str1.operation.equals("/"))
            assertEquals((double)str1.operand1/str1.operand2,str1.result,0.00001);
        if (str2.operation.equals("/"))
            assertEquals((double)str2.operand1/str2.operand2,str2.result,0.00001);
        if (str3.operation.equals("/"))
            assertEquals((double)str3.operand1/str3.operand2,str3.result,0.00001);
        if (str4.operation.equals("/"))
            assertEquals((double)str4.operand1/str4.operand2,str4.result,0.00001);
    }
    public class Str {
        private int operand1;
        private int operand2;
        private String operation;
        private double result;

        public Str(int j) throws IOException {
            BufferedReader reader = new BufferedReader(new FileReader("data file.txt"));
            String line;
            String [] lines = new String[4];
            for (int i=0;(line=reader.readLine())!=null;i++)
                lines[i] = line;

            String[] parameters = lines[j].split(";");
            this.operand1 = Integer.parseInt(parameters[0]);
            this.operand2 = Integer.parseInt(parameters[1]);
            this.operation = parameters[2];
            this.result = Integer.parseInt(parameters[3]);
        }
    }
}
