//Created by Zain Qayyum 9/18/2014
package com.zaincmpt220;
//lets import some java libraries so we can make some arrays and stuff
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
//Guess what time it is.. array time! lets store the values as strings since they are names, as opposed to numbers etc
    public static void main(String[] args) {
        List<String> event = new ArrayList<String>();
        event.add("Washoos");
        event.add("CanJam");
        event.add("Horseshoes");
        event.add("Cornhole");
        event.add("Ladderball");
        event.add("Stickgame");
//welcome to the Matrix
        System.out.println("Welcome To the Smith Family Olympics App. Enter a command or press h for help.");
        String[][] olympian = {
                { "Bob", "male", "41" },
                { "Mike", "male", "13" },
                { "Derk", "male", "23" },
                { "Derky", "female", "21" },
                { "Derp", "male", "53" },
                { "Derpina", "female", "55" },
                { "Merk", "male", "44" },
                { "Derker", "male", "3" },
                { "Berkmatic", "male", "26" },
                { "Sudsy", "female", "29" },
                { "Dork", "male", "93" },
                { "Vern", "male", "33" },
                { "Surpy", "female", "58" },
                { "Brianna", "female", "32" },
                { "Brian", "male", "32" },
        };
//alternatively, i could have done this but it would be too messy and long for 15 olympians:
        /*String[][] olympian = new String[16][3];
        olympian[0][0] = "Bob";
        olympian[0][1] = "male";
        olympian[0][2] = "41";
        olympian[1][0] = "Mike";
        olympian[1][1] = "male";
        olympian[1][2] = "13"
        etc...*/
//lets start with args.length so we can complain about blank entries right off the bat
         if(args.length ==0)
            System.out.println("You need to select an option.... are you feeling ok?");
        else if (args[0].contains("e")){
            System.out.println(event);
             //we obviously need to loop through all the values in the olympian matrix to print them, using the standard
             //System.out.println(olympian); is just going to print out the memory location of the matrix lol
    }else if(args[0].contains("o")){
            for (int i = 0; i < 15; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.println(olympian[i][j] + " ");
                }
                System.out.println("\n");
            }
    }else if(args[0].contains("h")) {
            System.out.println("Type e for list of events, or type o for a list of olympians");
    }
//there are only 3 options, this isn/'t that hard...
        else System.out.println("What the hell is wrong with you, that is not an option!");
/* wait you/'re probably thinking why i did (args[0].contains("n")), considering this method allows you to type words that aren/'t even options.
its because this way you can type "derp" (and some other random words) and still get some useful information. otherwise we could
 just compare string to string values
 */
    }
}
// ok I think im done with this assignment, time to continue working on my health care system #letschangetheworld
// #letslowerthecostofhealthcare #increaseefficiency