// import static org.junit.jupiter.api.Assertions.assertArrayEquals;

// import java.io.File;
// import java.io.FileNotFoundException;
// import java.util.Arrays;
// import java.util.Scanner;

// // import org.junit.jupiter.api.Test;
// import org.junit.Test;


// public class Driver_lab2bTest {
//     String error = "An error occurred.";

//     @Test
//     public void test1() {
//         File input1 = new File("./bin/lab2bdata/input.2b.1.in");
//         File output1 = new File("./bin/lab2bdata/input.2b.1.ans");

//         try (
//             Scanner inputReader1 = new Scanner(input1);
//             Scanner outputReader1 = new Scanner(output1);
//             ){
//             while (inputReader1.hasNextLine()) {
//                 String strIn = inputReader1.nextLine();
//                 String strAns = outputReader1.nextLine();

//                 long[] input = Arrays.stream(strIn.split(" ")).mapToLong(Long::parseLong).toArray();
//                 long[] ans = Arrays.stream(strAns.split(" ")).mapToLong(Long::parseLong).toArray();
//                 // long ans = Long.parseLong(strAns);
//                 // assertArrayEquals(Driver_lab2a.euclidAlg(input[0],input[1]), ans);
//                 System.out.println(Arrays.toString(input));
//                 assertArrayEquals(Driver_lab2b.euclidAlgExt(input[0],input[1]), ans);
//             }
//         } catch (FileNotFoundException e) {
//             System.err.println(error);
//             e.printStackTrace();
//         }
//     }
//     @Test
//     public void test2() {
//         File input1 = new File("./bin/lab2bdata/input.2b.2.in");
//         File output1 = new File("./bin/lab2bdata/input.2b.2.ans");

//         try (
//             Scanner inputReader1 = new Scanner(input1);
//             Scanner outputReader1 = new Scanner(output1);
//             ){
//             while (inputReader1.hasNextLine()) {
//                 String strIn = inputReader1.nextLine();
//                 String strAns = outputReader1.nextLine();

//                 long[] input = Arrays.stream(strIn.split(" ")).mapToLong(Long::parseLong).toArray();
//                 long[] ans = Arrays.stream(strAns.split(" ")).mapToLong(Long::parseLong).toArray();
//                 // long ans = Long.parseLong(strAns);
//                 // assertArrayEquals(Driver_lab2a.euclidAlg(input[0],input[1]), ans);
//                 System.out.println(Arrays.toString(input));
//                 assertArrayEquals(Driver_lab2b.euclidAlgExt(input[0],input[1]), ans);
//             }
//         } catch (FileNotFoundException e) {
//             System.err.println(error);
//             e.printStackTrace();
//         }
//     }
//     @Test
//     public void test3() {
//         File input1 = new File("./bin/lab2bdata/input.2b.3.in");
//         File output1 = new File("./bin/lab2bdata/input.2b.3.ans");

//         try (
//             Scanner inputReader1 = new Scanner(input1);
//             Scanner outputReader1 = new Scanner(output1);
//             ){
//             while (inputReader1.hasNextLine()) {
//                 String strIn = inputReader1.nextLine();
//                 String strAns = outputReader1.nextLine();

//                 long[] input = Arrays.stream(strIn.split(" ")).mapToLong(Long::parseLong).toArray();
//                 long[] ans = Arrays.stream(strAns.split(" ")).mapToLong(Long::parseLong).toArray();
//                 // long ans = Long.parseLong(strAns);
//                 // assertArrayEquals(Driver_lab2a.euclidAlg(input[0],input[1]), ans);
//                 System.out.println(Arrays.toString(input));
//                 assertArrayEquals(Driver_lab2b.euclidAlgExt(input[0],input[1]), ans);
//             }
//         } catch (FileNotFoundException e) {
//             System.err.println(error);
//             e.printStackTrace();
//         }
//     }
//     @Test
//     public void test4() {
//         File input1 = new File("./bin/lab2bdata/input.2b.4.in");
//         File output1 = new File("./bin/lab2bdata/input.2b.4.ans");

//         try (
//             Scanner inputReader1 = new Scanner(input1);
//             Scanner outputReader1 = new Scanner(output1);
//             ){
//             while (inputReader1.hasNextLine()) {
//                 String strIn = inputReader1.nextLine();
//                 String strAns = outputReader1.nextLine();

//                 long[] input = Arrays.stream(strIn.split(" ")).mapToLong(Long::parseLong).toArray();
//                 long[] ans = Arrays.stream(strAns.split(" ")).mapToLong(Long::parseLong).toArray();
//                 // long ans = Long.parseLong(strAns);
//                 // assertArrayEquals(Driver_lab2a.euclidAlg(input[0],input[1]), ans);
//                 System.out.println(Arrays.toString(input));
//                 assertArrayEquals(Driver_lab2b.euclidAlgExt(input[0],input[1]), ans);
//             }
//         } catch (FileNotFoundException e) {
//             System.err.println(error);
//             e.printStackTrace();
//         }
//     }
//     @Test
//     public void test5() {
//         File input1 = new File("./bin/lab2bdata/input.2b.5.in");
//         File output1 = new File("./bin/lab2bdata/input.2b.5.ans");

//         try (
//             Scanner inputReader1 = new Scanner(input1);
//             Scanner outputReader1 = new Scanner(output1);
//             ){
//             while (inputReader1.hasNextLine()) {
//                 String strIn = inputReader1.nextLine();
//                 String strAns = outputReader1.nextLine();

//                 long[] input = Arrays.stream(strIn.split(" ")).mapToLong(Long::parseLong).toArray();
//                 long[] ans = Arrays.stream(strAns.split(" ")).mapToLong(Long::parseLong).toArray();
//                 // long ans = Long.parseLong(strAns);
//                 // assertArrayEquals(Driver_lab2a.euclidAlg(input[0],input[1]), ans);
//                 System.out.println(Arrays.toString(input));
//                 assertArrayEquals(Driver_lab2b.euclidAlgExt(input[0],input[1]), ans);
//             }
//         } catch (FileNotFoundException e) {
//             System.err.println(error);
//             e.printStackTrace();
//         }
//     }
//     @Test
//     public void test6() {
//         File input1 = new File("./bin/lab2bdata/input.2b.6.in");
//         File output1 = new File("./bin/lab2bdata/input.2b.6.ans");

//         try (
//             Scanner inputReader1 = new Scanner(input1);
//             Scanner outputReader1 = new Scanner(output1);
//             ){
//             while (inputReader1.hasNextLine()) {
//                 String strIn = inputReader1.nextLine();
//                 String strAns = outputReader1.nextLine();

//                 long[] input = Arrays.stream(strIn.split(" ")).mapToLong(Long::parseLong).toArray();
//                 long[] ans = Arrays.stream(strAns.split(" ")).mapToLong(Long::parseLong).toArray();
//                 // long ans = Long.parseLong(strAns);
//                 // assertArrayEquals(Driver_lab2a.euclidAlg(input[0],input[1]), ans);
//                 System.out.println(Arrays.toString(input));
//                 assertArrayEquals(Driver_lab2b.euclidAlgExt(input[0],input[1]), ans);
//             }
//         } catch (FileNotFoundException e) {
//             System.err.println(error);
//             e.printStackTrace();
//         }
//     }
//     @Test
//     public void test7() {
//         File input1 = new File("./bin/lab2bdata/input.2b.7.in");
//         File output1 = new File("./bin/lab2bdata/input.2b.7.ans");

//         try (
//             Scanner inputReader1 = new Scanner(input1);
//             Scanner outputReader1 = new Scanner(output1);
//             ){
//             while (inputReader1.hasNextLine()) {
//                 String strIn = inputReader1.nextLine();
//                 String strAns = outputReader1.nextLine();

//                 long[] input = Arrays.stream(strIn.split(" ")).mapToLong(Long::parseLong).toArray();
//                 long[] ans = Arrays.stream(strAns.split(" ")).mapToLong(Long::parseLong).toArray();
//                 // long ans = Long.parseLong(strAns);
//                 // assertArrayEquals(Driver_lab2a.euclidAlg(input[0],input[1]), ans);
//                 System.out.println(Arrays.toString(input));
//                 assertArrayEquals(Driver_lab2b.euclidAlgExt(input[0],input[1]), ans);
//             }
//         } catch (FileNotFoundException e) {
//             System.err.println(error);
//             e.printStackTrace();
//         }
//     }
//     @Test
//     public void test8() {
//         File input1 = new File("./bin/lab2bdata/input.2b.8.in");
//         File output1 = new File("./bin/lab2bdata/input.2b.8.ans");

//         try (
//             Scanner inputReader1 = new Scanner(input1);
//             Scanner outputReader1 = new Scanner(output1);
//             ){
//             while (inputReader1.hasNextLine()) {
//                 String strIn = inputReader1.nextLine();
//                 String strAns = outputReader1.nextLine();

//                 long[] input = Arrays.stream(strIn.split(" ")).mapToLong(Long::parseLong).toArray();
//                 long[] ans = Arrays.stream(strAns.split(" ")).mapToLong(Long::parseLong).toArray();
//                 // long ans = Long.parseLong(strAns);
//                 // assertArrayEquals(Driver_lab2a.euclidAlg(input[0],input[1]), ans);
//                 System.out.println(Arrays.toString(input));
//                 assertArrayEquals(Driver_lab2b.euclidAlgExt(input[0],input[1]), ans);
//             }
//         } catch (FileNotFoundException e) {
//             System.err.println(error);
//             e.printStackTrace();
//         }
//     }
//     @Test
//     public void test9() {
//         File input1 = new File("./bin/lab2bdata/input.2b.9.in");
//         File output1 = new File("./bin/lab2bdata/input.2b.9.ans");

//         try (
//             Scanner inputReader1 = new Scanner(input1);
//             Scanner outputReader1 = new Scanner(output1);
//             ){
//             while (inputReader1.hasNextLine()) {
//                 String strIn = inputReader1.nextLine();
//                 String strAns = outputReader1.nextLine();

//                 long[] input = Arrays.stream(strIn.split(" ")).mapToLong(Long::parseLong).toArray();
//                 long[] ans = Arrays.stream(strAns.split(" ")).mapToLong(Long::parseLong).toArray();
//                 // long ans = Long.parseLong(strAns);
//                 // assertArrayEquals(Driver_lab2a.euclidAlg(input[0],input[1]), ans);
//                 System.out.println(Arrays.toString(input));
//                 assertArrayEquals(Driver_lab2b.euclidAlgExt(input[0],input[1]), ans);
//             }
//         } catch (FileNotFoundException e) {
//             System.err.println(error);
//             e.printStackTrace();
//         }
//     }
//     @Test
//     public void test10() {
//         File input1 = new File("./bin/lab2bdata/input.2b.10.in");
//         File output1 = new File("./bin/lab2bdata/input.2b.10.ans");

//         try (
//             Scanner inputReader1 = new Scanner(input1);
//             Scanner outputReader1 = new Scanner(output1);
//             ){
//             while (inputReader1.hasNextLine()) {
//                 String strIn = inputReader1.nextLine();
//                 String strAns = outputReader1.nextLine();

//                 long[] input = Arrays.stream(strIn.split(" ")).mapToLong(Long::parseLong).toArray();
//                 long[] ans = Arrays.stream(strAns.split(" ")).mapToLong(Long::parseLong).toArray();
//                 // long ans = Long.parseLong(strAns);
//                 // assertArrayEquals(Driver_lab2a.euclidAlg(input[0],input[1]), ans);
//                 System.out.println(Arrays.toString(input));
//                 assertArrayEquals(Driver_lab2b.euclidAlgExt(input[0],input[1]), ans);
//             }
//         } catch (FileNotFoundException e) {
//             System.err.println(error);
//             e.printStackTrace();
//         }
//     }
    
// }
