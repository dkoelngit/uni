package h1;
import java.util.Random;

public class h1_main {
    public static void main(String[] args) {
        Random rand = new Random();
        int z = rand.nextInt(50);
        z = z + 1;
        System.out.println(z);
    }
}