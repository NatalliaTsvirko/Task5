package by.tsvirko.tasks.lesson5.task2;

public class Phone {
    private int number;
    private String model;
    private double weight;

    public static void main(String[] args) {

        Phone huawei = new Phone();
        huawei.model = "Huawei p10";
        huawei.number = 236589741;
        huawei.weight = 100;

        huawei.receiveCall("Саша");
        huawei.getNumber(huawei.number);

        Phone samsung = new Phone();
        samsung.model = "Samsung S20";
        samsung.number = 236547458;
        samsung.weight = 100;

        samsung.receiveCall("Вася");
        samsung.getNumber(samsung.number);

        Phone apple = new Phone();
        apple.model = "Apple 13 pro";
        apple.number = 56897458;
        apple.weight = 80;

        apple.receiveCall("Витя");
        apple.getNumber(apple.number);

        System.out.println("Модель телефона : " + huawei.model + '\n' +
                "Номер телефона : " + huawei.number + '\n' +
                "Вес телефона " + huawei.weight);
        System.out.println("Модель телефона : " + samsung.model + '\n' +
                "Номер телефона : " + samsung.number + '\n' +
                "Вес телефона " + samsung.weight);
        System.out.println("Модель телефона : " + apple.model + '\n' +
                "Номер телефона : " + apple.number + '\n' +
                "Вес телефона " + apple.weight);
        huawei.sendMessage(huawei.number);
        samsung.sendMessage(samsung.number);
        apple.sendMessage(apple.number);

    }

    public void receiveCall(String name) {

        System.out.println("Звонит " + name);
    }

    public void getNumber(int number) {
        System.out.println(number);
    }

    public void sendMessage(int number, int...arg){
        System.out.println(number);

    }

    public Phone(int number, String model, double weight) {
        this(number,model);
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }
}
