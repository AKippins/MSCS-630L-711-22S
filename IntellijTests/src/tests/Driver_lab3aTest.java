import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.jupiter.api.Test;


public class Driver_lab3aTest {
    String error = "An error occurred.";

    @Test
    void test1() {
        File input1 = new File("./src/resources/lab3adata/input.3a.1.in");
        File output1 = new File("./src/resources/lab3adata/input.3a.1.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            String strIn = inputReader1.nextLine();
            String strAns = outputReader1.nextLine();

            int[] input = Arrays.stream(strIn.split(" ")).mapToInt(Integer::parseInt).toArray();
            int ans = Integer.parseInt(strAns);
            int matrixSize = input[1];
            System.out.println(ans);
            

            int[][] inputMatrix = new int[matrixSize][matrixSize];
            
            while (inputReader1.hasNextLine()) {
                int[] currentInputs;

                //  Populating our matrix.
                for (int row = 0; row < matrixSize; row++){
                    String nextLine = inputReader1.nextLine();
                    currentInputs = Arrays.stream(nextLine.split(" ")).mapToInt(Integer::parseInt).toArray();

                    for (int col = 0; col < matrixSize; col++) {
                    inputMatrix[row][col] = currentInputs[col];
                    }
                }

                System.out.println(Arrays.deepToString(inputMatrix));
            }
            System.out.println(Driver_lab3a.cofModDet(input[0],inputMatrix));
            assertEquals(Driver_lab3a.cofModDet(input[0],inputMatrix), ans);
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    
    @Test
    void test2() {
        File input1 = new File("./src/resources/lab3adata/input.3a.2.in");
        File output1 = new File("./src/resources/lab3adata/input.3a.2.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            String strIn = inputReader1.nextLine();
            String strAns = outputReader1.nextLine();

            int[] input = Arrays.stream(strIn.split(" ")).mapToInt(Integer::parseInt).toArray();
            int ans = Integer.parseInt(strAns);
            int matrixSize = input[1];
            System.out.println(ans);
            

            int[][] inputMatrix = new int[matrixSize][matrixSize];
            
            while (inputReader1.hasNextLine()) {
                int[] currentInputs;

                //  Populating our matrix.
                for (int row = 0; row < matrixSize; row++){
                    String nextLine = inputReader1.nextLine();
                    currentInputs = Arrays.stream(nextLine.split(" ")).mapToInt(Integer::parseInt).toArray();

                    for (int col = 0; col < matrixSize; col++) {
                    inputMatrix[row][col] = currentInputs[col];
                    }
                }

                System.out.println(Arrays.deepToString(inputMatrix));
            }
            System.out.println(Driver_lab3a.cofModDet(input[0],inputMatrix));
            assertEquals(Driver_lab3a.cofModDet(input[0],inputMatrix), ans);
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    
    @Test
    void test3() {
        File input1 = new File("./src/resources/lab3adata/input.3a.3.in");
        File output1 = new File("./src/resources/lab3adata/input.3a.3.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            String strIn = inputReader1.nextLine();
            String strAns = outputReader1.nextLine();

            int[] input = Arrays.stream(strIn.split(" ")).mapToInt(Integer::parseInt).toArray();
            int ans = Integer.parseInt(strAns);
            int matrixSize = input[1];
            System.out.println(ans);
            

            int[][] inputMatrix = new int[matrixSize][matrixSize];
            
            while (inputReader1.hasNextLine()) {
                int[] currentInputs;

                //  Populating our matrix.
                for (int row = 0; row < matrixSize; row++){
                    String nextLine = inputReader1.nextLine();
                    currentInputs = Arrays.stream(nextLine.split(" ")).mapToInt(Integer::parseInt).toArray();

                    for (int col = 0; col < matrixSize; col++) {
                    inputMatrix[row][col] = currentInputs[col];
                    }
                }

                System.out.println(Arrays.deepToString(inputMatrix));
            }
            System.out.println(Driver_lab3a.cofModDet(input[0],inputMatrix));
            assertEquals(Driver_lab3a.cofModDet(input[0],inputMatrix), ans);
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    
    @Test
    void test4() {
        File input1 = new File("./src/resources/lab3adata/input.3a.4.in");
        File output1 = new File("./src/resources/lab3adata/input.3a.4.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            String strIn = inputReader1.nextLine();
            String strAns = outputReader1.nextLine();

            int[] input = Arrays.stream(strIn.split(" ")).mapToInt(Integer::parseInt).toArray();
            int ans = Integer.parseInt(strAns);
            int matrixSize = input[1];
            System.out.println(ans);
            

            int[][] inputMatrix = new int[matrixSize][matrixSize];
            
            while (inputReader1.hasNextLine()) {
                int[] currentInputs;

                //  Populating our matrix.
                for (int row = 0; row < matrixSize; row++){
                    String nextLine = inputReader1.nextLine();
                    currentInputs = Arrays.stream(nextLine.split(" ")).mapToInt(Integer::parseInt).toArray();

                    for (int col = 0; col < matrixSize; col++) {
                    inputMatrix[row][col] = currentInputs[col];
                    }
                }

                System.out.println(Arrays.deepToString(inputMatrix));
            }
            System.out.println(Driver_lab3a.cofModDet(input[0],inputMatrix));
            assertEquals(Driver_lab3a.cofModDet(input[0],inputMatrix), ans);
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    
    @Test
    void test5() {
        File input1 = new File("./src/resources/lab3adata/input.3a.5.in");
        File output1 = new File("./src/resources/lab3adata/input.3a.5.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            String strIn = inputReader1.nextLine();
            String strAns = outputReader1.nextLine();

            int[] input = Arrays.stream(strIn.split(" ")).mapToInt(Integer::parseInt).toArray();
            int ans = Integer.parseInt(strAns);
            int matrixSize = input[1];
            System.out.println(ans);
            

            int[][] inputMatrix = new int[matrixSize][matrixSize];
            
            while (inputReader1.hasNextLine()) {
                int[] currentInputs;

                //  Populating our matrix.
                for (int row = 0; row < matrixSize; row++){
                    String nextLine = inputReader1.nextLine();
                    currentInputs = Arrays.stream(nextLine.split(" ")).mapToInt(Integer::parseInt).toArray();

                    for (int col = 0; col < matrixSize; col++) {
                    inputMatrix[row][col] = currentInputs[col];
                    }
                }

                System.out.println(Arrays.deepToString(inputMatrix));
            }
            System.out.println(Driver_lab3a.cofModDet(input[0],inputMatrix));
            assertEquals(Driver_lab3a.cofModDet(input[0],inputMatrix), ans);
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    
    @Test
    void test6() {
        File input1 = new File("./src/resources/lab3adata/input.3a.6.in");
        File output1 = new File("./src/resources/lab3adata/input.3a.6.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            String strIn = inputReader1.nextLine();
            String strAns = outputReader1.nextLine();

            int[] input = Arrays.stream(strIn.split(" ")).mapToInt(Integer::parseInt).toArray();
            int ans = Integer.parseInt(strAns);
            int matrixSize = input[1];
            System.out.println(ans);
            

            int[][] inputMatrix = new int[matrixSize][matrixSize];
            
            while (inputReader1.hasNextLine()) {
                int[] currentInputs;

                //  Populating our matrix.
                for (int row = 0; row < matrixSize; row++){
                    String nextLine = inputReader1.nextLine();
                    currentInputs = Arrays.stream(nextLine.split(" ")).mapToInt(Integer::parseInt).toArray();

                    for (int col = 0; col < matrixSize; col++) {
                    inputMatrix[row][col] = currentInputs[col];
                    }
                }

                System.out.println(Arrays.deepToString(inputMatrix));
            }
            System.out.println(Driver_lab3a.cofModDet(input[0],inputMatrix));
            assertEquals(Driver_lab3a.cofModDet(input[0],inputMatrix), ans);
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    
    @Test
    void test7() {
        File input1 = new File("./src/resources/lab3adata/input.3a.7.in");
        File output1 = new File("./src/resources/lab3adata/input.3a.7.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            String strIn = inputReader1.nextLine();
            String strAns = outputReader1.nextLine();

            int[] input = Arrays.stream(strIn.split(" ")).mapToInt(Integer::parseInt).toArray();
            int ans = Integer.parseInt(strAns);
            int matrixSize = input[1];
            System.out.println(ans);
            

            int[][] inputMatrix = new int[matrixSize][matrixSize];
            
            while (inputReader1.hasNextLine()) {
                int[] currentInputs;

                //  Populating our matrix.
                for (int row = 0; row < matrixSize; row++){
                    String nextLine = inputReader1.nextLine();
                    currentInputs = Arrays.stream(nextLine.split(" ")).mapToInt(Integer::parseInt).toArray();

                    for (int col = 0; col < matrixSize; col++) {
                    inputMatrix[row][col] = currentInputs[col];
                    }
                }

                System.out.println(Arrays.deepToString(inputMatrix));
            }
            System.out.println(Driver_lab3a.cofModDet(input[0],inputMatrix));
            assertEquals(Driver_lab3a.cofModDet(input[0],inputMatrix), ans);
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    
    @Test
    void test8() {
        File input1 = new File("./src/resources/lab3adata/input.3a.8.in");
        File output1 = new File("./src/resources/lab3adata/input.3a.8.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            String strIn = inputReader1.nextLine();
            String strAns = outputReader1.nextLine();

            int[] input = Arrays.stream(strIn.split(" ")).mapToInt(Integer::parseInt).toArray();
            int ans = Integer.parseInt(strAns);
            int matrixSize = input[1];
            System.out.println(ans);
            

            int[][] inputMatrix = new int[matrixSize][matrixSize];
            
            while (inputReader1.hasNextLine()) {
                int[] currentInputs;

                //  Populating our matrix.
                for (int row = 0; row < matrixSize; row++){
                    String nextLine = inputReader1.nextLine();
                    currentInputs = Arrays.stream(nextLine.split(" ")).mapToInt(Integer::parseInt).toArray();

                    for (int col = 0; col < matrixSize; col++) {
                    inputMatrix[row][col] = currentInputs[col];
                    }
                }

                System.out.println(Arrays.deepToString(inputMatrix));
            }
            System.out.println(Driver_lab3a.cofModDet(input[0],inputMatrix));
            assertEquals(Driver_lab3a.cofModDet(input[0],inputMatrix), ans);
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    
    @Test
    void test9() {
        File input1 = new File("./src/resources/lab3adata/input.3a.9.in");
        File output1 = new File("./src/resources/lab3adata/input.3a.9.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            String strIn = inputReader1.nextLine();
            String strAns = outputReader1.nextLine();

            int[] input = Arrays.stream(strIn.split(" ")).mapToInt(Integer::parseInt).toArray();
            int ans = Integer.parseInt(strAns);
            int matrixSize = input[1];
            System.out.println(ans);
            

            int[][] inputMatrix = new int[matrixSize][matrixSize];
            
            while (inputReader1.hasNextLine()) {
                int[] currentInputs;

                //  Populating our matrix.
                for (int row = 0; row < matrixSize; row++){
                    String nextLine = inputReader1.nextLine();
                    currentInputs = Arrays.stream(nextLine.split(" ")).mapToInt(Integer::parseInt).toArray();

                    for (int col = 0; col < matrixSize; col++) {
                    inputMatrix[row][col] = currentInputs[col];
                    }
                }

                System.out.println(Arrays.deepToString(inputMatrix));
            }
            System.out.println(Driver_lab3a.cofModDet(input[0],inputMatrix));
            assertEquals(Driver_lab3a.cofModDet(input[0],inputMatrix), ans);
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    
    @Test
    void test10() {
        File input1 = new File("./src/resources/lab3adata/input.3a.10.in");
        File output1 = new File("./src/resources/lab3adata/input.3a.10.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            String strIn = inputReader1.nextLine();
            String strAns = outputReader1.nextLine();

            int[] input = Arrays.stream(strIn.split(" ")).mapToInt(Integer::parseInt).toArray();
            int ans = Integer.parseInt(strAns);
            int matrixSize = input[1];
            System.out.println(ans);
            

            int[][] inputMatrix = new int[matrixSize][matrixSize];
            
            while (inputReader1.hasNextLine()) {
                int[] currentInputs;

                //  Populating our matrix.
                for (int row = 0; row < matrixSize; row++){
                    String nextLine = inputReader1.nextLine();
                    currentInputs = Arrays.stream(nextLine.split(" ")).mapToInt(Integer::parseInt).toArray();

                    for (int col = 0; col < matrixSize; col++) {
                    inputMatrix[row][col] = currentInputs[col];
                    }
                }

                System.out.println(Arrays.deepToString(inputMatrix));
            }
            System.out.println(Driver_lab3a.cofModDet(input[0],inputMatrix));
            assertEquals(Driver_lab3a.cofModDet(input[0],inputMatrix), ans);
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    
}
