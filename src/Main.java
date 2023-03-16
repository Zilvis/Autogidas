import Bazinis.AutomobilisIml;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Autogidas");

        AutomobilisIml a1 = new AutomobilisIml("BMW","E39",2000,2009,"Universalas","Dyzelinas",95000,4);
        AutomobilisIml a2 = new AutomobilisIml("Audi","100",600,1997,"Sedanas","Bendzinas",25000,4);
        AutomobilisIml a3 = new AutomobilisIml("Opel","Astra",900,2002,"Hecbekas","Bendzinas/Dujos",504110,2);
        AutomobilisIml a4 = new AutomobilisIml("Volkswagen", "Golf 2",700,1989,"Hecbekas","Bendzinas",240000,2);
        AutomobilisIml a5 = new AutomobilisIml("Volkswagen","Polo",1500,2000,"Sedanas","Dyzelinas",150504,4);
        AutomobilisIml a6 = new AutomobilisIml("BMW","E32",2050,1995,"Sedanas","Bendzinas",245010,4);
        AutomobilisIml a7 = new AutomobilisIml("Opel","Cadet",3100,1985,"Sedanas","Dyzelinas",550043,2);
        AutomobilisIml a8 = new AutomobilisIml("BMW","E90",4000,2015,"Sedanas","Dyzelinas",99900,4);
        AutomobilisIml a9 = new AutomobilisIml("Audi","A2",2350,2010,"Hecbekas","Dyzelinas",123000,4);
        AutomobilisIml a10 = new AutomobilisIml("Tesla","P90",15000,2019,"Hecbekas","Elektra",56000,4);

        ArrayList <AutomobilisIml> automobiliuSarasas = new ArrayList<>();
        automobiliuSarasas.add(a1); automobiliuSarasas.add(a2); automobiliuSarasas.add(a3); automobiliuSarasas.add(a4);
        automobiliuSarasas.add(a5); automobiliuSarasas.add(a6); automobiliuSarasas.add(a7); automobiliuSarasas.add(a8);
        automobiliuSarasas.add(a9); automobiliuSarasas.add(a10);

        //System.out.println("Automobiliu sarasas:");.
        //spauzdintiSarasa(automobiliuSarasas);
        //System.out.println("Automobiliu saras su parametrais:");
        //spauzdintiSarasa(automobiliuSarasas,"BMW",100000,2000,2010);
        //System.out.println("Automobiliai kurie buvo su 500 000 Rida dabar pakeiciama i 300 000");
        //atsukaRida(automobiliuSarasas,500000,300000);
        //System.out.println("Pasalinti automobiliai senesni nei 2000");
        //pasalinaSenusAutomobilius(automobiliuSarasas,2000);
        //Collections.sort(automobiliuSarasas);
        //spauzdintiSarasa(automobiliuSarasas);
    }

    static void spauzdintiSarasa (ArrayList<AutomobilisIml> sarasas){
        sarasas.forEach(automobilis -> {
            System.out.println(automobilis);
        });
    }

    /**
     * Atspauzdiname Array sarasa pagal nurodytus parametrus
     * @param sarasas Perduodamas sarasas ArrayList
     * @param marke Nustatoma kokios markes automobili norime atspauzdinti
     * @param rida Nustatoma kokios didziausio ridos automobilius atspauzdinsime
     * @param minMetai Minimalus metai
     * @param maxMetai Maximalus metai
     */
    static void spauzdintiSarasa (ArrayList<AutomobilisIml> sarasas,String marke,int rida,int minMetai,int maxMetai){
        Iterator <AutomobilisIml> i = sarasas.iterator(); // int i = 0
        while (i.hasNext()){
            AutomobilisIml automobilis = i.next(); // i++
            if (automobilis.getMarke().equalsIgnoreCase(marke)
                    && automobilis.getRida() <= rida
                    && automobilis.getMetai() <= maxMetai
                    && automobilis.getMetai() >= minMetai){
                System.out.println(automobilis);
            }
        }
    }

    static void atsukaRida (ArrayList<AutomobilisIml> sarasas, int minRida,int naujaRida){
        Iterator<AutomobilisIml> i = sarasas.iterator();
        while(i.hasNext()){
            AutomobilisIml automobilis = i.next();
            if (automobilis.getRida() < minRida){
                automobilis.setRida(naujaRida);
                System.out.println(automobilis); // TODO: Debug
            }
        }
    }

    static void pasalinaSenusAutomobilius (ArrayList<AutomobilisIml> sarasas,int minMetai){
        Iterator<AutomobilisIml> i = sarasas.iterator();
        while (i.hasNext()){
            AutomobilisIml automobilis = i.next();
            if (automobilis.getMetai() < minMetai){
                i.remove();
                System.out.println(automobilis);
            }
        }
    }
}

//Sukurti 10 automobilio objektų ir sudėti juos į pasirinktą masyvą:
//     atspausdinti vartotojui į ekraną informaciją apie automobilius;
//     atspausdinti 'bmw' markės automobilius, kurių rida yra mažiau už 100000, o metai yra tarp 2000 ir 2010;
//     paredaguoti sąraše esančius automobilius, kurių rida daugiau nei 500000, pakeičiant į 300000;
//     pašalinti iš masyvo automobilius, kurių metai mažesni nei 2000 (Taršos mažinimo akcija);
//     surūšiuoti automobilius pagal markę, jeigu markė vienoda - pagal metus, jeigu metai vienodi - pagal durų skaičių;
//     spausdinti masyvą prieš pakeitimus ir po.