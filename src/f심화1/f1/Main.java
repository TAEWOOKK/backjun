package f심화1.f1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("         ,r'\"7");
        bw.newLine();
        bw.write("r`-_   ,'  ,/");
        bw.newLine();
        bw.write(" \\. \". L_r'");
        bw.newLine();
        bw.write("   `~\\/");
        bw.newLine();
        bw.write("      |");
        bw.newLine();
        bw.write("      |");
        bw.close();
    }
}
