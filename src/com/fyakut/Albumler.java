package com.fyakut;

import java.util.ArrayList;
import java.util.LinkedList;

public class Albumler {
    private String albumAdi;
    private String sarkiciAdi;
  private   ArrayList<Sarki>sarkilar;

    public Albumler(String albumAdi, String sarkiciAdi) {
        this.albumAdi = albumAdi;
        this.sarkiciAdi = sarkiciAdi;
        sarkilar = new ArrayList<>();
    }

    public  boolean sarkiEkle(String sarkiAdi,double sarkisuresi){
        if (sarkiBul(sarkiAdi)==null){

            Sarki s=new Sarki(sarkiAdi,sarkisuresi);
            this.sarkilar.add(s);
            return  true;
        }
            else{
            System.out.println("sarkı zaten ekli");
        return false;
    }
    }

    private  Sarki sarkiBul(String sarkiAdi) {
        for (Sarki oankisarkı:sarkilar) {
            if (oankisarkı.getSarkiAdi().equals(sarkiAdi)){
                return oankisarkı;
        }
        }
        return null;

    }
    public  boolean oynatmaListesineEkle(String sarkiAdi, LinkedList<Sarki>oynatmalistesi){
        Sarki eklenecekSarki=sarkiBul(sarkiAdi);//oynatmalsitesine eklemeden once sarkının olupolmadıgını kontrol eder

        if (eklenecekSarki!=null){
            oynatmalistesi.add(eklenecekSarki);
        return true;}
        else
            System.out.println(sarkiAdi+"şarkı albumde yok");
        return false;
    }

    public boolean oynatmaListesineEkle(int sarkiNumarasi,LinkedList<Sarki>oynatmalistesi){
int index =sarkiNumarasi-1;
if((index>=0)&&(index<this.sarkilar.size())){
    oynatmalistesi.add(this.sarkilar.get(index));
    return  true;
}else
    System.out.println("albumde belirtilen şarkı yok");
return false;
    }
}
