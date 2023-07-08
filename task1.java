package homework3-1java;

// Пусть дан произвольный список целых чисел.

import java.util.ArrayList;
import java.util.List;



// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение
public class task1 {
    public static void main(String[] args) {
        System.out.println(deleteEven(20, 1, 10));
        findMin(10, 0, 10);
        findMax(10, 0, 10);
        findAvg(10, 0, 10);
    }

    static List<Integer> deleteEven(int size, int min, int max) {
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * (max - min + 1) + min));
        }
        System.out.println(list);
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (list.get(i) % 2 == 0) {
                list2.add(list.get(i));
            }
        }
        return list2;
    }

    static void findMin(int size, int min, int max) {
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * (max - min + 1) + min));
        }
        int minimum = list.get(0);
        for (int j = 0; j < size; j++) {
            if (list.get(j) < minimum) {
                minimum = list.get(j);
            }

        }
        System.out.println(list);
        System.out.println(minimum);
    }


    static void findMax(int size, int min, int max) {
        List<Integer> list = new ArrayList<>(size); 
        for (int i = 0; i < size; i++) {
            list.add((int)(Math.random() * (max - min + 1) + min));
        }
        int maximum = list.get(0);
        for (int j = 0; j < size; j++) {       
            if(list.get(j) > maximum){
                maximum = list.get(j);
            }
            
        }
        System.out.println(list);
        System.out.println(maximum);
    }

    static void findAvg(int size, int min, int max) {
        List<Integer> list = new ArrayList<>(size); 
        for (int i = 0; i < size; i++) {
            list.add((int)(Math.random() * (max - min + 1) + min));
        }
        double summ = 0;
        for (int j = 0; j < size; j++) {       
            summ += list.get(j);
        }
        System.out.println(summ);
        double res = summ/size;
        System.out.println(list);
        System.out.println(res);
    }
}
