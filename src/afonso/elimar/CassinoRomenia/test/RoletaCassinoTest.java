package afonso.elimar.CassinoRomenia.test;

import afonso.elimar.CassinoRomenia.control.RouletteController;
import afonso.elimar.CassinoRomenia.domain.Roulette;

import java.util.Scanner;

public class RoletaCassinoTest {
    public static void main(String[] args) {
        //declarações
        RouletteController rouletteController = new RouletteController();



        Scanner scanner = new Scanner(System.in);
        int valorN = 0, valorK=0, valorM = 0;

        do {

            System.out.println("Entre com valor de 'N', 'K' e 'M' sucessivamente: ");
            //criar um procedimento de validação de numeros
            valorN = scanner.nextInt();
            valorK = scanner.nextInt();
            valorM = scanner.nextInt();
            if  ((valorK < 0 )|| (valorM < 0 )|| (valorN <= 0 ) || (valorN >= 20) ){
                break;
            }
            /* Cria a roleta e alimenta com o numero maximo da variavel valorN
             */
            Roulette roulette = rouletteController.setRoulette(valorN);
            roulette.startGame(valorK, valorM);


        }while (valorN != 0 || valorK != 0 || valorM != 0);


        scanner.close();
    }
}
