public class PersonBuilder {

    protected String name;
    protected String surname;
    protected int age;
    protected String address;

    public PersonBuilder() {
        super();
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        // проверка ввода обязательных данных
        if (name == null || surname == null) {
            throw new IllegalStateException("Не указаны все необходимые данные (обязательны к заполнению: имя, фамилия)");
        }
        // проверка возраста
        if (age <= 0 || age > 125) {
            throw new IllegalArgumentException("Укажите правильный возраст (от 0 до 125)");
        }
        return new Person(this);
    }

}
