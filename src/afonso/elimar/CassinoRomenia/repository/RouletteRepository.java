package afonso.elimar.CassinoRomenia.repository;

import afonso.elimar.CassinoRomenia.domain.Employee;
import afonso.elimar.CassinoRomenia.domain.Punter;
import afonso.elimar.CassinoRomenia.domain.Roulette;

import java.util.List;

public class RouletteRepository {


    public Roulette save(List<Punter> punters, List<Employee> employees, int numPunters) {
        return new Roulette(numPunters, employees, punters);
    }
}
