package afonso.elimar.CassinoRomenia.domain;

public class Employee extends Person {
   private Integer registration;

   public Employee(String name, Integer registration) {
       super(name);
       this.registration = registration;
   }
}
