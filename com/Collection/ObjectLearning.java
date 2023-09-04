import java.util.Objects;

class Car {
    String name;
    int age;

    Car(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return age == car.age && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

public class ObjectLearning {
    public static void main(String[] args) {
        Car obj = new Car("Krishna", Integer.MAX_VALUE);
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.toString());
    }
}
