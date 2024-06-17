package afonso.elimar.CassinoRomenia.repository;

import afonso.elimar.CassinoRomenia.domain.Punter;

import java.util.ArrayList;

public class PunterRepository {

    public ArrayList<Punter> setPunters(int numPunters) {
        ArrayList<Punter> punters = new ArrayList<>();

        for (int i = 1; i <= numPunters; i++) {
            // Punters com IDs sequenciais e carteiras inicialmente vazias
            Punter punter = new Punter(i, 0.0);
            punters.add(punter);
        }

        return punters;
    }

}
