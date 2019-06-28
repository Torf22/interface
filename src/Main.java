import area.Rectangle;
import area.Square;
import singerAndRunner.Girl;
import singerAndRunner.Man;
import singerAndRunner.Runner;
import singerAndRunner.Singer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LaptopCalculator laptopCalculator = new LaptopCalculator();
        TelephoneCalculator telephoneCalculator = new TelephoneCalculator("Hello", 50);

        laptopCalculator.scream();
        telephoneCalculator.scream();

       laptopCalculator.creator();
       telephoneCalculator.creator();

        Square square = new Square(4.5);
        Rectangle rectangle = new Rectangle(2.3, 6.1);

        System.out.println(square.area());
        System.out.println(rectangle.area());

        List<Singer> singers = new ArrayList<>();
        List<Runner> runners = new ArrayList<>();
        List<Man> manList = new ArrayList<>();
        Man oleg = new Man("Oleg", 16, false, true);
        Man yura = new Man("Yura", 28, true, false);
        Man igor = new Man("Igor", 25, true, false);
        Man vova = new Man("Vova", 21, false, true);
        Man max = new Man("Max", 36, true, false);
        manList.add(oleg);
        manList.add(yura);
        manList.add(igor);
        manList.add(vova);
        manList.add(max);
        List<Girl> girlList = new ArrayList<>();
        girlList.add(new Girl("Nastya", 29, false, true));
        girlList.add(new Girl("Nadya", 49, false, true));
        girlList.add(new Girl("Vira", 25, true, false));
        girlList.add(new Girl("Polya", 16, true, false));
        girlList.add(new Girl("Olya", 36, false, true));

        for (Girl girl : girlList) {
            if (girl.isRuning()==true){
                runners.add(girl);
            }if (girl.isSining() == true){
                singers.add(girl);
            }
        }
        for (Man man : manList) {
            if (man.isRuning() == true){
                runners.add(man);
            }if (man.isSining() == true){
                singers.add(man);
            }
        }
       
        System.out.println(runners);
        System.out.println(singers);
        System.out.println(girlList);
        System.out.println(manList);
    }
}


//Стоврити 4 класи ,які будуть відповідати наступному інтерфейсу
//interface Calculator{
//    void calculate(int a, int b);
//}
//
//1. ствоити інтрейфейс, імплеметувати його в 2 класи.
//        В класах є приватне поле meaasge.
//        Зробити всі необхідні маніпуляції для ініціалізації полів.
//        в  інтерфейсі визначити метод void scream(); який буде виводити інформацію в консоль.
//        В першому классі зробити реалізацію методу на вивід message "аааааааа!!!!!"
//        В другому класі зробити реалізацію методу на вивід massage "ууууууууу".
//
//        В головному класі. створити метод, котрий приймає об'єкт цього інтерфейсу і виконує його метод
//
//        2.
//        Створити інтерфейс метод  creator() якого вертає числовий масив.
//        Реалізувати його в двох класах.
//        В першому класі метод повинен формувати масив рандомних чисел в діапазоні 0 до 200
//        В другому класі метод повинен формувати масив рандомних чисел в діапазоні  0 до х?
//        В першому класі та другому класі є поле lenght яке визначає довжину масиву який ви булите генерувати
//        В другому класі є додаткове поле  х , яке визначає діапазон.
//        В першому классі діапазон завжди постійний. Число ,яке характеризує діапазон оголошено як змінна інтерфейсу
//
//        3.
//        Створити інтрефейс, з методом square() який повертає число з поаваючою крапкою.
//        Суть метода square() - обчисленя полщі в залежності від фігури.
//        Створити двіі реалізації цього інтерфейсу.
//        Одна це Kvadrat. цей класс має поля, які харатеризують його сторони.
//        Друга - Priamokutnyk цей класс має поля, які харатеризують його сторони.
//        4.
//        стоврити 2 класи якиі будуть реалізовувати 2 інтерфейси - Singer , Runnner.
//        Методи придумати самостійно.
//        Стоврити 5 об'єктів, та масиви Singer [] singers та Runner [] runnners
//        покласти об'єкти відповідних типів у відповідні масиви