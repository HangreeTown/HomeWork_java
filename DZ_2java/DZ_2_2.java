/*

    Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

*/


import java.util.logging.*;

public class DZ_2_2 {
    



    public static void sort(int[] arr){
        Logger logger = Logger.getLogger(DZ_2_2.class.getName());
        logger.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);        
        for(int i=arr.length-1; i>0; i--){
            for (int j=0; j<i; j++){
                if (arr[j]>arr[j+1]){
                    logger.info("поменяли индекс с " + j + " на индекс " + (j+1));
                    int count = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = count;
                }
            }
        }for (int i=0; i<arr.length;i++){
        System.out.print(arr[i]+ " ");
    }
    }

    public static void main(String[] args) {
        int[] arr = {7,2,2,9,3,1,6,-8};
        sort(arr);
    }


}