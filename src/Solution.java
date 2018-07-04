import java.util.Scanner;
import java.util.UUID;

public class Solution{
    int count_input_object;
    public static Scanner sc;
    public static void main(String[] args) {

        int count_input_object = Integer.parseInt(args[0]);
        AbstractClother clother_mass[] = new AbstractClother[count_input_object];
        args[1] = args[1].toLowerCase();

        for (int i = 0; i < count_input_object; i++){
            if(args[1].equals("cap")) {
                clother_mass[i] = new Cap();
            }
            else {
                if(args[1].equals("shirt")) {
                    clother_mass[i] = new Shirt();
                }
                else {
                    System.out.println("ERROR not cap or shirt");
                    System.exit(1);
                }
            }
            clother_mass[i].create();
            clother_mass[i].read();
            System.out.println("Изменить ли что то в одежде? (y/n) ");
            sc = new Scanner(System.in);
            String in = sc.nextLine();
            if(in.equals("y")){
                clother_mass[i].update();
                clother_mass[i].read();
            }
            System.out.println("Удалить? (y/n) ");
            sc = new Scanner(System.in);
            in = sc.nextLine();
            if(in.equals("y")){
                clother_mass[i] = null;
            }
        }

    }



}
