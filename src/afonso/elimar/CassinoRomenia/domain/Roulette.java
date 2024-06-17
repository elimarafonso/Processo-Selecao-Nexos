package afonso.elimar.CassinoRomenia.domain;

import java.util.*;

public class Roulette extends Game {

    private String typeGame;
    private int numPunters;
    private List<Employee> employees = new ArrayList<>();
    private List<Punter> punters = new ArrayList<>();


    public Roulette(int numPunters, List<Employee> employees, List<Punter> punters) {
        this.numPunters = numPunters;
        this.employees = employees;
        this.punters = punters;
    }

    public void startGame(int valorK, int valorM) {
        this.removePersons(valorK, valorM);
    }

    private void removePersons(int valorK, int valorM) {


        Punter punter1 = null, punter2 = null;

        List<Punter> newListPunters = this.selectNewPersonRandom(this.getPunters());
        Punter[] arrayPunters = newListPunters.toArray(new Punter[0]);

        newListPunters.forEach(punter -> System.out.print(punter.getIdPunter() + " "));
        System.out.println("\n");


        while (arrayPunters.length >= 1) {
              /* transformar em um  unico metodo para substituir os fors de valork e valorM metodo
                 START */
            // escolhendo valork
            for (int i = 0; i < valorK; i++) {
                int indice = i % arrayPunters.length;
                if (i == valorK - 1) {
                    punter1 = arrayPunters[indice];
                }
            }

            Punter[] reverseArrayPunter = this.ReverseArrayByIndexPunter(arrayPunters);

            // escolhendo valorM
            for (int i = 0; i < valorM; i++) {
                int indice = i % reverseArrayPunter.length;
                if (i == valorM - 1) {
                    punter2 = reverseArrayPunter[indice];
                }
            }
            /* transformar em um metodo END */

            if (punter1.equals(punter2)) {
                punter1.setBonus(200.0);
                System.out.print(" *" + punter1.getIdPunter() + "* ");
                arrayPunters = this.removePunter(punter1, arrayPunters);

            } else {
                System.out.print(" " + punter1.getIdPunter() + " " + punter2.getIdPunter() + ",  ");
                arrayPunters = this.removePunter(punter1, arrayPunters);
                arrayPunters = this.removePunter(punter2, arrayPunters);
            }
        }

        for (Punter punter : arrayPunters) {
            System.out.println(", " + punter.getIdPunter());
        }
        System.out.println("\n");

    }

    private Punter[] removePunter(Punter punter1, Punter[] arrayPunters) {
        // Converte o array para um ArrayList remove o item e
        // Converte novamente para array e retorna
        List<Punter> list = new ArrayList<>(Arrays.asList(arrayPunters));
        list.remove(punter1);

        return list.toArray(new Punter[0]);
    }

    private Punter[] ReverseArrayByIndexPunter(Punter[] arrayPunters) {
        int length = arrayPunters.length;
        Punter[] reverseArray = new Punter[length];
        for (int i = 0; i < length; i++) {
            reverseArray[i] = arrayPunters[length - 1 - i];
        }
        return reverseArray;
    }

    private List<Punter> selectNewPersonRandom(List<Punter> ListPunters) {
        // Obter um índice aleatório entre 1 e o tamanho da lista
        int idFirstPerson = this.randomNumber(ListPunters.size());
        return this.newOrderPunters(ListPunters, idFirstPerson);
    }

/* REORGANIZANDO A PARTIR DA PESSOA ESCOLHIDA */
    private List<Punter> newOrderPunters(List<Punter> punters, int idFirstPerson) {
        List<Punter> reorderedList = new ArrayList<>();

        // Adicionar a parte da lista a partir do índice até o final
        for (int i = idFirstPerson; i < punters.size(); i++) {
            reorderedList.add(punters.get(i));
        }

        // Adicionar a parte da lista do início até o índice
        for (int i = 0; i < idFirstPerson; i++) {
            reorderedList.add(punters.get(i));
        }
        //retorna uma nova lista partindo da pessoa escolhida
        return reorderedList;
    }

    private int randomNumber(int size) {
        Random random = new Random();
        int randomIndex = random.nextInt(size) + 1;
        return randomIndex;
    }

    public List<Punter> getPunters() {
        return punters;
    }


}
