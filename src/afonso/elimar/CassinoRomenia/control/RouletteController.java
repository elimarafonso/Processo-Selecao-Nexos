package afonso.elimar.CassinoRomenia.control;

import afonso.elimar.CassinoRomenia.domain.Employee;
import afonso.elimar.CassinoRomenia.domain.Punter;
import afonso.elimar.CassinoRomenia.domain.Roulette;
import afonso.elimar.CassinoRomenia.repository.EmployeeRepository;
import afonso.elimar.CassinoRomenia.repository.PunterRepository;
import afonso.elimar.CassinoRomenia.repository.RouletteRepository;

import java.util.List;

public class RouletteController {
    RouletteRepository rouletteRepository = new RouletteRepository();
    PunterRepository punterRepository = new PunterRepository();
    EmployeeRepository employeeRepository = new EmployeeRepository();

    public Roulette setRoulette(int valorN) {
        int numPunters = valorN;

        List<Employee> employees = employeeRepository.setEmployee();
        List<Punter> punters = punterRepository.setPunters(numPunters);

        Roulette roulette = rouletteRepository.save(punters, employees, numPunters);

        return roulette;
    }
}
