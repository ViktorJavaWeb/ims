package org.example.javaEssential;

import org.example.javaEssential.abstraction.task2.DOCHandler;
import org.example.javaEssential.abstraction.task2.TXTHandler;
import org.example.javaEssential.abstraction.task2.XMLHandler;
import org.example.javaEssential.abstraction.task3.Player;
import org.example.javaEssential.abstraction.task5.ConverterTemperature;
import org.example.javaEssential.class_object.task2And3And4.Device;
import org.example.javaEssential.class_object.task2And3And4.EthernetAdapter;
import org.example.javaEssential.class_object.task2And3And4.Monitor;
import org.example.javaEssential.exceptions.task2.Worker;
import org.example.javaEssential.exceptions.task3.Price;
import org.example.javaEssential.exceptions.task5.Calculator;
import org.example.javaEssential.generics.task2.MyList;
import org.example.javaEssential.generics.task3.Book;
import org.example.javaEssential.generics.task3.MyDictionary;
import org.example.javaEssential.generics.task5.MyClass;
import org.example.javaEssential.inheritance_and_polymorphism.task2.*;
import org.example.javaEssential.inheritance_and_polymorphism.task3.Car;
import org.example.javaEssential.inheritance_and_polymorphism.task3.Plane;
import org.example.javaEssential.inheritance_and_polymorphism.task3.Ship;
import org.example.javaEssential.inheritance_and_polymorphism.task4.DocumentWorker;
import org.example.javaEssential.inheritance_and_polymorphism.task4.ExpertDocumentWorker;
import org.example.javaEssential.inheritance_and_polymorphism.task4.ProDocumentWorker;
import org.example.javaEssential.inheritance_and_polymorphism.task6.Printer;
import org.example.javaEssential.inheritance_and_polymorphism.task6.Second;
import org.example.javaEssential.lists.task2.Zoo;
import org.example.javaEssential.lists.task4.Main_task4;
import org.example.javaEssential.lists.task6.Main_task6;
import org.example.javaEssential.static_and_Nested_Classes_Anonymous_classes_and_Enums.task2.Animal;
import org.example.javaEssential.static_and_Nested_Classes_Anonymous_classes_and_Enums.task4.Vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main_Essential {
    public static String key = "";

    public static void main(String[] args) {

        /*================inheritance_and_polymorphism================*/

        /*Задача № 2*/

        ClassRoom classRoom = new ClassRoom(
                new Pupil[]{
                        new GoodPupil("Tom"),
                        new BadPupil("Jery"),
                        new ExcelentPupil("Natali"),
                        new BadPupil("Biff")});

        for (int i = 0; i < classRoom.listPupil.size(); i++) {
            System.out.println(classRoom.listPupil.get(i).getNamePupil());
            System.out.println("\t" + classRoom.listPupil.get(i).study());
            System.out.println("\t" + classRoom.listPupil.get(i).read());
            System.out.println("\t" + classRoom.listPupil.get(i).write());
            System.out.println("\t" + classRoom.listPupil.get(i).relax());

            System.out.println("==============================");
        }

        /*Задача № 3*/

        Plane plane = new Plane(2000, 56);
        System.out.println("plane height = " + plane.getHeight());
        System.out.println("plane voyager = " + plane.getCountVoyager());
        System.out.println("===================\n");
        Ship ship = new Ship(120, "Vancuver");
        System.out.println("ship port = " + ship.getPort());
        System.out.println("ship voyager = " + ship.getCountVoyager());
        System.out.println("===================\n");
        Car car = new Car();
        System.out.println("car price = " + car.getPrice());
        System.out.println("car speed = " + car.getSpeed());

        System.out.println("\n================================================\n");

        /*Задача № 4*/

        switch (key) {
            case "pro":
                ProDocumentWorker pro = new ProDocumentWorker();
                pro.openDocument();
                pro.editDocument();
                pro.saveDocument();
                break;
            case "exp":
                ExpertDocumentWorker exp = new ExpertDocumentWorker();
                exp.openDocument();
                exp.editDocument();
                exp.saveDocument();
                break;
            default:
                DocumentWorker def = new DocumentWorker();
                def.openDocument();
                def.editDocument();
                def.saveDocument();
        }
        System.out.println("\n================================================\n");

        /*Задача № 6*/

        new Printer().print("First Hello");
        new Second().print("Second Hello");

        System.out.println("\n================================================\n");

        /*================ABSTRACTION================*/

        /*Задача № 2*/
        String endLine = ".xml";

        String file = "/home/viktor/Ims/javaEssential/004_Abstraction/textTXT" + endLine;

        if (file.endsWith(endLine)) {

            switch (file.substring(file.lastIndexOf(endLine))) {
                case ".txt":
                    new TXTHandler(file).create();
                    break;
                case ".xml":
                    new XMLHandler(file).create();
                    break;
                case ".doc":
                    new DOCHandler(file).create();
                    break;
                default:
                    System.out.println("Невідомий формат");
                    break;
            }

        } else {
            System.out.println("Невідомий формат");
        }
        System.out.println("\n================================================\n");

        /*Задача № 3*/

        Player player = new Player();
        player.play();
        player.pause();
        player.stop();
        player.record();

        System.out.println("\n================================================\n");

        /*Задача № 5*/


        System.out.println(ConverterTemperature.celsToKelvin(30));
        System.out.println(ConverterTemperature.celsToFaring(30));

        System.out.println("\n================================================\n");

        /*================LISTS================*/

        /*Задача № 2*/

        Zoo zoo = new Zoo();
        zoo.addPet(0, "Ведмідь");
        zoo.addPet(0, "Лисиця");
        zoo.addPet(1, "Панда");
        zoo.addPet(1, "Черепаха");
        zoo.addPet(2, "Змія");
        zoo.addPet(3, "Слон");
        zoo.addPet(1, "Їжак");
        zoo.addPet(1, "Вовк");
        zoo.getListPet().forEach(x -> System.out.println(x));

        System.out.println("\n================================================\n");

        /*Задача № 3*/


        int[] c = new int[]{3, 5, 7};
        for (int i = 0; i < c.length; i++) {
            if (c[i] <= zoo.getListPet().size()) {
                System.out.printf("Видаляємо зі списку - %d %s\n", c[i], zoo.getListPet().remove(c[i] - 1));
            } else {
                System.out.printf("Розмір списку не відповідає індуксу %d на видалення !!\n", c[i]);
            }
        }

        zoo.getListPet().forEach(x -> System.out.println(x));
        System.out.println("Розмір списку після видалення - " + zoo.getListPet().size());

        System.out.println("\n================================================\n");

        /*Задача № 4*/

        new Main_task4().listIntToOne(1);

        System.out.println("\n================================================\n");

        /*Задача № 5*/

        List<String> listNameFriends = Arrays.asList("Tom", "Jery", "Alex", "Merci");
        listNameFriends.forEach(x -> System.out.print(x + " "));
        System.out.println("\n");
        listNameFriends.stream().sorted().forEach(x -> System.out.print(x + " "));

        System.out.println("\n================================================\n");

        /*Задача № 6*/

        /* Version 1 */
        System.out.println(new Main_task6().nameTeacher1("Alex"));
        /* Version 2 */
        System.out.println(new Main_task6().nameTeacher2("Alex"));

        System.out.println("\n================================================\n");


        /*================ static_and_Nested_Classes_Anonymous_classes_and_Enums================*/

        /*Задача № 2*/

        Animal pet = Animal.BIRD;
        System.out.println("pet = " + pet);

        System.out.println("\n================================================\n");


        /*Задача № 4*/

        Vehicles vehicle = Vehicles.BMW;
        System.out.println(vehicle);

        System.out.println("\n================================================\n");


        /*================EXCEPTIONS================*/

        /*Задача № 2*/

        List<Worker> workerList = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 2; i++) {
            try {
                String nameWorker = bufferedReader.readLine();
                String employeePosition = bufferedReader.readLine();
                String dataStarkWorker = bufferedReader.readLine();

                Worker worker = new Worker();
                worker.setLastName(nameWorker);
                worker.setEmployeePosition(employeePosition);
                worker.setDateStartWork(dataStarkWorker);

                workerList.add(worker);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        workerList = workerList.stream().sorted((x, y) -> x.getLastName().compareTo(y.getLastName()))
                .collect(Collectors.toList());
        System.out.println(workerList);

        System.out.println("\n================================================\n");

        /*Задача № 3*/

        BufferedReader readerPrice = new BufferedReader(new InputStreamReader(System.in));
        List<Price> priceList = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            try {
                Price price = new Price();
                String nameGoods = readerPrice.readLine();
                String nameStory = readerPrice.readLine();
                Double costNameGoods = Double.valueOf(readerPrice.readLine());

                price.setNameGoods(nameGoods);
                price.setNameStory(nameStory);
                price.setCostNameGoods(costNameGoods);

                priceList.add(price);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

        priceList = priceList.stream().sorted((x, y) -> x.getNameStory().compareTo(y.getNameStory())).collect(Collectors.toList());
        System.out.println(priceList);

        System.out.println("\n================================================\n");

        /*Задача № 5*/

        int x = 3;
        int y = 0;

        new Calculator(x, y, "ff");
        new Calculator(x, y, "sub");
        new Calculator(x, y, "mul");
        new Calculator(x, y, "div");

        System.out.println("\n================================================\n");


        /*================CLASS_OBJECT================*/

        /*Задача № 2*/
        System.out.println("\n================================================\n");

        /*Задача № 3*/
        System.out.println(new Device("Samsung", 120, "AB1234567CD"));
        System.out.println(new Monitor(1280, 1024, "Samsung", 120, "AB1234567CD"));

        System.out.println("\n================================================\n");

        /*Задача № 4*/
        Device device = new Device("Samsung", 120, "AB1234567CD");

        Monitor monitor = new Monitor(1280, 1024, "ASUS", 120, "AB123000000D");
        Monitor monitor4 = monitor;

        Device monitor2 = new Monitor(1280, 1024, "ASUS", 120, "AB123000000D");
        Device monitor3 = new Monitor(1000, 1024, "ASUS", 120, "AB123000000D");


        EthernetAdapter ethernetAdapter = new EthernetAdapter(2000, "Mac", "MacPRO", 120, "AWWWWW999567CD");

        System.out.println("equals1 = " + (monitor.equals(monitor2) ? "TRUE" : "FALSE"));
        System.out.println("equals2 = " + (monitor.equals(monitor3) ? "TRUE" : "FALSE"));
        System.out.println("equals3 = " + (monitor.equals(monitor4) ? "TRUE" : "FALSE"));

        System.out.println("hashCode1 = " + (monitor.hashCode() == monitor2.hashCode() ? "TRUE" : "FALSE"));
        System.out.println("hashCode2 = " + (monitor.hashCode() == monitor3.hashCode() ? "TRUE" : "FALSE"));
        System.out.println("hashCode3 = " + (monitor.hashCode() == monitor4.hashCode() ? "TRUE" : "FALSE"));

        System.out.println(monitor.equals(device) ? "TRUE" : "FALSE");


        System.out.println("\n================================================\n");


        /*Задача № 5*/

        org.example.javaEssential.class_object.task5.Animal animal = new org.example.javaEssential.class_object.task5.Animal("Васька", 45, false);
        System.out.println(animal);

        System.out.println("\n================================================\n");

        /*================CLASS_OBJECT================*/


        /*Задача № 2*/

        MyList<Object> m1 = new MyList<>();
        m1.addMyListElement(new String("Bay"));
        m1.addMyListElement(new MyList<>());

        System.out.println(m1.sizeMyList());
        System.out.println(m1.getMyListElement(0));

        System.out.println("\n================================================\n");

        /*Задача № 3*/

        MyDictionary myDictionary = new MyDictionary();
        myDictionary.addBook(new Book("MoonChare"));
        myDictionary.addBook(new Book("Good"));

        myDictionary.getList().forEach(System.out::println);
        System.out.println(myDictionary.getList().get(1));


        System.out.println("\n================================================\n");

        /*Задача № 5*/
        MyClass<String> g = new MyClass<>();
        MyClass<Integer> i = new MyClass<>();
        System.out.println(g.getClass().getSimpleName());

        System.out.println("\n================================================\n");
    }

}