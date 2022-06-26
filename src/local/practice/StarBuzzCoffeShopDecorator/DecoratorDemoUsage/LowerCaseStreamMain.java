package local.practice.StarBuzzCoffeShopDecorator.DecoratorDemoUsage;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
//import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
//import java.util.stream.IntStream;

public class LowerCaseStreamMain {
    public static void main(String[] args) {
        int c;
        try(InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("plain.txt")))){
            while((c = in.read())>= 0){
                System.out.print((char)c);
            }
        }
        catch (IOException exp){
            exp.printStackTrace();
        }
    }
}
