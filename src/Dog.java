public class Dog {
    String name="Шарик";
    int age=3;
    public Dog(String n,int a) {name = n; age = a;}{
        this.name=name;
        this.age=age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHuman(){
        return age*7;
    }
}