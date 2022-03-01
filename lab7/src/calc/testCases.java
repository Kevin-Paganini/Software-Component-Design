package calc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class testCases {

    public static void main(String[] args) {

        ArrayList<String> listOfTests = new ArrayList();
        listOfTests.add("input01.txt");
        listOfTests.add("input02.txt");
        listOfTests.add("input03.txt");
        listOfTests.add("input04.txt");
        listOfTests.add("input05.txt");
        listOfTests.add("input06.txt");


        for (int i = 0; i < listOfTests.size(); i++){
            System.out.println("File: " + listOfTests.get(i));
            try {
                Scanner in = new Scanner(new File(listOfTests.get(i)));

                while (in.hasNextLine()){
                    String line = in.nextLine();
                    if (line.contains("c")){
                        System.out.println("****************** There is a c and ure stupid ********************");
                    } else {
                        System.out.println("no C in this line");
                    }
                }

            } catch (FileNotFoundException e){
                System.out.println("boooo");
            }
            System.out.println();

        }




    }
}
