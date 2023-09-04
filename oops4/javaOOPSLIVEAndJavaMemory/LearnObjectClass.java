package javaOOPSLIVEAndJavaMemory;

import java.util.Objects;

class Car {
    String model;
    int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

//    @Override
//    public String toString() {
//        return "Car{" +
//                "model='" + model + '\'' +
//                ", year=" + year +
//                '}';
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year);
    }

    @Override
    protected void finalize() {
        System.out.println("cleaning up");
    }

//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    //    @Override
//    public int hashCode() {
//        int initialNumber = 31;
//        initialNumber += year;
//        initialNumber += model.hashCode();
//        return initialNumber;
//    }
//
//        public boolean equals(Object obj) {
//        Car that = (Car)obj;
//        if(this.model.equals(that.model) && this.year == that.year) {
//            return true;
//        }
//        return false;
//    }


//    @Override
//    public String toString() {
//        return "Car ka model "+model+" and year is "+year;
//    }
}

public class LearnObjectClass {

    public static void main(String[] args) throws CloneNotSupportedException {
        Car obj1 = new Car("Honda", 2022);
        Car obj2 = new Car("Honda", 2021);

        Car obj3 = obj1; // this is not a clone
//        Car obj4 = (Car)obj1.clone();


        System.out.println(obj1.getClass());
        System.out.println(obj2.getClass());

        System.out.println(obj1.equals(obj2));

        System.out.println(obj1);
//        System.out.println(obj4);

        System.gc();
    }


}










