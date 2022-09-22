import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {

        //gather input
        Scanner input = new Scanner(System.in);
        System.out.print("Input numbers: ");
        String x = input.next();
        int count = 0;
        int maxCount = 0;
        String max = "";
        int j = 0;

        //begin loop across string x
        for (int i = 0; i < x.length(); j = ++i) {

            //loop thru each character in string
            do {
                //determine wether to count substring
                if (Integer.parseInt(x.substring(i, i+1)) == Integer.parseInt(x.substring(j, j+1))) count++;
                j++;
            } while (j != x.length());

            //determine if new max discovered
            if (count > maxCount) {
                max = x.substring(i,i+1);
                maxCount = count;
            }
            count = 0;
        }

        //check if there is an equal distribution of integers
        if (maxCount == 1)
            System.out.print("Equal distribution of integers");
        else
            System.out.print("The max value is " + max + " and it occured " + maxCount + " times");
    }
}