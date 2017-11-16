package com.fyakut;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
private static ArrayList<Albumler> temelalbumler=new ArrayList<>();//albumleri de listelemek
    public static void main(String[] args) {
	Albumler yıldıztılbeAlbum=new Albumler("delikanlım","Yıldız Tilbe");
	yıldıztılbeAlbum.sarkiEkle("haberin olsun",4.2);
        yıldıztılbeAlbum.sarkiEkle("emi",3.2);
        yıldıztılbeAlbum.sarkiEkle("vazgectim",5.2);
        yıldıztılbeAlbum.sarkiEkle("sevgilim",4.5);
temelalbumler.add(yıldıztılbeAlbum);

Albumler ahmetKaya=new Albumler("agladıkça","Ahmet Kaya");
ahmetKaya.sarkiEkle("agladıkça",5.0);
        ahmetKaya.sarkiEkle("Soyle",4.0);
        ahmetKaya.sarkiEkle("korkarım",3.0);
        ahmetKaya.sarkiEkle("giderim",5.0);
        temelalbumler.add(ahmetKaya);
/**temelalbumler.get(0)=yıldız tılbe
 * temelalbumler.get(1) =ahmet kaya albuu-mu*/
        LinkedList<Sarki> oynatmalistesi=new LinkedList<>();
        temelalbumler.get(0).oynatmaListesineEkle("haberin olsun",oynatmalistesi);
        temelalbumler.get(0).oynatmaListesineEkle("emi",oynatmalistesi);
        temelalbumler.get(0).oynatmaListesineEkle("vazgectim",oynatmalistesi);
        temelalbumler.get(0).oynatmaListesineEkle("sevgilim",oynatmalistesi);

        temelalbumler.get(1).oynatmaListesineEkle(2,oynatmalistesi);

        temelalbumler.get(1).oynatmaListesineEkle(1,oynatmalistesi);
        temelalbumler.get(1).oynatmaListesineEkle(3,oynatmalistesi);
oynat(oynatmalistesi);

    }


    private static void oynat(LinkedList<Sarki> oynatmalistesi) {
        Scanner kullnıcısecimi=new Scanner(System.in);

        boolean cıkıs =false;
        boolean ileriyegidiliyormu=true;
        ListIterator<Sarki> listem=oynatmalistesi.listIterator(oynatmalistesi.size());
        if (oynatmalistesi.size()==0){
            System.out.println("listede şarkı yok");
        }
      /*  else{
            System.out.println("şuan çalan sarkı:"+listem.next().toString());
        }*/
menuGoster();
while (!cıkıs){
    int secim=kullnıcısecimi.nextInt();
  switch (secim){
      case 0:
          System.out.println("uygulamadan çıkılıyor");
          cıkıs=true;
          break;
      case 1:if (!ileriyegidiliyormu){
          if (listem.hasPrevious()){
              listem.next();

          }
          ileriyegidiliyormu=true;
      }

          if (listem.hasNext()){
          System.out.println("şuan çalan şarkı"+listem.next().toString());}
          else
          System.out.println("listenin sonuna geldiniz");
          break;
      case 2:if (ileriyegidiliyormu){
          if (listem.hasPrevious()){
          listem.previous();

      }
          ileriyegidiliyormu=false;
      }
          if (listem.hasPrevious()){
              System.out.println("şuan çalan şarkı:"+listem.previous());

          }
      else System.out.println("listenin başına geldiniz");
      break;

      case 3:if (ileriyegidiliyormu){
          if(listem.hasPrevious()){
              System.out.println("tekrarlanan şarkı:"+listem.previous());
              ileriyegidiliyormu=false;
          }else {
              System.out.println("listenin başındasınız");
          }
      }
          else
              if (listem.hasNext()){
                  System.out.println("tekrarlanan şarkı:"+listem.next());
                  ileriyegidiliyormu=true;
              }
              else{
                  System.out.println("listenin sonuna geldiniz");}
          break;

      case 4:oynatmalistem(oynatmalistesi);
      case 5:
         menuGoster();
  }

}

    }

    private static void oynatmalistem(LinkedList<Sarki> oynatmalistesi) {
        ListIterator<Sarki> tümliste=oynatmalistesi.listIterator();
        System.out.println("================");
        while (tümliste.hasNext()){
            System.out.println(tümliste.next());
        }

    }

    private static void menuGoster() {
        System.out.println("seçiminizi yapınız");
        System.out.println("0:çıkış");
        System.out.println("1: bir sonraki şarkı");
        System.out.println("2:Bir önceki şarkı");
        System.out.println("3:şarkıyı yeniden başlat");

        System.out.println("4:oynatma listesi");
        System.out.println("5:menuyu goster");



    }
}
