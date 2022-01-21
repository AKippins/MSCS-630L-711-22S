import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

// import org.junit.jupiter.api.Test;
import org.junit.Test;

public class Driver_lab1Test {
    String error = "An error occurred.";
    
    @Test
    public void test1() {
        File input1 = new File("./bin/lab1data/input.1.in");
        File output1 = new File("./bin/lab1data/input.1.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            while (inputReader1.hasNextLine()) {
                String strAns = outputReader1.nextLine();

                int[] ans = Arrays.stream(strAns.split(" ")).mapToInt(Integer::parseInt).toArray();
                assertArrayEquals(Driver_lab1.str2int(inputReader1.nextLine()), ans);
            }
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    
    @Test
    public void test2() {
        File input1 = new File("./bin/lab1data/input.2.in");
        File output1 = new File("./bin/lab1data/input.2.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            while (inputReader1.hasNextLine()) {
                String strAns = outputReader1.nextLine();

                int[] ans = Arrays.stream(strAns.split(" ")).mapToInt(Integer::parseInt).toArray();
                assertArrayEquals(Driver_lab1.str2int(inputReader1.nextLine()), ans);
            }
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    
    @Test
    public void test3() {
        File input1 = new File("./bin/lab1data/input.3.in");
        File output1 = new File("./bin/lab1data/input.3.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            while (inputReader1.hasNextLine()) {
                String strAns = outputReader1.nextLine();

                int[] ans = Arrays.stream(strAns.split(" ")).mapToInt(Integer::parseInt).toArray();
                assertArrayEquals(Driver_lab1.str2int(inputReader1.nextLine()), ans);
            }
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    
    @Test
    public void test4() {
        File input1 = new File("./bin/lab1data/input.4.in");
        File output1 = new File("./bin/lab1data/input.4.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            while (inputReader1.hasNextLine()) {
                String strAns = outputReader1.nextLine();

                int[] ans = Arrays.stream(strAns.split(" ")).mapToInt(Integer::parseInt).toArray();
                assertArrayEquals(Driver_lab1.str2int(inputReader1.nextLine()), ans);
            }
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    
    @Test
    public void test5() {
        File input1 = new File("./bin/lab1data/input.5.in");
        File output1 = new File("./bin/lab1data/input.5.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            while (inputReader1.hasNextLine()) {
                String strAns = outputReader1.nextLine();

                int[] ans = Arrays.stream(strAns.split(" ")).mapToInt(Integer::parseInt).toArray();
                assertArrayEquals(Driver_lab1.str2int(inputReader1.nextLine()), ans);
            }
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    
    @Test
    public void test6() {
        File input1 = new File("./bin/lab1data/input.6.in");
        File output1 = new File("./bin/lab1data/input.6.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            while (inputReader1.hasNextLine()) {
                String strAns = outputReader1.nextLine();

                int[] ans = Arrays.stream(strAns.split(" ")).mapToInt(Integer::parseInt).toArray();
                assertArrayEquals(Driver_lab1.str2int(inputReader1.nextLine()), ans);
            }
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    
    @Test
    public void test7() {
        File input1 = new File("./bin/lab1data/input.7.in");
        File output1 = new File("./bin/lab1data/input.7.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            while (inputReader1.hasNextLine()) {
                String strAns = outputReader1.nextLine();

                int[] ans = Arrays.stream(strAns.split(" ")).mapToInt(Integer::parseInt).toArray();
                assertArrayEquals(Driver_lab1.str2int(inputReader1.nextLine()), ans);
            }
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    
    @Test
    public void test8() {
        File input1 = new File("./bin/lab1data/input.8.in");
        File output1 = new File("./bin/lab1data/input.8.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            while (inputReader1.hasNextLine()) {
                String strAns = outputReader1.nextLine();

                int[] ans = Arrays.stream(strAns.split(" ")).mapToInt(Integer::parseInt).toArray();
                assertArrayEquals(Driver_lab1.str2int(inputReader1.nextLine()), ans);
            }
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    
    @Test
    public void test9() {
        File input1 = new File("./bin/lab1data/input.9.in");
        File output1 = new File("./bin/lab1data/input.9.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            while (inputReader1.hasNextLine()) {
                String strAns = outputReader1.nextLine();

                int[] ans = Arrays.stream(strAns.split(" ")).mapToInt(Integer::parseInt).toArray();
                assertArrayEquals(Driver_lab1.str2int(inputReader1.nextLine()), ans);
            }
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    
    @Test
    public void test10() {
        File input1 = new File("./bin/lab1data/input.10.in");
        File output1 = new File("./bin/lab1data/input.10.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            while (inputReader1.hasNextLine()) {
                String strAns = outputReader1.nextLine();

                int[] ans = Arrays.stream(strAns.split(" ")).mapToInt(Integer::parseInt).toArray();
                assertArrayEquals(Driver_lab1.str2int(inputReader1.nextLine()), ans);
            }
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    
    @Test
    public void test11() {
        File input1 = new File("./bin/lab1data/input.11.in");
        File output1 = new File("./bin/lab1data/input.11.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            while (inputReader1.hasNextLine()) {
                String strAns = outputReader1.nextLine();

                int[] ans = Arrays.stream(strAns.split(" ")).mapToInt(Integer::parseInt).toArray();
                assertArrayEquals(Driver_lab1.str2int(inputReader1.nextLine()), ans);
            }
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    
    @Test
    public void test12() {
        File input1 = new File("./bin/lab1data/input.12.in");
        File output1 = new File("./bin/lab1data/input.12.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            while (inputReader1.hasNextLine()) {
                String strAns = outputReader1.nextLine();

                int[] ans = Arrays.stream(strAns.split(" ")).mapToInt(Integer::parseInt).toArray();
                assertArrayEquals(Driver_lab1.str2int(inputReader1.nextLine()), ans);
            }
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    
    @Test
    public void test13() {
        File input1 = new File("./bin/lab1data/input.13.in");
        File output1 = new File("./bin/lab1data/input.13.ans");

        try (
            Scanner inputReader1 = new Scanner(input1);
            Scanner outputReader1 = new Scanner(output1);
            ){
            while (inputReader1.hasNextLine()) {
                String strAns = outputReader1.nextLine();

                int[] ans = Arrays.stream(strAns.split(" ")).mapToInt(Integer::parseInt).toArray();
                assertArrayEquals(Driver_lab1.str2int(inputReader1.nextLine()), ans);
            }
        } catch (FileNotFoundException e) {
            System.err.println(error);
            e.printStackTrace();
        }
    }
    
}
