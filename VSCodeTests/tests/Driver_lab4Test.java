// import static org.junit.jupiter.api.Assertions.assertArrayEquals;

// import java.io.File;
// import java.io.FileNotFoundException;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Scanner;

// // import org.junit.jupiter.api.Test;
// import org.junit.Test;

// public class Driver_lab4Test {
//     String error = "An error occurred.";
    
//     @Test
//     public void test1() {
//         File input1 = new File("./bin/lab4data/input.4.1.in");
//         File output1 = new File("./bin/lab4data/input.4.1.ans");

//         try (
//             Scanner inputReader1 = new Scanner(input1);
//             Scanner outputReader1 = new Scanner(output1);
//             ){
//             ArrayList<String> tempArray = new ArrayList<String>();
//             while (outputReader1.hasNextLine()) {
//                 tempArray.add(outputReader1.nextLine());
//             }
//             String[] answerArray = tempArray.toArray(new String[0]);
//             while (inputReader1.hasNextLine()) {
//                 String tmp = inputReader1.nextLine();
//                 System.out.println(answerArray);
//                 System.out.println(AESCipher.aesRoundKeys(tmp));
//                 assertArrayEquals(answerArray, AESCipher.aesRoundKeys(tmp));
//             }
//         } catch (FileNotFoundException e) {
//             System.err.println(error);
//             e.printStackTrace();
//         }
//     }
//     @Test
//     public void test2() {
//         File input1 = new File("./bin/lab4data/input.4.2.in");
//         File output1 = new File("./bin/lab4data/input.4.2.ans");

//         try (
//             Scanner inputReader1 = new Scanner(input1);
//             Scanner outputReader1 = new Scanner(output1);
//             ){
//             ArrayList<String> tempArray = new ArrayList<String>();
//             while (outputReader1.hasNextLine()) {
//                 tempArray.add(outputReader1.nextLine());
//             }
//             String[] answerArray = tempArray.toArray(new String[0]);
//             while (inputReader1.hasNextLine()) {
//                 assertArrayEquals(answerArray, AESCipher.aesRoundKeys(inputReader1.nextLine()));
//             }
//         } catch (FileNotFoundException e) {
//             System.err.println(error);
//             e.printStackTrace();
//         }
//     }
//     @Test
//     public void test3() {
//         File input1 = new File("./bin/lab4data/input.4.3.in");
//         File output1 = new File("./bin/lab4data/input.4.3.ans");

//         try (
//             Scanner inputReader1 = new Scanner(input1);
//             Scanner outputReader1 = new Scanner(output1);
//             ){
//             ArrayList<String> tempArray = new ArrayList<String>();
//             while (outputReader1.hasNextLine()) {
//                 tempArray.add(outputReader1.nextLine());
//             }
//             String[] answerArray = tempArray.toArray(new String[0]);
//             while (inputReader1.hasNextLine()) {
//                 assertArrayEquals(answerArray, AESCipher.aesRoundKeys(inputReader1.nextLine()));
//             }
//         } catch (FileNotFoundException e) {
//             System.err.println(error);
//             e.printStackTrace();
//         }
//     }
//     @Test
//     public void test4() {
//         File input1 = new File("./bin/lab4data/input.4.4.in");
//         File output1 = new File("./bin/lab4data/input.4.4.ans");

//         try (
//             Scanner inputReader1 = new Scanner(input1);
//             Scanner outputReader1 = new Scanner(output1);
//             ){
//             ArrayList<String> tempArray = new ArrayList<String>();
//             while (outputReader1.hasNextLine()) {
//                 tempArray.add(outputReader1.nextLine());
//             }
//             String[] answerArray = tempArray.toArray(new String[0]);
//             while (inputReader1.hasNextLine()) {
//                 assertArrayEquals(answerArray, AESCipher.aesRoundKeys(inputReader1.nextLine()));
//             }
//         } catch (FileNotFoundException e) {
//             System.err.println(error);
//             e.printStackTrace();
//         }
//     }
//     @Test
//     public void test5() {
//         File input1 = new File("./bin/lab4data/input.4.5.in");
//         File output1 = new File("./bin/lab4data/input.4.5.ans");

//         try (
//             Scanner inputReader1 = new Scanner(input1);
//             Scanner outputReader1 = new Scanner(output1);
//             ){
//             ArrayList<String> tempArray = new ArrayList<String>();
//             while (outputReader1.hasNextLine()) {
//                 tempArray.add(outputReader1.nextLine());
//             }
//             String[] answerArray = tempArray.toArray(new String[0]);
//             while (inputReader1.hasNextLine()) {
//                 assertArrayEquals(answerArray, AESCipher.aesRoundKeys(inputReader1.nextLine()));
//             }
//         } catch (FileNotFoundException e) {
//             System.err.println(error);
//             e.printStackTrace();
//         }
//     }
//     @Test
//     public void test6() {
//         File input1 = new File("./bin/lab4data/input.4.6.in");
//         File output1 = new File("./bin/lab4data/input.4.6.ans");

//         try (
//             Scanner inputReader1 = new Scanner(input1);
//             Scanner outputReader1 = new Scanner(output1);
//             ){
//             ArrayList<String> tempArray = new ArrayList<String>();
//             while (outputReader1.hasNextLine()) {
//                 tempArray.add(outputReader1.nextLine());
//             }
//             String[] answerArray = tempArray.toArray(new String[0]);
//             while (inputReader1.hasNextLine()) {
//                 assertArrayEquals(answerArray, AESCipher.aesRoundKeys(inputReader1.nextLine()));
//             }
//         } catch (FileNotFoundException e) {
//             System.err.println(error);
//             e.printStackTrace();
//         }
//     }
//     @Test
//     public void test7() {
//         File input1 = new File("./bin/lab4data/input.4.7.in");
//         File output1 = new File("./bin/lab4data/input.4.7.ans");

//         try (
//             Scanner inputReader1 = new Scanner(input1);
//             Scanner outputReader1 = new Scanner(output1);
//             ){
//             ArrayList<String> tempArray = new ArrayList<String>();
//             while (outputReader1.hasNextLine()) {
//                 tempArray.add(outputReader1.nextLine());
//             }
//             String[] answerArray = tempArray.toArray(new String[0]);
//             while (inputReader1.hasNextLine()) {
//                 assertArrayEquals(answerArray, AESCipher.aesRoundKeys(inputReader1.nextLine()));
//             }
//         } catch (FileNotFoundException e) {
//             System.err.println(error);
//             e.printStackTrace();
//         }
//     }
//     @Test
//     public void test8() {
//         File input1 = new File("./bin/lab4data/input.4.8.in");
//         File output1 = new File("./bin/lab4data/input.4.8.ans");

//         try (
//             Scanner inputReader1 = new Scanner(input1);
//             Scanner outputReader1 = new Scanner(output1);
//             ){
//             ArrayList<String> tempArray = new ArrayList<String>();
//             while (outputReader1.hasNextLine()) {
//                 tempArray.add(outputReader1.nextLine());
//             }
//             String[] answerArray = tempArray.toArray(new String[0]);
//             while (inputReader1.hasNextLine()) {
//                 assertArrayEquals(answerArray, AESCipher.aesRoundKeys(inputReader1.nextLine()));
//             }
//         } catch (FileNotFoundException e) {
//             System.err.println(error);
//             e.printStackTrace();
//         }
//     }
//     @Test
//     public void test9() {
//         File input1 = new File("./bin/lab4data/input.4.9.in");
//         File output1 = new File("./bin/lab4data/input.4.9.ans");

//         try (
//             Scanner inputReader1 = new Scanner(input1);
//             Scanner outputReader1 = new Scanner(output1);
//             ){
//             ArrayList<String> tempArray = new ArrayList<String>();
//             while (outputReader1.hasNextLine()) {
//                 tempArray.add(outputReader1.nextLine());
//             }
//             String[] answerArray = tempArray.toArray(new String[0]);
//             while (inputReader1.hasNextLine()) {
//                 assertArrayEquals(answerArray, AESCipher.aesRoundKeys(inputReader1.nextLine()));
//             }
//         } catch (FileNotFoundException e) {
//             System.err.println(error);
//             e.printStackTrace();
//         }
//     }
//     @Test
//     public void test10() {
//         File input1 = new File("./bin/lab4data/input.4.10.in");
//         File output1 = new File("./bin/lab4data/input.4.10.ans");

//         try (
//             Scanner inputReader1 = new Scanner(input1);
//             Scanner outputReader1 = new Scanner(output1);
//             ){
//             ArrayList<String> tempArray = new ArrayList<String>();
//             while (outputReader1.hasNextLine()) {
//                 tempArray.add(outputReader1.nextLine());
//             }
//             String[] answerArray = tempArray.toArray(new String[0]);
//             while (inputReader1.hasNextLine()) {
//                 assertArrayEquals(answerArray, AESCipher.aesRoundKeys(inputReader1.nextLine()));
//             }
//         } catch (FileNotFoundException e) {
//             System.err.println(error);
//             e.printStackTrace();
//         }
//     }
// }
