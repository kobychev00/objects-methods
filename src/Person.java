public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean isAdult() {
        return getAge() > 18;
    }

    public String getName() {
        return this.name;

    }

    public int getAge() {

        return this.age;
    }

    public void increaseAge(int increament) {
        if (increament < 0) {
            throw new IllegalArgumentException("Инкримент не может быть отрицательным");
        }
        this.age = age + increament;
    }

    public String toString() {
        return "Имя " + this.name + " Возраст " + this.age;
    }
}

