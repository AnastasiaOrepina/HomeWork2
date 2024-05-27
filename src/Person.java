public class Person {
    String name;
    String post;
    String email;
    String phone;
    int salary;
    int age;
    public Person(String name, String post, String email, String phone, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void infoPerson(){
        System.out.println("Сотрудник " + name, " работает " + post, ". Контактная информация: " + email, " , " + phone, ". Зарплата " + salary, ". Возраст" + age);
    }
}

public static void main(String[] args) {
    Person employee1 = new Person();
    employee1.infoPerson("Ivanov Ivan Ivanovich", "AQA", "Iva@inbox.com", "89098808989", 30000, 30);
}

