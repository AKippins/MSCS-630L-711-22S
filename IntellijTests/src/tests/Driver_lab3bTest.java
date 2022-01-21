import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.jupiter.api.Test;


public class Driver_lab3bTest {
    String error = "An error occurred.";
    public static int maxMatrixSize = 16;
    public static int matrixRowColSize = 4;
    public static String emptyString = "";

    @Test
    void test1() {
        File input1 = new File("./src/resources/lab3bdata/input.3b.1.in");
        File output1 = new File("./src/resources/lab3bdata/input.3b.1.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            // outputReader1.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            char paddingChar = inputReader1.nextLine().charAt(0);
            String plainText = inputReader1.nextLine();
            // System.out.println(plainText);

            int substringMaxIndex = (plainText.length() / maxMatrixSize);

            String alteredText;

            for (int substringIndex = 0;
                substringIndex < substringMaxIndex;
                substringIndex++){
                
                String[][] outputMatrix = new String[matrixRowColSize][matrixRowColSize];
            
                // for (int index = 0; index < matrixRowColSize; index++) {
                String[] currentInputs;
    
                    //  Populating our matrix.
                for (int row = 0; row < matrixRowColSize; row++){
                    String nextLine = outputReader1.nextLine();
                    System.out.println(nextLine);
                    // currentInputs = Arrays.stream(nextLine.split(" ")).mapToInt(Integer::parseInt).toArray();
                    currentInputs = nextLine.split(" ");

                    for (int col = 0; col < matrixRowColSize; col++) {
                        // System.out.println(col);
                        outputMatrix[row][col] = currentInputs[col];
                    }
                }
                outputReader1.nextLine();

                System.out.println(Arrays.deepToString(outputMatrix));
                // }

                //  Creating upper and lower bounds to use in our substring.
                int lowerBound = substringIndex * maxMatrixSize;
                int upperBound = (substringIndex * maxMatrixSize) + maxMatrixSize;

                //  Deciding whether we need to split in the middle of the string or if we
                //  can just take the rest of it.
                if (plainText.length() < upperBound){
                    alteredText = plainText.substring(lowerBound);
                } else {
                    alteredText = plainText.substring(lowerBound, upperBound);
                }
                System.out.println(alteredText);
                //  Sending 16 characters at a time into our functions. They'll handle the
                //  conversion to ascii, to hex, and then the printing and formatting.
                if (alteredText.length() > 0){
                    int[][] asciiMatrix = Driver_lab3b.getHexMatP(paddingChar, alteredText);
                    String[][] hexMatrix = convertMatrix(asciiMatrix);
                    // printMatrix(hexMatrix);
                    System.out.println("Answer from Hex Matrix: ");
                    System.out.println(Arrays.deepToString(hexMatrix));
                    assertArrayEquals(outputMatrix, hexMatrix);
                } else {
                    int[][] asciiMatrix = Driver_lab3b.getHexMatP(paddingChar, emptyString);
                    String[][] hexMatrix = convertMatrix(asciiMatrix);
                    // printMatrix(hexMatrix);
                    System.out.println("Answer from Hex Matrix: ");
                    System.out.println(Arrays.deepToString(hexMatrix));
                    assertArrayEquals(outputMatrix, hexMatrix);
                }

                //  Looking to print an empty line in the middle of each matrix. We're
                //  not going to print one on the last one though.
                if (substringIndex < ((plainText.length() / maxMatrixSize))) {
                    // outputReader1.nextLine();
                    // outputReader1.nextLine();
                    System.out.println();
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    
    @Test
    void test2() {
        File input1 = new File("./src/resources/lab3bdata/input.3b.2.in");
        File output1 = new File("./src/resources/lab3bdata/input.3b.2.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            // outputReader1.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            char paddingChar = inputReader1.nextLine().charAt(0);
            String plainText = inputReader1.nextLine();
            // System.out.println(plainText);

            int substringMaxIndex = (plainText.length() / maxMatrixSize);

            String alteredText;

            for (int substringIndex = 0;
                substringIndex < substringMaxIndex;
                substringIndex++){
                
                String[][] outputMatrix = new String[matrixRowColSize][matrixRowColSize];
            
                // for (int index = 0; index < matrixRowColSize; index++) {
                String[] currentInputs;
    
                    //  Populating our matrix.
                for (int row = 0; row < matrixRowColSize; row++){
                    String nextLine = outputReader1.nextLine();
                    System.out.println(nextLine);
                    // currentInputs = Arrays.stream(nextLine.split(" ")).mapToInt(Integer::parseInt).toArray();
                    currentInputs = nextLine.split(" ");

                    for (int col = 0; col < matrixRowColSize; col++) {
                        // System.out.println(col);
                        outputMatrix[row][col] = currentInputs[col];
                    }
                }
                outputReader1.nextLine();

                System.out.println(Arrays.deepToString(outputMatrix));
                // }

                //  Creating upper and lower bounds to use in our substring.
                int lowerBound = substringIndex * maxMatrixSize;
                int upperBound = (substringIndex * maxMatrixSize) + maxMatrixSize;

                //  Deciding whether we need to split in the middle of the string or if we
                //  can just take the rest of it.
                if (plainText.length() < upperBound){
                    alteredText = plainText.substring(lowerBound);
                } else {
                    alteredText = plainText.substring(lowerBound, upperBound);
                }
                System.out.println(alteredText);
                //  Sending 16 characters at a time into our functions. They'll handle the
                //  conversion to ascii, to hex, and then the printing and formatting.
                if (alteredText.length() > 0){
                    int[][] asciiMatrix = Driver_lab3b.getHexMatP(paddingChar, alteredText);
                    String[][] hexMatrix = convertMatrix(asciiMatrix);
                    // printMatrix(hexMatrix);
                    System.out.println("Answer from Hex Matrix: ");
                    System.out.println(Arrays.deepToString(hexMatrix));
                    assertArrayEquals(outputMatrix, hexMatrix);
                } else {
                    int[][] asciiMatrix = Driver_lab3b.getHexMatP(paddingChar, emptyString);
                    String[][] hexMatrix = convertMatrix(asciiMatrix);
                    // printMatrix(hexMatrix);
                    System.out.println("Answer from Hex Matrix: ");
                    System.out.println(Arrays.deepToString(hexMatrix));
                    assertArrayEquals(outputMatrix, hexMatrix);
                }

                //  Looking to print an empty line in the middle of each matrix. We're
                //  not going to print one on the last one though.
                if (substringIndex < ((plainText.length() / maxMatrixSize))) {
                    // outputReader1.nextLine();
                    // outputReader1.nextLine();
                    System.out.println();
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    
    @Test
    void test3() {
        File input1 = new File("./src/resources/lab3bdata/input.3b.3.in");
        File output1 = new File("./src/resources/lab3bdata/input.3b.3.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            // outputReader1.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            char paddingChar = inputReader1.nextLine().charAt(0);
            String plainText = inputReader1.nextLine();
            // System.out.println(plainText);

            int substringMaxIndex = (plainText.length() / maxMatrixSize);

            String alteredText;

            for (int substringIndex = 0;
                substringIndex < substringMaxIndex;
                substringIndex++){
                
                String[][] outputMatrix = new String[matrixRowColSize][matrixRowColSize];
            
                // for (int index = 0; index < matrixRowColSize; index++) {
                String[] currentInputs;
    
                    //  Populating our matrix.
                for (int row = 0; row < matrixRowColSize; row++){
                    String nextLine = outputReader1.nextLine();
                    System.out.println(nextLine);
                    // currentInputs = Arrays.stream(nextLine.split(" ")).mapToInt(Integer::parseInt).toArray();
                    currentInputs = nextLine.split(" ");

                    for (int col = 0; col < matrixRowColSize; col++) {
                        // System.out.println(col);
                        outputMatrix[row][col] = currentInputs[col];
                    }
                }
                outputReader1.nextLine();

                System.out.println(Arrays.deepToString(outputMatrix));
                // }

                //  Creating upper and lower bounds to use in our substring.
                int lowerBound = substringIndex * maxMatrixSize;
                int upperBound = (substringIndex * maxMatrixSize) + maxMatrixSize;

                //  Deciding whether we need to split in the middle of the string or if we
                //  can just take the rest of it.
                if (plainText.length() < upperBound){
                    alteredText = plainText.substring(lowerBound);
                } else {
                    alteredText = plainText.substring(lowerBound, upperBound);
                }
                System.out.println(alteredText);
                //  Sending 16 characters at a time into our functions. They'll handle the
                //  conversion to ascii, to hex, and then the printing and formatting.
                if (alteredText.length() > 0){
                    int[][] asciiMatrix = Driver_lab3b.getHexMatP(paddingChar, alteredText);
                    String[][] hexMatrix = convertMatrix(asciiMatrix);
                    // printMatrix(hexMatrix);
                    System.out.println("Answer from Hex Matrix: ");
                    System.out.println(Arrays.deepToString(hexMatrix));
                    assertArrayEquals(outputMatrix, hexMatrix);
                } else {
                    int[][] asciiMatrix = Driver_lab3b.getHexMatP(paddingChar, emptyString);
                    String[][] hexMatrix = convertMatrix(asciiMatrix);
                    // printMatrix(hexMatrix);
                    System.out.println("Answer from Hex Matrix: ");
                    System.out.println(Arrays.deepToString(hexMatrix));
                    assertArrayEquals(outputMatrix, hexMatrix);
                }

                //  Looking to print an empty line in the middle of each matrix. We're
                //  not going to print one on the last one though.
                if (substringIndex < ((plainText.length() / maxMatrixSize))) {
                    // outputReader1.nextLine();
                    // outputReader1.nextLine();
                    System.out.println();
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    
    @Test
    void test4() {
        File input1 = new File("./src/resources/lab3bdata/input.3b.4.in");
        File output1 = new File("./src/resources/lab3bdata/input.3b.4.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            // outputReader1.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            char paddingChar = inputReader1.nextLine().charAt(0);
            String plainText = inputReader1.nextLine();
            // System.out.println(plainText);

            int substringMaxIndex = (plainText.length() / maxMatrixSize);

            String alteredText;

            for (int substringIndex = 0;
                substringIndex < substringMaxIndex;
                substringIndex++){
                
                String[][] outputMatrix = new String[matrixRowColSize][matrixRowColSize];
            
                // for (int index = 0; index < matrixRowColSize; index++) {
                String[] currentInputs;
    
                    //  Populating our matrix.
                for (int row = 0; row < matrixRowColSize; row++){
                    String nextLine = outputReader1.nextLine();
                    System.out.println(nextLine);
                    // currentInputs = Arrays.stream(nextLine.split(" ")).mapToInt(Integer::parseInt).toArray();
                    currentInputs = nextLine.split(" ");

                    for (int col = 0; col < matrixRowColSize; col++) {
                        // System.out.println(col);
                        outputMatrix[row][col] = currentInputs[col];
                    }
                }
                outputReader1.nextLine();

                System.out.println(Arrays.deepToString(outputMatrix));
                // }

                //  Creating upper and lower bounds to use in our substring.
                int lowerBound = substringIndex * maxMatrixSize;
                int upperBound = (substringIndex * maxMatrixSize) + maxMatrixSize;

                //  Deciding whether we need to split in the middle of the string or if we
                //  can just take the rest of it.
                if (plainText.length() < upperBound){
                    alteredText = plainText.substring(lowerBound);
                } else {
                    alteredText = plainText.substring(lowerBound, upperBound);
                }
                System.out.println(alteredText);
                //  Sending 16 characters at a time into our functions. They'll handle the
                //  conversion to ascii, to hex, and then the printing and formatting.
                if (alteredText.length() > 0){
                    int[][] asciiMatrix = Driver_lab3b.getHexMatP(paddingChar, alteredText);
                    String[][] hexMatrix = convertMatrix(asciiMatrix);
                    // printMatrix(hexMatrix);
                    System.out.println("Answer from Hex Matrix: ");
                    System.out.println(Arrays.deepToString(hexMatrix));
                    assertArrayEquals(outputMatrix, hexMatrix);
                } else {
                    int[][] asciiMatrix = Driver_lab3b.getHexMatP(paddingChar, emptyString);
                    String[][] hexMatrix = convertMatrix(asciiMatrix);
                    // printMatrix(hexMatrix);
                    System.out.println("Answer from Hex Matrix: ");
                    System.out.println(Arrays.deepToString(hexMatrix));
                    assertArrayEquals(outputMatrix, hexMatrix);
                }

                //  Looking to print an empty line in the middle of each matrix. We're
                //  not going to print one on the last one though.
                if (substringIndex < ((plainText.length() / maxMatrixSize))) {
                    // outputReader1.nextLine();
                    // outputReader1.nextLine();
                    System.out.println();
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    
    @Test
    void test5() {
        File input1 = new File("./src/resources/lab3bdata/input.3b.5.in");
        File output1 = new File("./src/resources/lab3bdata/input.3b.5.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            // outputReader1.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            char paddingChar = inputReader1.nextLine().charAt(0);
            String plainText = inputReader1.nextLine();
            // System.out.println(plainText);

            int substringMaxIndex = (plainText.length() / maxMatrixSize);

            String alteredText;

            for (int substringIndex = 0;
                substringIndex < substringMaxIndex;
                substringIndex++){
                
                String[][] outputMatrix = new String[matrixRowColSize][matrixRowColSize];
            
                // for (int index = 0; index < matrixRowColSize; index++) {
                String[] currentInputs;
    
                    //  Populating our matrix.
                for (int row = 0; row < matrixRowColSize; row++){
                    String nextLine = outputReader1.nextLine();
                    System.out.println(nextLine);
                    // currentInputs = Arrays.stream(nextLine.split(" ")).mapToInt(Integer::parseInt).toArray();
                    currentInputs = nextLine.split(" ");

                    for (int col = 0; col < matrixRowColSize; col++) {
                        // System.out.println(col);
                        outputMatrix[row][col] = currentInputs[col];
                    }
                }
                outputReader1.nextLine();

                System.out.println(Arrays.deepToString(outputMatrix));
                // }

                //  Creating upper and lower bounds to use in our substring.
                int lowerBound = substringIndex * maxMatrixSize;
                int upperBound = (substringIndex * maxMatrixSize) + maxMatrixSize;

                //  Deciding whether we need to split in the middle of the string or if we
                //  can just take the rest of it.
                if (plainText.length() < upperBound){
                    alteredText = plainText.substring(lowerBound);
                } else {
                    alteredText = plainText.substring(lowerBound, upperBound);
                }
                System.out.println(alteredText);
                //  Sending 16 characters at a time into our functions. They'll handle the
                //  conversion to ascii, to hex, and then the printing and formatting.
                if (alteredText.length() > 0){
                    int[][] asciiMatrix = Driver_lab3b.getHexMatP(paddingChar, alteredText);
                    String[][] hexMatrix = convertMatrix(asciiMatrix);
                    // printMatrix(hexMatrix);
                    System.out.println("Answer from Hex Matrix: ");
                    System.out.println(Arrays.deepToString(hexMatrix));
                    assertArrayEquals(outputMatrix, hexMatrix);
                } else {
                    int[][] asciiMatrix = Driver_lab3b.getHexMatP(paddingChar, emptyString);
                    String[][] hexMatrix = convertMatrix(asciiMatrix);
                    // printMatrix(hexMatrix);
                    System.out.println("Answer from Hex Matrix: ");
                    System.out.println(Arrays.deepToString(hexMatrix));
                    assertArrayEquals(outputMatrix, hexMatrix);
                }

                //  Looking to print an empty line in the middle of each matrix. We're
                //  not going to print one on the last one though.
                if (substringIndex < ((plainText.length() / maxMatrixSize))) {
                    // outputReader1.nextLine();
                    // outputReader1.nextLine();
                    System.out.println();
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    
    @Test
    void test6() {
        File input1 = new File("./src/resources/lab3bdata/input.3b.6.in");
        File output1 = new File("./src/resources/lab3bdata/input.3b.6.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            // outputReader1.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            char paddingChar = inputReader1.nextLine().charAt(0);
            String plainText = inputReader1.nextLine();
            // System.out.println(plainText);

            int substringMaxIndex = (plainText.length() / maxMatrixSize);

            String alteredText;

            for (int substringIndex = 0;
                substringIndex < substringMaxIndex;
                substringIndex++){
                
                String[][] outputMatrix = new String[matrixRowColSize][matrixRowColSize];
            
                // for (int index = 0; index < matrixRowColSize; index++) {
                String[] currentInputs;
    
                    //  Populating our matrix.
                for (int row = 0; row < matrixRowColSize; row++){
                    String nextLine = outputReader1.nextLine();
                    System.out.println(nextLine);
                    // currentInputs = Arrays.stream(nextLine.split(" ")).mapToInt(Integer::parseInt).toArray();
                    currentInputs = nextLine.split(" ");

                    for (int col = 0; col < matrixRowColSize; col++) {
                        // System.out.println(col);
                        outputMatrix[row][col] = currentInputs[col];
                    }
                }
                outputReader1.nextLine();

                System.out.println(Arrays.deepToString(outputMatrix));
                // }

                //  Creating upper and lower bounds to use in our substring.
                int lowerBound = substringIndex * maxMatrixSize;
                int upperBound = (substringIndex * maxMatrixSize) + maxMatrixSize;

                //  Deciding whether we need to split in the middle of the string or if we
                //  can just take the rest of it.
                if (plainText.length() < upperBound){
                    alteredText = plainText.substring(lowerBound);
                } else {
                    alteredText = plainText.substring(lowerBound, upperBound);
                }
                System.out.println(alteredText);
                //  Sending 16 characters at a time into our functions. They'll handle the
                //  conversion to ascii, to hex, and then the printing and formatting.
                if (alteredText.length() > 0){
                    int[][] asciiMatrix = Driver_lab3b.getHexMatP(paddingChar, alteredText);
                    String[][] hexMatrix = convertMatrix(asciiMatrix);
                    // printMatrix(hexMatrix);
                    System.out.println("Answer from Hex Matrix: ");
                    System.out.println(Arrays.deepToString(hexMatrix));
                    assertArrayEquals(outputMatrix, hexMatrix);
                } else {
                    int[][] asciiMatrix = Driver_lab3b.getHexMatP(paddingChar, emptyString);
                    String[][] hexMatrix = convertMatrix(asciiMatrix);
                    // printMatrix(hexMatrix);
                    System.out.println("Answer from Hex Matrix: ");
                    System.out.println(Arrays.deepToString(hexMatrix));
                    assertArrayEquals(outputMatrix, hexMatrix);
                }

                //  Looking to print an empty line in the middle of each matrix. We're
                //  not going to print one on the last one though.
                if (substringIndex < ((plainText.length() / maxMatrixSize))) {
                    // outputReader1.nextLine();
                    // outputReader1.nextLine();
                    System.out.println();
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    
    @Test
    void test7() {
        File input1 = new File("./src/resources/lab3bdata/input.3b.7.in");
        File output1 = new File("./src/resources/lab3bdata/input.3b.7.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            // outputReader1.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            char paddingChar = inputReader1.nextLine().charAt(0);
            String plainText = inputReader1.nextLine();
            // System.out.println(plainText);

            int substringMaxIndex = (plainText.length() / maxMatrixSize);

            String alteredText;

            for (int substringIndex = 0;
                substringIndex < substringMaxIndex;
                substringIndex++){
                
                String[][] outputMatrix = new String[matrixRowColSize][matrixRowColSize];
            
                // for (int index = 0; index < matrixRowColSize; index++) {
                String[] currentInputs;
    
                    //  Populating our matrix.
                for (int row = 0; row < matrixRowColSize; row++){
                    String nextLine = outputReader1.nextLine();
                    System.out.println(nextLine);
                    // currentInputs = Arrays.stream(nextLine.split(" ")).mapToInt(Integer::parseInt).toArray();
                    currentInputs = nextLine.split(" ");

                    for (int col = 0; col < matrixRowColSize; col++) {
                        // System.out.println(col);
                        outputMatrix[row][col] = currentInputs[col];
                    }
                }
                outputReader1.nextLine();

                System.out.println(Arrays.deepToString(outputMatrix));
                // }

                //  Creating upper and lower bounds to use in our substring.
                int lowerBound = substringIndex * maxMatrixSize;
                int upperBound = (substringIndex * maxMatrixSize) + maxMatrixSize;

                //  Deciding whether we need to split in the middle of the string or if we
                //  can just take the rest of it.
                if (plainText.length() < upperBound){
                    alteredText = plainText.substring(lowerBound);
                } else {
                    alteredText = plainText.substring(lowerBound, upperBound);
                }
                System.out.println(alteredText);
                //  Sending 16 characters at a time into our functions. They'll handle the
                //  conversion to ascii, to hex, and then the printing and formatting.
                if (alteredText.length() > 0){
                    int[][] asciiMatrix = Driver_lab3b.getHexMatP(paddingChar, alteredText);
                    String[][] hexMatrix = convertMatrix(asciiMatrix);
                    // printMatrix(hexMatrix);
                    System.out.println("Answer from Hex Matrix: ");
                    System.out.println(Arrays.deepToString(hexMatrix));
                    assertArrayEquals(outputMatrix, hexMatrix);
                } else {
                    int[][] asciiMatrix = Driver_lab3b.getHexMatP(paddingChar, emptyString);
                    String[][] hexMatrix = convertMatrix(asciiMatrix);
                    // printMatrix(hexMatrix);
                    System.out.println("Answer from Hex Matrix: ");
                    System.out.println(Arrays.deepToString(hexMatrix));
                    assertArrayEquals(outputMatrix, hexMatrix);
                }

                //  Looking to print an empty line in the middle of each matrix. We're
                //  not going to print one on the last one though.
                if (substringIndex < ((plainText.length() / maxMatrixSize))) {
                    // outputReader1.nextLine();
                    // outputReader1.nextLine();
                    System.out.println();
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    
    @Test
    void test8() {
        File input1 = new File("./src/resources/lab3bdata/input.3b.8.in");
        File output1 = new File("./src/resources/lab3bdata/input.3b.8.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            // outputReader1.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            char paddingChar = inputReader1.nextLine().charAt(0);
            String plainText = inputReader1.nextLine();
            // System.out.println(plainText);

            int substringMaxIndex = (plainText.length() / maxMatrixSize);

            String alteredText;

            for (int substringIndex = 0;
                substringIndex < substringMaxIndex;
                substringIndex++){
                
                String[][] outputMatrix = new String[matrixRowColSize][matrixRowColSize];
            
                // for (int index = 0; index < matrixRowColSize; index++) {
                String[] currentInputs;
    
                    //  Populating our matrix.
                for (int row = 0; row < matrixRowColSize; row++){
                    String nextLine = outputReader1.nextLine();
                    System.out.println(nextLine);
                    // currentInputs = Arrays.stream(nextLine.split(" ")).mapToInt(Integer::parseInt).toArray();
                    currentInputs = nextLine.split(" ");

                    for (int col = 0; col < matrixRowColSize; col++) {
                        // System.out.println(col);
                        outputMatrix[row][col] = currentInputs[col];
                    }
                }
                outputReader1.nextLine();

                System.out.println(Arrays.deepToString(outputMatrix));
                // }

                //  Creating upper and lower bounds to use in our substring.
                int lowerBound = substringIndex * maxMatrixSize;
                int upperBound = (substringIndex * maxMatrixSize) + maxMatrixSize;

                //  Deciding whether we need to split in the middle of the string or if we
                //  can just take the rest of it.
                if (plainText.length() < upperBound){
                    alteredText = plainText.substring(lowerBound);
                } else {
                    alteredText = plainText.substring(lowerBound, upperBound);
                }
                System.out.println(alteredText);
                //  Sending 16 characters at a time into our functions. They'll handle the
                //  conversion to ascii, to hex, and then the printing and formatting.
                if (alteredText.length() > 0){
                    int[][] asciiMatrix = Driver_lab3b.getHexMatP(paddingChar, alteredText);
                    String[][] hexMatrix = convertMatrix(asciiMatrix);
                    // printMatrix(hexMatrix);
                    System.out.println("Answer from Hex Matrix: ");
                    System.out.println(Arrays.deepToString(hexMatrix));
                    assertArrayEquals(outputMatrix, hexMatrix);
                } else {
                    int[][] asciiMatrix = Driver_lab3b.getHexMatP(paddingChar, emptyString);
                    String[][] hexMatrix = convertMatrix(asciiMatrix);
                    // printMatrix(hexMatrix);
                    System.out.println("Answer from Hex Matrix: ");
                    System.out.println(Arrays.deepToString(hexMatrix));
                    assertArrayEquals(outputMatrix, hexMatrix);
                }

                //  Looking to print an empty line in the middle of each matrix. We're
                //  not going to print one on the last one though.
                if (substringIndex < ((plainText.length() / maxMatrixSize))) {
                    // outputReader1.nextLine();
                    // outputReader1.nextLine();
                    System.out.println();
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    
    @Test
    void test9() {
        File input1 = new File("./src/resources/lab3bdata/input.3b.9.in");
        File output1 = new File("./src/resources/lab3bdata/input.3b.9.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            // outputReader1.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            char paddingChar = inputReader1.nextLine().charAt(0);
            String plainText = inputReader1.nextLine();
            // System.out.println(plainText);

            int substringMaxIndex = (plainText.length() / maxMatrixSize);

            String alteredText;

            for (int substringIndex = 0;
                substringIndex < substringMaxIndex;
                substringIndex++){
                
                String[][] outputMatrix = new String[matrixRowColSize][matrixRowColSize];
            
                // for (int index = 0; index < matrixRowColSize; index++) {
                String[] currentInputs;
    
                    //  Populating our matrix.
                for (int row = 0; row < matrixRowColSize; row++){
                    String nextLine = outputReader1.nextLine();
                    System.out.println(nextLine);
                    // currentInputs = Arrays.stream(nextLine.split(" ")).mapToInt(Integer::parseInt).toArray();
                    currentInputs = nextLine.split(" ");

                    for (int col = 0; col < matrixRowColSize; col++) {
                        // System.out.println(col);
                        outputMatrix[row][col] = currentInputs[col];
                    }
                }
                outputReader1.nextLine();

                System.out.println(Arrays.deepToString(outputMatrix));
                // }

                //  Creating upper and lower bounds to use in our substring.
                int lowerBound = substringIndex * maxMatrixSize;
                int upperBound = (substringIndex * maxMatrixSize) + maxMatrixSize;

                //  Deciding whether we need to split in the middle of the string or if we
                //  can just take the rest of it.
                if (plainText.length() < upperBound){
                    alteredText = plainText.substring(lowerBound);
                } else {
                    alteredText = plainText.substring(lowerBound, upperBound);
                }
                System.out.println(alteredText);
                //  Sending 16 characters at a time into our functions. They'll handle the
                //  conversion to ascii, to hex, and then the printing and formatting.
                if (alteredText.length() > 0){
                    int[][] asciiMatrix = Driver_lab3b.getHexMatP(paddingChar, alteredText);
                    String[][] hexMatrix = convertMatrix(asciiMatrix);
                    // printMatrix(hexMatrix);
                    System.out.println("Answer from Hex Matrix: ");
                    System.out.println(Arrays.deepToString(hexMatrix));
                    assertArrayEquals(outputMatrix, hexMatrix);
                } else {
                    int[][] asciiMatrix = Driver_lab3b.getHexMatP(paddingChar, emptyString);
                    String[][] hexMatrix = convertMatrix(asciiMatrix);
                    // printMatrix(hexMatrix);
                    System.out.println("Answer from Hex Matrix: ");
                    System.out.println(Arrays.deepToString(hexMatrix));
                    assertArrayEquals(outputMatrix, hexMatrix);
                }

                //  Looking to print an empty line in the middle of each matrix. We're
                //  not going to print one on the last one though.
                if (substringIndex < ((plainText.length() / maxMatrixSize))) {
                    // outputReader1.nextLine();
                    // outputReader1.nextLine();
                    System.out.println();
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    
    @Test
    void test10() {
        File input1 = new File("./src/resources/lab3bdata/input.3b.10.in");
        File output1 = new File("./src/resources/lab3bdata/input.3b.10.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            // outputReader1.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            char paddingChar = inputReader1.nextLine().charAt(0);
            String plainText = inputReader1.nextLine();
            // System.out.println(plainText);

            int substringMaxIndex = (plainText.length() / maxMatrixSize);

            String alteredText;

            for (int substringIndex = 0;
                substringIndex < substringMaxIndex;
                substringIndex++){
                
                String[][] outputMatrix = new String[matrixRowColSize][matrixRowColSize];
            
                // for (int index = 0; index < matrixRowColSize; index++) {
                String[] currentInputs;
    
                    //  Populating our matrix.
                for (int row = 0; row < matrixRowColSize; row++){
                    String nextLine = outputReader1.nextLine();
                    System.out.println(nextLine);
                    // currentInputs = Arrays.stream(nextLine.split(" ")).mapToInt(Integer::parseInt).toArray();
                    currentInputs = nextLine.split(" ");

                    for (int col = 0; col < matrixRowColSize; col++) {
                        // System.out.println(col);
                        outputMatrix[row][col] = currentInputs[col];
                    }
                }
                outputReader1.nextLine();

                System.out.println(Arrays.deepToString(outputMatrix));
                // }

                //  Creating upper and lower bounds to use in our substring.
                int lowerBound = substringIndex * maxMatrixSize;
                int upperBound = (substringIndex * maxMatrixSize) + maxMatrixSize;

                //  Deciding whether we need to split in the middle of the string or if we
                //  can just take the rest of it.
                if (plainText.length() < upperBound){
                    alteredText = plainText.substring(lowerBound);
                } else {
                    alteredText = plainText.substring(lowerBound, upperBound);
                }
                System.out.println(alteredText);
                //  Sending 16 characters at a time into our functions. They'll handle the
                //  conversion to ascii, to hex, and then the printing and formatting.
                if (alteredText.length() > 0){
                    int[][] asciiMatrix = Driver_lab3b.getHexMatP(paddingChar, alteredText);
                    String[][] hexMatrix = convertMatrix(asciiMatrix);
                    // printMatrix(hexMatrix);
                    System.out.println("Answer from Hex Matrix: ");
                    System.out.println(Arrays.deepToString(hexMatrix));
                    assertArrayEquals(outputMatrix, hexMatrix);
                } else {
                    int[][] asciiMatrix = Driver_lab3b.getHexMatP(paddingChar, emptyString);
                    String[][] hexMatrix = convertMatrix(asciiMatrix);
                    // printMatrix(hexMatrix);
                    System.out.println("Answer from Hex Matrix: ");
                    System.out.println(Arrays.deepToString(hexMatrix));
                    assertArrayEquals(outputMatrix, hexMatrix);
                }

                //  Looking to print an empty line in the middle of each matrix. We're
                //  not going to print one on the last one though.
                if (substringIndex < ((plainText.length() / maxMatrixSize))) {
                    // outputReader1.nextLine();
                    // outputReader1.nextLine();
                    System.out.println();
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    

    /**
   * convertMatrix
   *
   * This function is responsible for converting our matrix full of the ascii
   * codes into hex bytes.
   *
   * @param matrix: An integer matrix full of ascii codes that will be converted
   *             into hex
   *
   * @return hexMatrix: Giving back a matrix full of hex codes.
   */
    public static String[][] convertMatrix (int[][] matrix){
        String hexMatrix[][] = new String[matrixRowColSize][matrixRowColSize];
        int matrixMaxSize = 3;
        int colReset = -1;
        int rowIndex = 0;
        int colIndex = 0;
        for (int[] row: matrix){
            for (int cell: row){
                hexMatrix[rowIndex][colIndex] = Integer.toHexString(cell).toUpperCase();
                if (colIndex == matrixMaxSize){
                    rowIndex++;
                    colIndex = colReset;
                }
                colIndex++;
            }
        }
        return hexMatrix;
    }
    
}
