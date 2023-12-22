package ru.mirea.lab2.shop4;

import java.util.Scanner;

public class ShopTest {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner in = new Scanner(System.in);
        System.out.println("Type 'help' for help :)");
        while (in.hasNext()) {
            switch (in.next()) {
                case "help":
                    System.out.println("'add [name] [price]' - add new pc\n" +
                            "'find name [name]'/'find price [price]' - find pc's ID by name/price\n" +
                            "'remove [id]' - remove pc by ID\n" +
                            "'display [id]' - display pc's name and price by ID\n" +
                            "'list' - show all pcs");
                    break;
                case "add":
                    if (in.hasNext()) {
                        String name = in.next();
                        if (in.hasNextFloat()) {
                            System.out.println("ID of the added PC: " + shop.add(name, in.nextFloat()));
                        } else {
                            System.out.println("ERR: Wrong value.");
                        }
                    } else {
                        System.out.println("ERR: Something went wrong. Quitting...");
                        return;
                    }
                    break;
                case "find":
                    if (!in.hasNext()) {
                        System.out.println("ERR: Something went wrong. Quitting...");
                        return;
                    }
                    switch (in.next()) {
                        case "name" -> {
                            if (!in.hasNext()) {
                                System.out.println("ERR: Something went wrong. Quitting...");
                                return;
                            }
                            int id = shop.getIdByName(in.next());
                            if (id == -1) {
                                System.out.println("No PC under such name.");
                            } else {
                                System.out.println("ID: " + id);
                            }
                        }
                        case "price" -> {
                            if (in.hasNextFloat()) {
                                int id = shop.getIdByPrice(in.nextFloat());
                                if (id == -1) {
                                    System.out.println("No PC under such price.");
                                } else {
                                    System.out.println("ID: " + id);
                                }
                            } else {
                                System.out.println("ERR: Wrong value.");
                            }
                        }
                        default -> System.out.println("ERR: Wrong field.");
                    }
                    break;
                case "remove":
                    if (in.hasNextInt()) {
                        shop.removeById(in.nextInt());
                        System.out.println("Removed.");
                    } else {
                        System.out.println("ERR: Wrong value.");
                    }
                    break;
                case "display":
                    if (in.hasNextInt()) {
                        PC pc = shop.get(in.nextInt());
                        if (pc == null) {
                            System.out.println("No PC under this ID :(");
                        } else {
                            System.out.println(pc);
                        }
                    } else {
                        System.out.println("ERR: Wrong value.");
                    }
                    break;
                case "list":
                    int i = 0, j = 0;
                    while (j < shop.getSize()) {
                        if (shop.get(i) != null) {
                            System.out.println(shop.get(i));
                            i++;
                            j++;
                        } else {
                            i++;
                        }
                    }
                    break;
                case "end":
                    System.out.println("Quitting...");
                    return;
                default:
                    System.out.println("You did something wrong and it's entirely your fault! Try again.");
                    break;
            }
        }
    }
}
