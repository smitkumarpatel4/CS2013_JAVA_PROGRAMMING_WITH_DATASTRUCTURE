package CHAPTER_19_GENERICS;

public class Exercise_19_4 {
    public static void main(String[] args) {
        Integer[] list = new Integer[15];
        for (int i = 0; i < list.length; i++) {
            list[i] = i;
        }
        
        for (int i = 0; i < list.length; i++) {
            System.out.print(+ list[i] + " ");
        }
        System.out.println();
        System.out.println(linearSearch(list, 1));
        System.out.println(linearSearch(list, 10));
        System.out.println(linearSearch(list, 20));
    }

    public static <E extends Comparable<E>> int linearSearch(E[] list, E value) {

        for (int i = 0; i < list.length; i++) {
            if (list[i].compareTo(value) == 0) {
                return i;
            }
        }
        return -1;
    }
}
