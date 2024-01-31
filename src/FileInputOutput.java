import java.io.*;
import java.util.*;


public class FileInputOutput {

    public static void main(String[] args) {
//       1) Open the given file inside src called moviesDataSet.csv
        FileInputStream myFile = null;

        try {
            myFile = new FileInputStream("src/moviesDataset.csv");
        } catch (FileNotFoundException e) {
            System.out.println("Program Closing");
            System.exit(1);
        }

//       2) Read each row in the dataset

        Scanner fileReader = new Scanner(myFile);

        while (fileReader.hasNextLine()) {
            String data = fileReader.nextLine();
            System.out.println(data);

        }
        fileReader.close();

        FileInputStream myFile2 = null;

        try {
            myFile2 = new FileInputStream("src/moviesDataset.csv");
        } catch (FileNotFoundException e) {
            System.out.println("Program Closing");
            System.exit(1);
        }
        Scanner titleReader = new Scanner(myFile2);



        while (titleReader.hasNextLine()) {
            String data = titleReader.nextLine();
            String[] arrofData = data.split(",");

                System.out.println(arrofData[2]);


        }
        titleReader.close();



        FileInputStream myFile3 = null;
        PrintWriter fileWriter;
        FileOutputStream file = null;

        try {
            myFile3 = new FileInputStream("src/moviesDataset.csv");
        } catch (FileNotFoundException e) {
            System.out.println("Program Closing");
            System.exit(1);
        }
        try {
            file = new FileOutputStream("src/moviesDataset.csv", true);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Closing");
            System.exit(1);
        }
        fileWriter = new PrintWriter(file);
        Scanner titleReader2 = new Scanner(myFile3);



        while (titleReader2.hasNextLine()) {
            String data = titleReader2.nextLine();

            String[] arrofData = data.split(",");
            try{
                int number = Integer.parseInt(arrofData[4]);
            }
            catch (NumberFormatException e){
                fileWriter.println("Na");
            }
            fileWriter.println(arrofData[4]);


        }
        titleReader2.close();





        fileWriter.close();

        /*while (fileWriter.()) {
            String data = fileWriter.nextLine();
            String[] arrofData = data.split(",");

            System.out.println(arrofData[5]);


        }

         */



//       3) Print each row to the screen

//       4) Print only the name of the movie
//       5) Add exception handling (try & catch) when needed
//       6) Close the files after finishing the processing
//       7) Commit your code and push it to the GitHub


    }
}