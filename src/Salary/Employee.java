package Salary;

public class Employee {

    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee (String name,int salary,int workHours,int hireYear){

        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    double tax(){
        if (this.salary>=1000){
            return this.salary*0.03;
        }
        return 0.0;
    }
    double bonus(){
        if (this.workHours>40){
            int bonHours = this.workHours-40;
            int bonusMoney = bonHours*30;
            return bonusMoney;
        }
        return 0.0;
    }
    double raiseSalary(){
        int workyear=2021-hireYear;
        if (workyear<10){
            return this.salary*0.05;
        }else if (workyear>=10 && workyear<20){
            return this.salary*0.10;
        }else
            return this.salary*0.15;
    }
    public void toString(Employee employee){
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : "+ this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı :" + raiseSalary());
        double totalsalary=this.salary-tax()+bonus();
        System.out.println("Vergi ve Bonuslar ile birlikte maaş :" + totalsalary);
        double totalsalarywithraisesalary=totalsalary+raiseSalary();
        System.out.println("Toplam Maaş : " + totalsalarywithraisesalary);
    }
}
