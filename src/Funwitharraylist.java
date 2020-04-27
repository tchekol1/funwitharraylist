import java.util.ArrayList;
import java.util.Scanner;

public class Funwitharraylist {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String colors;
        String enter="";
        //Write a Java program to create a new array list to hold colors.
        ArrayList<String>color= new ArrayList<>();
        //Add at least 3 colors (string) to the array list and print out all its values.
        color.add("Orange");
        color.add("Green");
        color.add("Yelllow");
        //Using the array list created above, print out the value at index 1.
        System.out.println(color.get(1));
        //Using the array list above, prompt the user for one new color, and add that color to the array list.
        System.out.println("Please enter a color of your choice");
        colors=scanner.nextLine();
        color.add(colors);
        //Using the array list, continue prompting the user for colors until they type in "Q" or "q" to quit.
        // Each time the user enters a color, add that to the array list. Print out the list at the end.
        while(!(enter.equalsIgnoreCase("q"))){
            System.out.println("Please enter a color of your choice");
            colors=scanner.nextLine();
            color.add(colors);
            System.out.println("Type q/Q if you want to quit or type any thing else to continue");
             enter=scanner.nextLine();

        }
        for (String c:color
             ) {
            System.out.println("Colors you addes thus far "+ c);

        }
    }
}

