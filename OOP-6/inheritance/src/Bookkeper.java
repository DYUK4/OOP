public class Bookkeper extends Human {
    private String capital;

    public String getCapital() {return capital;}
    public void setCapital(String capital) {this.capital = capital;}

    public Bookkeper(String lastName, String firstName, int age, String capital) {
        super(lastName, firstName, age);
        setCapital(capital);
    }

    @Override
    public String toString() {
        return super.toString() + " " + capital;
    }
}
