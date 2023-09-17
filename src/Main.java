import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> numbers = new ArrayList<>();

        ArrayList<String> users = new ArrayList<>();

        ArrayList<cars> Allcars = new ArrayList<>();

        /*numbers.add("A214XE12");
        numbers.add("А125E12");
        numbers.add("О124РЕ12");
        numbers.add("А451РЕ2");
        numbers.add("В777АУ777");
        numbers.add("А228УУ28");

        users.add("аНАТОЛИЙ");
        users.add("Андрей");
        users.add("Васек");
        users.add("Кент");
        users.add("Мент");
        users.add("Леха");*/

        cars car1 = new cars("Tesla", "X", "None", "Black");
        cars car2 = new cars("BMW", "X6", "None", "White");
        cars car3 = new cars("Mers", "X8", "None", "White");
        cars car4 = new cars("lada", "X9", "None", "Black");
        cars car5 = new cars("infinity", "X10", "None", "Black");
        cars car7 = new cars("toyota", "X11","None", "White");
        cars car6 = new cars("hyonday", "X12", "None", "Black");

        Allcars.add(car1);
        Allcars.add(car2);
        Allcars.add(car3);
        Allcars.add(car4);
        Allcars.add(car5);
        Allcars.add(car6);
        Allcars.add(car7);


        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Выберите режим работы: 1 - покупатель, 2 - менеджер");

            int mode = scan.nextInt();

            if(mode == 1){
                System.out.println("Список всех машин: ");
                for(int i = 0; i < Allcars.size(); i++){
                    System.out.println("Марка машины: " + Allcars.get(i).mark +
                            " Модель машины: " + Allcars.get(i).model +
                            " Номер машины: " + Allcars.get(i).number +
                            " Цвет машины: " + Allcars.get(i).color);
                }
                System.out.println("Введите марку машины, которую вы хотите купить: ");

                String MarkBuy = scan.next();

                for(int i = 0;i < Allcars.size(); i++){
                    if(MarkBuy.equals(Allcars.get(i).mark)){
                        System.out.println("Вы выбрали машину: " + Allcars.get(i).mark);
                        System.out.println("На какое имя вы хотите зарегестировать автомобиль?");
                        String buyName = scan.next();
                        System.out.println("На какой номер вы хотите зарегестировать автомобиль?");
                        String numberCar = scan.next();

                        users.add(buyName);
                        numbers.add(numberCar);
                        System.out.println("Машина успешно куплена на имя: " + buyName + " и зарегестирована на номер: " + numberCar);
                    }
                }
            } else if(mode == 2){
                System.out.println("Список всех машин: ");
                for(int i = 0; i < Allcars.size(); i++){
                    System.out.println("Марка машины: " + Allcars.get(i).mark +
                            " Модель машины: " + Allcars.get(i).model +
                            " Номер машины: " + Allcars.get(i).number +
                            " Цвет машины: " + Allcars.get(i).color);
                }

                System.out.println("Что вы хотите сделать? 1 - добавить машину, 2 - удалить машину, 3 - посмотреть БД номеров");

                int ManageMode = scan.nextInt();

                if(ManageMode == 1){
                    System.out.println("Введите информацию автомобиля");
                    String mark = scan.next();
                    String model = scan.next();
                    String color = scan.next();

                    Allcars.add(new cars(mark,model,"None", color));
                } else if(ManageMode == 2){
                    System.out.println("Функция будет добавлена позже!");
                }else if(ManageMode == 3){
                    for(int i = 0; i < users.size(); i++){
                        System.out.println("Номер машины:" + numbers.get(i)+ " Владелец: " + users.get(i));
                    }
                }

            }
        }

    }
}