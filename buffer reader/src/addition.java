import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class addition {
    public static void main(String args[]) throws IOException
    {

        int a, b, s;

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        System.out.print("Enter two numbers:");
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());

        s = a + b;

        System.out.println("Sum is:" + s);

    }
}