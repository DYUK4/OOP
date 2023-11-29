import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException
    {

        Human[] group = new Human[]
                {
                        new Student("Pinlman", "Jessie", 25, "Chemistry", "WW_22", 90, 95),
                        new Teacher("Pinl", "Jes", 25, "Chemistry", 50),
                        new Graduate("Shreder", "Hank", 40, "Criminalistik", "OBN", 50, 70, "How"),
                        new Specialist("Versetti", "Tommy", 30, "Theft", "Vice", 98, 99, "Get money back", 5),
                        new Teacher("Diaz", "Ricardo", 50, "Weapons disrtibution", 250),

                };
         for (int i = 0; i < group.length; i++) {
             System.out.println(group[i]);
           }

//////////////////////////////////////////////////////////////////////////////////
        save(group,"group.txt");
 //////////////////////////////////////
        load("group.txt");
/////////////////////////////////////////////////////////////////////////////////////



    }
    public static void save(Human[] group, String filename)throws IOException
    {
        File file = new File(filename);
        System.out.println(file.getAbsoluteFile());
        file.delete();
        file.createNewFile();

        FileWriter writer = new FileWriter(file);
        // Запись каждого объекта Human в файл
        for(int i = 0 ; i < group.length; i++)
        {
            writer.write(((Object)group[i]).getClass().getSimpleName() + ":\t" + group[i].toString() + ";");
            writer.write('\n');
        }
        writer.close(); //Потоки обязательно нужно закрывать

        // Открытие файла в Notepad++
        String command = "C:\\Program Files\\Notepad++\\notepad++ " + filename;
        Process process;
        process = Runtime.getRuntime().exec(command);
    }


    public static Human[] load(String filename) throws FileNotFoundException {
        ArrayList<Human> al_group = new ArrayList<>();
        File file = new File(filename);
        Scanner scanner = new Scanner(file);    //Создаем и открываем поток чтения из файла
        while(scanner.hasNextLine())  // Чтение каждой строки файла
        {
            String buffer = scanner.nextLine();
            if(buffer.isEmpty())continue;
            String[] values = buffer.trim().split("[:,;]\\s*");

            Human member = HumanFactory.Create(values[0]);    // Создание и инициализация объекта Human
            if (member == null) {
                System.out.println("Invalid type: " + values[0]);
                continue;
            }
            member.init(values);
            al_group.add(member);
        }
        scanner.close();    // Закрытие потока чтения

        Human[] group = al_group.toArray(new Human[0]);
        for (Human human : group) {
            System.out.println(human);
        }
        return group;
    }
}

