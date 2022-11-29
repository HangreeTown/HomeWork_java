/*
 
    - Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

   
*/


import java.util.ArrayList;
import java.util.Comparator;

public class DZ_3_3 {
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>();
        arr.add(11);
        arr.add(22);
        arr.add(33);
        arr.add(43);
        arr.add(52);
        arr.add(13);
        arr.add(14);
        arr.add(0);
        arr.add(88);

        System.out.println(arr);

        ListInfo(arr);
    }

    public static void ListInfo(ArrayList<Integer> args) {
        System.out.println("Информация о списке: ");
        args.sort(Comparator.naturalOrder());
        System.out.println("Максимальный элемент -> " + args.get(args.size() - 1));
        args.sort(Comparator.reverseOrder());
        System.out.println("Минимальный элемент -> " + args.get(args.size() - 1));

        int sum = 0;
        for(int i = 0; i < args.size(); i++){
            sum+= i;
        }
        System.out.println("Сумма всех элементов -> " + sum);
        int averge = sum / args.size();
        System.out.println("Среднее арифмитическое -> " + averge); 
    }
}