import java.util.Scanner;

public class Welcome2 {

    public static void main(String[] args){
        System.out.println("RegneStykket er : " + args[0]+args[1]+args[2]);

        double v1 = Double.parseDouble(args[0]);
        double v2 = Double.parseDouble(args[2]);
        double sum = 0;
        String ope = args[1];

        switch (ope){
            case "+":
                sum = v1+v2;
                break;
            case "*":
                sum = v1*v2;
                break;
            case "-":
                sum = v1-v2;
                break;
            case "/":
                sum = v1/v2;
                break;

        }
        System.out.println("Result: "+ sum);


        System.out.println();



    }

}
