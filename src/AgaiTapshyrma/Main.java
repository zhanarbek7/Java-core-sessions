package AgaiTapshyrma;

import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Mentor[] mentors = {new Mentor("Muhamed", 25), new Mentor("Zhanarbek", 34),
                new Mentor("Aizhan", 23), new Mentor("Muhammed", 43)};

        Student[] students = new Student[40];

        for(int i = 0; i<40; i++)
        {
            int randomNumber = random.nextInt(0, 6);
            switch (randomNumber){
                case 0 -> students[i] = new Student("Syimyk-"+i, 10+i );
                case 1 -> students[i] = new Student("Argen-"+i, 10+i );
                case 2 -> students[i] = new Student("Aimerim-"+i, 10+i );
                case 3 -> students[i] = new Student("Maksat-"+i, 10+i );
                case 4 -> students[i] = new Student("Ainazik-"+i, 10+i );
                case 5 -> students[i] = new Student("Jazira-"+i, 10+i );
            }


        }

        for (Student i: students) {
            switch(random.nextInt(1,5)){
                case 1 -> mentors[0].addStudent(i);
                case 2 -> mentors[1].addStudent(i);
                case 3 -> mentors[2].addStudent(i);
                case 4 -> mentors[3].addStudent(i);
            }
        }

        for (Mentor i: mentors){
            System.out.println("Mentor: "+i.getName());
            for (int j = 0; j < i.getIndexOfNewStudent(); j++) {
                System.out.println(i.getStudents()[j].getName());
            }
            System.out.println("-----------------------");
        }

        for (Mentor i: mentors)
            System.out.printf("----Ментору по имени %s попалось %d студентов\n", i.getName(), i.getIndexOfNewStudent());
    }

}
