import java.io.FileWriter;
import java.net.URL;
import java.util.Scanner;

public class WriteDataWithAutoClose {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        java.io.File file = new java.io.File("scores.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);


            //virker ikke endnu
            FileWriter fw = new FileWriter("scores.txt",true);
        }

        try (
                // Create a file
                java.io.PrintWriter output = new java.io.PrintWriter(file);
        ) {
            // Write formatted output to the file
            output.print("John T Smith: ");
            output.print(input.nextInt());
            output.close();
        }



    }
}
