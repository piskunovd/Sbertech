/**
 * Created by Dima on 23.02.2016.
 */
import static org.junit.Assert.*;
import org.junit.Test;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class MultiplyTest {
    @Test
    public void TestMultiplication() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("data file.txt"));
        String line;
        ArrayList<Str> list = new ArrayList<Str>();
        for (int i=0;(line=reader.readLine())!=null;i++){
            String[] parameters = line.split(";");
            list.add(i,new Str(parameters));
            if (list.get(i).operation.equals("*"))
                assertEquals(list.get(i).operand1*list.get(i).operand2,list.get(i).result);
        }
    }
    public class Str {
        private int operand1;
        private int operand2;
        private String operation;
        private int result;

        public Str(String[] parameters) {
            this.operand1 = Integer.parseInt(parameters[0]);
            this.operand2 = Integer.parseInt(parameters[1]);
            this.operation = parameters[2];
            this.result = Integer.parseInt(parameters[3]);
        }
    }

}
