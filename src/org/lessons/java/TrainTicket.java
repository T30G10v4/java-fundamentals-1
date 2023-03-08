package org.lessons.java;

import java.util.Scanner;

public class TrainTicket {

    public static void main(String[] args) {

        int kilometers = 0;
        int age = 0;

        double priceKm = 0.21;

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci i chilometri da percorrere: ");
        kilometers = scan.nextInt();
        System.out.println("Inserisci l'età del passeggero: ");
        age = scan.nextInt();

        double ticketPrice = kilometers * priceKm;

        if(age < 18)
        {
            ticketPrice*=0.8;
            System.out.println("Il prezzo del biglietto è scontato del 20% e costa "+ticketPrice);
        }
        else if (age > 65) {

            ticketPrice*=0.6;
            System.out.println("Il prezzo del biglietto è scontato del 20% e costa "+ticketPrice);

        } else {

            System.out.println("Il prezzo del biglietto non è scontato e costa "+ticketPrice);

        }

    }

}
