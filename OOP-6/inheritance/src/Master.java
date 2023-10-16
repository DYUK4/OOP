public class Master extends Specialist {
    private String psychologist;

    public String getPsychologist() {return psychologist;}
    public void setPsychologist(String psychologist) {this.psychologist = psychologist;}

    public Master(String lastName, String firstName, int age,
                  String speciality, String group, double rating, double attendance,
                  String diplom, String psychologist) {
        super(lastName, firstName, age, speciality, group, rating, attendance, diplom);
        setPsychologist(psychologist);
    }
    @Override
    public String toString() {
        return super.toString() + " " + psychologist;
    }
}
