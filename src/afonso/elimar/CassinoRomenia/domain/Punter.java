package afonso.elimar.CassinoRomenia.domain;

public class Punter extends Person{
    private int idPunter;
    private double wallet;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Punter punter = (Punter) o;

        return idPunter == punter.idPunter;
    }

    @Override
    public int hashCode() {
        return idPunter;
    }


    public Punter(int idPunter, double wallet) {
        this.idPunter = idPunter;
        this.wallet = wallet;
    }

    public void setBonus(double bonus){
        this.setWallet(bonus);
    }

    public int getIdPunter() {
        return idPunter;
    }

    public void setIdPunter(int idPunter) {
        this.idPunter = idPunter;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }
}
