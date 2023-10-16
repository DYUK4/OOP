public class Teacher extends Human {

    private String speciality;
    private int experientce;

    public void setSpeciality(String speciality) {this.speciality = speciality;}
    public String getSpeciality() {return speciality;}

    public void setExperientce(int experientce) {this.experientce = experientce;}
    public int getExperientce() {return experientce;}

    public Teacher(String lastName, String firstName, int age, String speciality, int experientce) {
        super(lastName, firstName, age);
        setSpeciality(speciality);
        setExperientce(experientce);
        System.out.println("TConstructor Teacher:\t"+Integer.toHexString(hashCode()));
    }
    @Override
    public String toString() {
        return super.toString() +" "+speciality+" "+experientce;
    }
}
