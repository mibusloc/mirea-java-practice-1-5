package ru.mirea.lab4.task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите логин: ");
        String username = in.nextLine();

        System.out.print("Введите пароль: ");
        String password = in.nextLine();

        Map<String, String> users = new HashMap<>();
        users.put("test", "1234");
        users.put("admin", "password");

        if (!authenticate(users, username, password)) {
            System.out.println("Неверный логин или пароль.");
            return;
        }

        System.out.print("Вы успешно вошли в аккаунт. ");

        ArrayList<Catalog> catalogs = new ArrayList<>();
        catalogs.add(new Catalog("Одежда"));
        catalogs.add(new Catalog("Продовольствие"));
        catalogs.add(new Catalog("Бытовая техника"));

        catalogs.get(0).addProduct(new Product("Футболка", 1200));
        catalogs.get(0).addProduct(new Product("Джинсы", 2800));
        catalogs.get(1).addProduct(new Product("Хлеб", 40));
        catalogs.get(1).addProduct(new Product("Молоко", 90));
        catalogs.get(2).addProduct(new Product("Смартфон", 60000));
        catalogs.get(2).addProduct(new Product("Ноутбук", 120000));

        Cart cart = new Cart();

        while (true) {
            System.out.println("Что вы хотите сделать?");
            System.out.println("1. Показать список каталогов товаров");
            System.out.println("2. Показать список товаров определенного каталога");
            System.out.println("3. Добавить товар в корзину");
            System.out.println("4. Посмотреть корзину");
            System.out.println("5. Оплатить товары в корзине");
            System.out.println("0. Выйти");

            System.out.print("Введите номер: ");
            int choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.println("Список каталогов товаров:");
                    for (int i = 0; i < catalogs.size(); i++) {
                        System.out.printf("%d. %s%n", i + 1, catalogs.get(i).getName());
                    }
                    System.out.printf("%n");
                }
                case 2 -> {
                    System.out.print("Выберите номер каталога для показа товаров: ");
                    int catalogIndex = in.nextInt();
                    in.nextLine();
                    if (catalogIndex >= 1 && catalogIndex <= catalogs.size()) {
                        Catalog currentCatalog = catalogs.get(catalogIndex - 1);
                        ArrayList<Product> products = currentCatalog.getProducts();

                        System.out.printf("Товары каталога %s:%n", currentCatalog.getName());
                        for (int i = 0; i < products.size(); i++) {
                            System.out.printf("%d. %s - %.2f₽%n", i + 1, products.get(i).getName(), products.get(i).getPrice());
                        }
                        System.out.printf("%n");
                    } else {
                        System.out.println("Неверный индекс каталога.");
                    }
                }
                case 3 -> {
                    System.out.print("Введите номер каталога: ");
                    int catalogIndex = in.nextInt();
                    in.nextLine();
                    if (catalogIndex >= 1 && catalogIndex <= catalogs.size()) {
                        Catalog currentCatalog = catalogs.get(catalogIndex - 1);

                        System.out.print("Введите номер товара: ");
                        int productIndex = in.nextInt();
                        in.nextLine();

                        if (productIndex >= 1 && productIndex <= currentCatalog.getProducts().size()) {
                            Product currentProduct = currentCatalog.getProducts().get(productIndex - 1);
                            cart.addToCart(currentProduct);
                            System.out.printf("Товар \"%s\" за %.2f₽ добавлен в корзину.%n", currentProduct.getName(), currentProduct.getPrice());
                        } else {
                            System.out.println("Неверный номер товара.");
                        }
                    } else {
                        System.out.println("Неверный номер каталога.");
                    }
                    System.out.printf("%n");
                }
                case 4 -> {
                    cart.displayCart();
                    System.out.printf("%n");
                }
                case 5 -> {
                    double totalPrice = cart.getTotalPrice();
                    System.out.printf("Итого к оплате: %.2f₽%n", totalPrice);
                    System.out.print("Подтвердите оплату (да/нет): ");
                    String check = in.nextLine();
                    if (check.equalsIgnoreCase("да")) {
                        System.out.println("Заказ оплачен. Спасибо за покупку!");
                        cart.clearCart();
                    } else {
                        System.out.println("Оплата отменена.");
                    }
                }
                case 0 -> {
                    System.out.println("Выход...");
                    return;
                }
                default -> System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }

    private static boolean authenticate(Map<String, String> users, String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }
}