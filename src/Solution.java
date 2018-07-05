import java.util.Scanner;
import java.util.UUID;

public class Solution{
    int count_input_object;
    public static Scanner sc;
    public static void main(String[] args) {

        int count_input_object = Integer.parseInt(args[0]);// берем количество объектов
        AbstractClother clother_mass[] = new AbstractClother[count_input_object]; //создаем массив объектов
        args[1] = args[1].toLowerCase(); // переводим входные данные в нижний регистр для упрощенного чтения?

        for (int i = 0; i < count_input_object; i++) {//проходим по циклу и создаем объекты
            if (args[1].equals("cap")) {
                clother_mass[i] = new Cap();//инициализируем объект как кепку?
            } else {
                if (args[1].equals("shirt")) {
                    clother_mass[i] = new Shirt();//инициализируем объект как майку?
                } else {
                    System.out.println("ERROR not cap or shirt");// если не майка и не кепка
                    System.exit(1);
                }
            }
            clother_mass[i].create(); // создаем объект
            System.out.println("Номер " + args[1] + " : " + i);
            clother_mass[i].read();//выводим информацию об объекте
            System.out.println("Изменить ли что то в одежде? (y/n) ");
            sc = new Scanner(System.in);
            String in = sc.nextLine();
            if (in.equals("y")) {
                clother_mass[i].update();//производим изменения в объекте
                clother_mass[i].read();//выводим данные об объекте
            }
            System.out.println("Удалить? (y/n) ");
            sc = new Scanner(System.in);
            in = sc.nextLine();
            if (in.equals("y")) {
                clother_mass[i] = null; //обнуляем объект массива, если его попросили удалить
            }
            if(i == count_input_object - 1) {
                while (true) {
                    System.out.println("1 - Показать одежду");
                    System.out.println("2 - Удалить одежду");
                    System.out.println("3 - Изменить одежду");
                    int menu_input = sc.nextInt();
                    if (menu_input == 1) {
                        System.out.println("Введите номер одежды для показа: ");
                        sc = new Scanner(System.in);
                        int num_clother_for_read = sc.nextInt();
                        if (num_clother_for_read < Integer.parseInt(args[0]) && num_clother_for_read >= 0) {//проверка на номер объекта

                            if (clother_mass[num_clother_for_read] != null) {//проверка, не удалили ли мы объект
                                clother_mass[num_clother_for_read].read();

                            } else
                                System.out.println("Эта " + args[1] + " была удалена");
                        } else
                            System.out.println("У вас было всего " + count_input_object + " " + args[1]);
                    }
                    if(menu_input == 2){
                        System.out.println("Введите номер одежды для удаления: ");
                        sc = new Scanner(System.in);
                        int num_clother_for_delete = sc.nextInt();
                        clother_mass[num_clother_for_delete] = null;//обнуляем объект массива, если его попросили удалить
                    }
                    if(menu_input == 3){
                        System.out.println("Введите номер одежды для изменения: ");
                        sc = new Scanner(System.in);
                        int num_clother_for_update = sc.nextInt();
                        clother_mass[num_clother_for_update].update();//изменяем объект
                    }
                }
            }
        }

    }
}
