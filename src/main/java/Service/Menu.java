package Service;
import Data.*;
import java.util.Scanner;

public class Menu {
    private static DataBase dataBase;
    private static Basket basket;

    public Menu(DataBase dataBase, Basket basket){
        Menu.dataBase = dataBase;
        Menu.basket = basket;
    }

    public DataBase getDataBase(){
        return dataBase;
    }
    public static void showMenu(){
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        while(flag){
            mainMenu();
            int choiceMainMenu = scanner.nextInt();
            switch (choiceMainMenu){
                case 1:
                    System.out.println(dataBase.getProducts());
                case 2:
                    filterMenu();
                case 3:
                    basket.printBasket();
                case 4:
                    //TODO сделать реализацию этого действия
            }
        }
    }


    public static void mainMenu(){
        System.out.println("Выберите операцию и введите её номер: " + '\n' +
                "1.Показать все доступные товары" + '\n' +
                "2.Показать только нужные товары(насторить фильтрацию)" + '\n' +
                "3.Показать карзину" + '\n' +
                "4.Возврат заказа, повтороение заказа");
    }

    public static void filterMenu(){
        System.out.println("Выберите какие товары хотите увидеть и введите номер фильтра:" + '\n' +
                "1.Молочные продукты" + '\n' +
                "2.Выпечка" + '\n' +
                "3.Рыба" + '\n' +
                "4.Мясо" + '\n' +
                "5.Овощи");
    }
}
