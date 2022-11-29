// import com.sun.org.slf4j.internal.Logger;
// import com.sun.org.slf4j.internal.LoggerFactory;

// import java.io.File;
// import java.io.FileOutputStream;
// import java.io.IOException;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Scanner;

// public class Main {
//     private static final Logger logger = LoggerFactory.getLogger(Main.class);

//     public static void main(String[] args) throws IOException{

// //        FirstTask firstTask = new FirstTask();
// //        System.out.println(firstTask.getResult());

// //        SecondTask secondTask = new SecondTask();
// //        System.out.println(secondTask.getUniqString());

// //        Scanner in = new Scanner(System.in);
// //        String string = in.next();
// //        System.out.println(isPalindrom(string));

// //        FourthTask fourthTask = new FourthTask();
// //        fourthTask.writer();

//         writer();


//     }

//     public static boolean isPalindrom(String string) {
//         return string.equals((new StringBuilder(string)).reverse().toString());
//     }

//     public static ArrayList<String> getFiles() {
//         File file = new File("C:\\");
//         File[] files = file.listFiles();
//         ArrayList<String> names;
//         try {
//             names = new ArrayList<String>(Arrays.asList(file.list()));
//             return names;
//         } catch (NullPointerException nullPointerException) {
//             logger.error("Файлы не найдены в этой папке");
//         }
//         return null;
//     }

//     public static void writer() throws IOException {
//         FileOutputStream fileOutputStream = new FileOutputStream("fifthTask.txt");
//         try {
//             ArrayList<String> files = getFiles();

//             for (String file : files) {
//                 file += "\n";
//                 fileOutputStream.write(file.getBytes());
//             }
//         } catch (NullPointerException nullPointerException) {
//             logger.error("В предыдущем методе файл вернул null");
//         }
//     }
// }

// class FirstTask {
//     int n;
//     char a;
//     char b;
//     int counter = 0;

//     FirstTask() {
//         Scanner in = new Scanner(System.in);
//         n = in.nextInt();
//         a = in.next().charAt(0);
//         b = in.next().charAt(0);
//         in.close();
//     }

//     public StringBuilder getResult() {
//         StringBuilder result = new StringBuilder();
//         while (n != counter) {
//             result.append(a).append(b);
//             counter = counter + 2;
//         }
//         return result;
//     }
// }

// class SecondTask {
//     String string;
//     boolean repeated;

//     SecondTask() {
//         Scanner in = new Scanner(System.in);
//         string = in.next();
//         in.close();
//     }

//     public StringBuilder getUniqString() {
//         StringBuilder result = new StringBuilder();
//         char[] chars = string.toCharArray();
//         for (int i = 0; i < chars.length; i++) {
//             repeated = false;
//             for (int j = i + 1; j < chars.length; j++) {
//                 if (chars[i] == chars[j]) {
//                     repeated = true;
//                     break;
//                 }
//             }
//             if (!repeated) {
//                 result.append(chars[i]);
//             }
//         }
//         return result;
//     }
// }

// class FourthTask {

//     public StringBuilder generateString() {
//         StringBuilder stringBuilder = new StringBuilder();
//         for (int i = 0; i < 100; i++) {
//             stringBuilder.append("TEST ");
//         }
//         return stringBuilder;
//     }

//     public void writer() {
//         try {
//             FileOutputStream fileOutputStream = new FileOutputStream("test.txt");

//             fileOutputStream.write(generateString().toString().getBytes());

//             fileOutputStream.close();
//         } catch (IOException e) {
//             System.out.println("Проблема вывода!");
//             e.printStackTrace();
//         }
//     }
// }