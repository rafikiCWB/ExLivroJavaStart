package classesBase;

import java.util.Locale;
import java.util.Scanner;

public class TestaJogo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
       // Scanner sc = new Scanner(System.in);

        System.out.println("Faça Sua Aposta");
        Jogo j = new Jogo();

        j.setAposta(1);
        j.executaJogo();
        j.mostraResultado();


        //sc.close();
    }
}
