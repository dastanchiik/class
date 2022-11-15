public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Асан";
        student.age = 19;
        student.height = 1.80;
        student.wallet = "бай";
        student.national = "Кыргыз";
        System.out.println(student.name+"\n"+"жашы: "+student.age+"\n"+"бою: "+student.height+"\n"+student.wallet+"\n"+student.national+"\n");
        Student.well();
        Student.howMany();
        Cat cat = new Cat();
        cat.name = "Сима";
        cat.breed = "белая-английская";
        cat.color = "Ак";
        System.out.println("\n"+"анын мышыгы: "+cat.name+"\n"+"пародасы: "+cat.breed+"\n"+"тусу: "+cat.color);
        Cat.character();
        Cat.hair();
        Auto auto = new Auto();
        auto.brand = "Таёта камри";
        auto.color = "кара";
        auto.power = 2.1;
        auto.price = 220000;
        System.out.println("\n"+"анын машинасы: "+auto.brand+"\n"+auto.color+"\n"+auto.power+"\n"+auto.price);
        Auto.mileage();
        Auto.petrol();
        Dog dog = new Dog();
        dog.name = "Цезарь";
        dog.breed = "Лабарадор";
        dog.color = "кара";
        System.out.println("\n"+"анын ити: "+dog.name+"\n"+dog.breed+"\n"+dog.color);
        Dog.size();
        Dog.speed();
    }
}