package afonso.elimar.CassinoRomenia.repository;

import afonso.elimar.CassinoRomenia.domain.Employee;

import java.util.ArrayList;

public class EmployeeRepository {

    public Employee save(String name, Integer registration) {
         return new Employee(name, registration);
    }

    public ArrayList<Employee> setEmployee() {
        // Buscando e inserindo os funcionarios na roleta
        Employee elimar = this.save("Elimar", 111);
        Employee ricardo = this.save("Ricardo", 222);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(elimar);
        employees.add(ricardo);

        return employees;
    }
}
