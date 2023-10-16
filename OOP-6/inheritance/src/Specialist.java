
public class Specialist extends Student {
        private String diplom;

    public String getDiplom() {return diplom;}
    public void setDiplom(String diplom) {this.diplom = diplom;}

    public Specialist(String lastName, String firstName, int age,
                      String speciality, String group, double rating, double attendance,
                      String diplom)
    {
        super(lastName, firstName, age, speciality, group, rating, attendance);
        setDiplom(diplom);
    }
    @Override
    public String toString() {
        return super.toString()+" "+diplom;
    }

}
