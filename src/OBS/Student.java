package OBS;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuno;
    String classes;
    int verbalnote1;
    int verbalnote2;
    int verbalnote3;
    double average;
    double averagenote1;
    double averagenote2;
    double averagenote3;
    boolean isPass;


    Student(String name, String stuno, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuno = stuno;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1,int verbalnote1,int note2,int verbalnote2,int note3,int verbalnote3) {

        this.verbalnote1=verbalnote1;
        this.verbalnote2=verbalnote2;
        this.verbalnote3=verbalnote3;

        this.averagenote1 =(verbalnote1*0.20)+(note1*0.80);
        this.averagenote2 =(verbalnote2*0.20)+(note2*0.80);
        this.averagenote3 =(verbalnote3*0.20)+(note3*0.80);

        if (note1 >= 0 && note1 <= 100 && verbalnote1>=0 && verbalnote1<=100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100 && verbalnote2>=0 && verbalnote2<=100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100 && verbalnote3>=0 && verbalnote3<=100) {
            this.c3.note = note3;
        }
    }


    void isPass(){
        this.average = (this.averagenote1+ this.averagenote2 + this.averagenote3)/3.0;
        System.out.println(average);
        if(this.average>=55){
            System.out.println("Sınıfı Geçtiniz.");
        }else{
            System.out.println("Sınıfta Kaldınız!");
        }
    }

    void printNote(){
        System.out.println(this.c1.name + " Notu: " + this.averagenote1);
        System.out.println(this.c2.name + " Notu: " + this.averagenote2);
        System.out.println(this.c3.name + " Notu: " + this.averagenote3);
    }
}
