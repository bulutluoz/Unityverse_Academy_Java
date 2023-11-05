package day17_maps;

import java.util.Map;
import java.util.TreeMap;

public class Runner {

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = new TreeMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Veli-Han-10-H-MF");
        ogrenciMap.put(108,"Kemal-Cem-11-M-TM");
        ogrenciMap.put(109,"Ayse-Han-10-K-MF");

        // 10/H sinifindaki ogrenci listesini yazdirin
        C02_SinifSubeListesiYazdirma.sinifSubeListesiYazdirma(ogrenciMap,"10","h");
        C02_SinifSubeListesiYazdirma.sinifSubeListesiYazdirma(ogrenciMap,"11","M");

        // TM bolumundeki ogrencilerin listesini yazdirin
        C03_BransListesiOlusturma.bolumOgrenciListesiYazdir(ogrenciMap, "TM");

        // soyadi cem olan ogrenci listesini yazdirin
        C04_SoyisimdenOgrenciBulma.soyisimOgrenciListesi(ogrenciMap,"CEM");

        // tum ogrencilerin numara, isim ve soyisimlerini yazdirin
        System.out.println("======Tum Ogrenci listesi====");
        C05_NumaraliOgrenciListesi.numaraliOgrenciListesiYazdirma(ogrenciMap);


        // 104 numarali ogrencinin soyismini Yilmaz, 105 numarali ogrencinin soyismini Celik yapip
        // tum ogrenci listesini yazdirin
        ogrenciMap = C06_NumaraIleSoyisimUpdate.numaraIleSoyisimUpdate(ogrenciMap,104,"Yilmaz");
        ogrenciMap = C06_NumaraIleSoyisimUpdate.numaraIleSoyisimUpdate(ogrenciMap,105,"Celik");
        System.out.println("======Tum Ogrenci listesi Soyisim degistirdikten sonra====");
        C05_NumaraliOgrenciListesi.numaraliOgrenciListesiYazdirma(ogrenciMap);


        // 11.sinif ogrencileri yazdiralim

        System.out.println("==== 11.sinif listesi=====");
        C08_SinifListesiYazdirma.sinifListesiYazdirma(ogrenciMap,"11");

    }
}
