public class Main {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Petrova Polina", "QA Engineer", "pepolina@mailbox.com", "892896567", 40000, 35);
        persArray[2] = new Person("Nosov Dmitriy", "AQA Engineer", "nodmitriy@mailbox.com", "898976546", 39000, 39);
        persArray[3] = new Person("Ivanova Svetlana", "AQA Engineer", "ivsvetlana@mailbox.com", "892567900", 35000, 40);
        persArray[4] = new Person("Stepanov Stepan", "Engineer", "ststepan@mailbox.com", "897890678", 25000, 25);

        persArray[1].infoPerson();
    }
}
