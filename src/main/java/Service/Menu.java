package Service;
import Data.*;
import Filters.FilterForPrice;
import Filters.FilterForTitle;
import Product.TypeProduct;

import java.util.Scanner;

public class Menu {
    private static final DataBase dataBase = DataBase.get();
    private static Basket basket;

    public Menu(Basket basket){
        Menu.basket = basket;
    }

    public void showMenu(){
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        while(flag){
            mainMenu();
            int choiceMainMenu = scanner.nextInt();
            switch (choiceMainMenu){
                case 1:
                    dataBase.printProduct();
                    break;
                case 2:
                    filterMenu();
                    int choiceFilterMenu = scanner.nextInt();
                    if (choiceFilterMenu == 1){
                        filterMenuForType();
                        int choiceFilterForType = scanner.nextInt();
                        printMenuWithFilterType(choiceFilterForType);
                        break;
                    } else if (choiceFilterMenu == 3){
                        System.out.println("Введите название производителя, продукты которого хотели бы увидеть: ");
                        String produce = scanner.next();
                        filterMenuForProduce(produce);
                        break;
                    } else {
                        printFilterMenu(choiceFilterMenu);
                        break;
                    }
                case 3:
                    basket.printBasket();
                    break;
                case 4:
                    //TODO сделать реализацию этого действия
                case 5:
                    flag = false;
                    break;
            }
        }
    }


    public static void mainMenu(){
        System.out.println("Выберите операцию и введите её номер: " + '\n' +
                "1.Показать все доступные товары" + '\n' +
                "2.Показать только нужные товары(насторить фильтрацию)" + '\n' +
                "3.Показать карзину" + '\n' +
                "4.Возврат заказа, повтороение заказа" + '\n' +
                "5.Закрыть магазин");
    }

    public static void filterMenu(){
        System.out.println("Выберите по какому фильтру вы хотите отсортировать товар и введите номер фильтра:" + '\n' +
                "1.По типу продукта" + '\n' +
                "2.По цене" + '\n' +
                "3.По производителю" + '\n' +
                "4.По названию" + '\n' +
                "5.Выйти в основное меню");
    }

    public static void printFilterMenu(int choice){
        switch (choice){
            case 2:
                dataBase.setFilter(new FilterForPrice());
                dataBase.printFilterMenu();
                break;
            case 4:
                dataBase.setFilter(new FilterForTitle());
                dataBase.printFilterMenu();
                break;
            case 5:
                break;
            default:
                System.out.println("Пункта с таким номером в меню нет, поробуйте заново");
                break;
        }
    }

    public static void filterMenuForProduce(String produceName){
        if (dataBase.getProducersSet().contains(produceName)){
            dataBase.getFilterProduce().filtering(dataBase.getProducts(), produceName);
        } else System.out.println("Продуктов данного производителя в нашем магазине нет");
    }


    public static void filterMenuForType(){
        System.out.println("Выберите какие товары хотите увидеть и введите номер фильтра:" + '\n' +
                "1.Молочные продукты" + '\n' +
                "2.Выпечка" + '\n' +
                "3.Рыба" + '\n' +
                "4.Мясо" + '\n' +
                "5.Овощи");
    }

    public static void printMenuWithFilterType(int choice){
        switch (choice){
            case 1:
                dataBase.getFilterType().filtering(dataBase.getProducts(), TypeProduct.DAIRY_PRODUCT);
                break;
            case 2:
                dataBase.getFilterType().filtering(dataBase.getProducts(), TypeProduct.BAKED_GOODS);
                break;
            case 3:
                dataBase.getFilterType().filtering(dataBase.getProducts(), TypeProduct.FISH);
                break;
            case 4:
                dataBase.getFilterType().filtering(dataBase.getProducts(), TypeProduct.MEET);
                break;
            case 5:
                dataBase.getFilterType().filtering(dataBase.getProducts(), TypeProduct.VEGETABLES);
                break;
            default:
                System.out.println("Такого номера в меню нет, попробуйте заново");
                break;
        }
    }
}
