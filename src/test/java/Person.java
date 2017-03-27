/**
 * Created by wangwei12 on 2017/3/8.
 */
public class Person {
    private String name;
    private int age;

    public String speak(){
        return "I am speaking";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  Person(){
    }

    public Person(int age){
    }

    public  Person(String name){
        this.name=name;
    }


}
