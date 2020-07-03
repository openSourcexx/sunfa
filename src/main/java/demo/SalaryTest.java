package demo;

import java.util.Scanner;

class Employee {
    private String name;
    private int mouth;

    Employee() {//����Ĭ��
        name = "����";
        mouth = 5;
    }

    Employee(String name, int mouth) {
        setName(name);
        setMouth(mouth);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMouth() {
        return mouth;
    }

    public void setMouth(int mouth) {
        this.mouth = mouth;
    }

    double getSalary(int mouth) {//����+100
        return mouth == this.mouth ? 100 : 0;
    }
}

//�̶�н����:��н
class SalariedEmployee extends Employee {
    private int mouthlySalary;

    SalariedEmployee() {
    }

    SalariedEmployee(int mouthlySalary) {
        setMouthlySalary(mouthlySalary);
    }

    SalariedEmployee(String name, int mouth, int mouthlySalary) {
        super(name, mouth);
        setMouthlySalary(mouthlySalary);
    }

    //������н����
    public int getMouthlySalary() {
        return mouthlySalary;
    }

    public void setMouthlySalary(int mouthlySalary) {
        this.mouthlySalary = mouthlySalary;
    }

    //@Override
    double getSalary(int mouth) {
        return mouthlySalary + super.getSalary(mouth);
    }
}

//ʱн��:�������ֹ���=(Сʱ��-160)*ʱн*1.5+ʱн*Сʱ��
class HourlyEmployee extends Employee {
    private int hours;
    private double hourlySalary;

    HourlyEmployee() {
    }

    HourlyEmployee(double hourlySalary, int hours) {
        setHourlySalary(hourlySalary);
        setHours(hours);
    }

    HourlyEmployee(String name, int mouth, double hourlySalary, int hours) {
        super(name, mouth);
        setHourlySalary(hourlySalary);
        setHours(hours);
    }

    public double getHourlySalary() {
        return hourlySalary;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    double getSalary(int mouth) {
        if (hours >= 160) {//���գ�
            return (((hours - 160) * hourlySalary * 1.5 + hourlySalary * hours) + super.getSalary(mouth));
        } else {
            return hourlySalary * hours;
        }
    }
}

//����ࣺ�����*���۶�
class SalesEmployee extends Employee {
    private int sales;
    private double commission;

    SalesEmployee() {
    }

    SalesEmployee(int sales, double commission) {
        setSales(sales);
        setCommission(commission);
    }

    SalesEmployee(String name, int mouth, int sales, double commission) {
        super(name, mouth);
        setSales(sales);
        setCommission(commission);
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public int getSales() {
        return sales;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    double getSalary(int mouth) {
        //���� ��ɹ���=������*�����
        return sales * commission + super.getSalary(mouth);
    }
}

//��н+����ࣺ�����*���۶�+��н
class BasePlusSalesEmployee extends SalesEmployee {
    private int baseSalary;

    BasePlusSalesEmployee() {
    }

    BasePlusSalesEmployee(int sales, double commission, int baseSalary) {
        super(sales, commission);
        setBaseSalary(baseSalary);
    }

    BasePlusSalesEmployee(String name, int mouth, int sales, double commission, int baseSalary) {
        super(name, mouth, sales, commission);
        setBaseSalary(baseSalary);
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    double getSalary(int mouth) {
        //����
        return baseSalary + super.getSalary(mouth);//���ø���
    }
}

//���
public class SalaryTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�����·ݣ�");
        int m = sc.nextInt();//�����·�

        Employee e1 = new Employee();
        System.out.println("Ա�����գ�" + e1.getMouth());//���Ա�����յ���

        //�̶�����
        SalariedEmployee e2 = new SalariedEmployee();
        e2.setMouthlySalary(8000);
        System.out.println("�̶���н���ʣ�" + e2.getSalary(m));

        //ʱн
        HourlyEmployee e3 = new HourlyEmployee();
        e3.setHourlySalary(30);
        e3.setHours(180);
        System.out.println("ʱн����н�ʣ�" + e3.getSalary(m));

        //���
        SalesEmployee e4 = new SalesEmployee();
        e4.setCommission(20);
        e4.setSales(300);
        System.out.println("����ɼ��㹤�ʣ�" + e4.getSalary(m));

        //���+��н
        BasePlusSalesEmployee e5 = new BasePlusSalesEmployee();
        e5.setBaseSalary(2000);
        e5.setCommission(20);
        e5.setSales(300);
        System.out.println("���+��н���ʣ�" + e5.getSalary(m));
        //���� ����ѡ��Ա�����������ռ���������
    }
}