public class Main {
    public static void main(String[] args) {
     String sepor = "\n=========================================================";
        Human tommy = new Human("Vercetti","Tomas",30);
        System.out.println(tommy+""+sepor);

        Student student = new Student("Pinkman","Jassie",25,"Chemistry","WV_220",90,95);
        System.out.println(student+""+sepor);

        Teacher teacher = new Teacher("White","Walter",50,"Chemistry",25);
        System.out.println(teacher+""+sepor);

        Graduate graduate = new Graduate("Schreder","Hank",40,
                                          "Criminalistic","OBN",70,50,
                                           "How to catch Heisenberg");
        System.out.println(graduate+""+sepor);

        Student student1 = new Student(tommy,"Theft","Vice",90,98);
        System.out.println(student1+""+sepor);

        Specialist specialist =new Specialist("Franclin","Klinton",30,"Sniper","GTA",80,88,"Bank");
        System.out.println(specialist+""+sepor);

        Bookkeper bookkeper = new Bookkeper("Michael","DeSanta",40,"accountant");
        System.out.println(bookkeper+""+sepor);

        Master master = new Master("Trevor","Filips",40,"robber","GTA",90,100,"outlaw","psycho");
        System.out.println(master+""+sepor);
    }

}