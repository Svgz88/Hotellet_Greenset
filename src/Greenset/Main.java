package Greenset;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Växter igge = new Cactus("Igge", 0.2, TiposDeAgua.MINERALVATTEN);
        Växter laura = new Palmeras("Laura", 5, TiposDeAgua.KRANVATTEN);
        Växter meatloaf = new PlantasCarnivoras("Meatloaf", 0.7, TiposDeAgua.PROTEINDRYCK);
        Växter olof = new Palmeras("Olof", 1, TiposDeAgua.KRANVATTEN);
        Växter donald = new Cactus("Donald", 1, TiposDeAgua.KRANVATTEN);
        Växter kamala = new PlantasCarnivoras("Kamala", 0.9, TiposDeAgua.PROTEINDRYCK);

        ArrayList<Växter> listaDePlantas = new ArrayList<>();
        listaDePlantas.add(igge);
        listaDePlantas.add(laura);
        listaDePlantas.add(meatloaf);
        listaDePlantas.add(olof);
        listaDePlantas.add(donald);
        listaDePlantas.add(kamala);

        while (true) {
            System.out.println("Vilken växt ska få vätska?");
            String växtNamn = scan.nextLine();

            boolean buscaEnLaLista = false;
            for (Växter lista : listaDePlantas) {
                if (växtNamn.equalsIgnoreCase(lista.getName())) {
                    //metoden från interfacen.
                    lista.CalcularVätska();
                    buscaEnLaLista = true;
                    break;
                }
            }
            if (!buscaEnLaLista) {
                String firstCap = växtNamn.substring(0, 1).toUpperCase() + växtNamn.substring(1).toLowerCase();
                System.out.println("Växten " + firstCap + " finns inte på hotellet.");
            }
            System.out.println("Vill du fortsätta? y/n");
            String avslutaProgrammet = scan.nextLine();
            if (avslutaProgrammet.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}

/**
 * do {
 * System.out.println();
 * System.out.println("\n"+"Skriv stop för att avsluta programmet.");
 * System.out.println("Vilken växt ska få vätska?");
 * <p>
 * String namnetVäxt = scan.nextLine();
 * if (namnetVäxt.equalsIgnoreCase("stop")){
 * break;}
 * if (namnetVäxt.equalsIgnoreCase("igge")){
 * igge.CalcularVätska();
 * } else if (namnetVäxt.equalsIgnoreCase("laura")) {
 * laura.CalcularVätska();
 * } else if (namnetVäxt.equalsIgnoreCase("meatloaf")) {
 * meatloaf.CalcularVätska();
 * } else if (namnetVäxt.equalsIgnoreCase("olof")) {
 * olof.CalcularVätska();
 * } else {
 * String firstCap = namnetVäxt.substring(0,1).toUpperCase()+ namnetVäxt.substring(1).toLowerCase();
 * System.out.println("Växten "+firstCap+" finns inte på hotellet.");
 * }
 * }while(true);
 */

