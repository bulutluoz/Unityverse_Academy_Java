package day16_iterator_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C07_LinkedList_Queue {

    public static void main(String[] args) {

        Queue<Integer> sayilar = new LinkedList<>();

        sayilar.add(34);
        sayilar.add(23);
        sayilar.add(2);
        // sayilar.add(3,5); istedigimiz index'e eleman eklemeyi kabul etmiyor
        //                   Queue oldugu icin eklemeler sondan, silmeler bastan yapilir

        System.out.println(sayilar); // [34, 23, 2]

        System.out.println(sayilar.remove()); // 34

        System.out.println(sayilar); // [23, 2]


        System.out.println(sayilar.poll()); // 23
        // bastaki elementi siler ve bize dondurur, liste bossa null dondurur

        System.out.println(sayilar); // [2]


        System.out.println(sayilar.peek()); // 2

        System.out.println(sayilar.element()); // 2

        // peek() ve element() silmeden listenin ilk elementini bize dondururler
        // aralarindaki fark, bos bir queue'da calistirildiginda
        // peek() null dondururken, element() exception firlatir


        System.out.println(sayilar.offer(45)); //true
        // add() queue'nun sonuna element ekler
        // offer() ise eklemeyi teklif eder, eger bir kapasite sinirlamasi yoksa ekler
        // kapasiteyi asarsa exception firlatir


    }
}
