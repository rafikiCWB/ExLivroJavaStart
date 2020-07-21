package classesBase;

import java.util.Random;

public class Jogo {

    private int aposta;
    private int resultado;

    public void setAposta(int aposta) {
        if (aposta > 6 || aposta < 1) ;
        System.out.println("Aposta inválida");
        this.aposta = aposta;
    }

    public void executaJogo() {
        Random rnd = new Random();
        this.resultado = rnd.nextInt(6) + 1;
    }

    public void mostraResultado() {
        System.out.println("Sua aposta FOI!:= ---" + aposta + " Resultado do GAME:= " + resultado);
    if(this.resultado ==this.aposta){
        System.out.println("-----Parabéns você acertou!----");
    }else {
        System.out.println("--Errou.--");
    }
    }


}
