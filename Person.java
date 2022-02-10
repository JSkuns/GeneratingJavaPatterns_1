import java.util.StringJoiner;

public class Person {

    private final String name;
    private final String surname;
    private int age;
    private String address;

    public Person(PersonBuilder personBuilder) {
        this.name = personBuilder.name;
        this.surname = personBuilder.surname;
        this.age = personBuilder.age;
        this.address = personBuilder.address;
    }

    public boolean hasAge() {
        return age != 0;
    }

    public boolean hasAddress() {
        return address != null;
    }

    public void happyBirthday() {
        age++;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(", ");
        if (name != null) {
            sj.add("Имя:" + name);
        }
        if (surname != null) {
            sj.add("Фамилия:" + surname);
        }
        if (age != 0) {
            sj.add("Возраст:" + age);
        }
        if (address != null) {
            sj.add("Адрес:" + address);
        }
        return "[Человек -> " + sj + "]";
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder child = new PersonBuilder();
        child.setSurname(surname)
                .setAge(5)
                .setAddress(address);
        return child;
    }

}
