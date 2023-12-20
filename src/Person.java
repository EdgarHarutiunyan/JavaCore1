public class Person {
    String name;
    int age;

    @Override
    public String toString() {
        return name + " " + age;
    }
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        String temp = p2.name;
        p2.name = p1.name;
        p1.name = temp;

        int temp2 = p2.age;
        p2.age = p1.age;
        p1.age = temp2;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Joe";
        p1.age = 20;
        Person p2 = new Person();
        p2.name = "Patrick";
        p2.age = 22;

        System.out.println("Person 1: " + p1);
        System.out.println("Person 2: " + p2);

        changeIdentities(p1,p2);

        System.out.println("Person 1: " + p1);
        System.out.println("Person 2: " + p2);
    }
}
