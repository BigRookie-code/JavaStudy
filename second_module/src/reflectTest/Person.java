package reflectTest;

public class Person {
    public String name;
    protected  String age;
    private String hobby;

    public Person(String name, String age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }
    public String getHobby(){
        return hobby;
    }
}
class Employee extends Person{
    public static Integer totalNum = 0;
    public int empNo;
    protected String position;
    private int salary;
    public void sayHello(){
        System.out.println(String.format("hello i am: %s,age %s,hobby : %s ,job : %s, salary : %s \n",name,age,getHobby(),position,salary));
    }
    private void work() {
        System.out.println(String.format("My name is %s, 工作中勿扰.", name));
    }

    public Employee(String name, String age, String hobby, int empNo, String position, int salary) {
        super(name, age, hobby);
        this.empNo = empNo;
        this.position = position;
        this.salary = salary;
        Employee.totalNum++;
    }
}