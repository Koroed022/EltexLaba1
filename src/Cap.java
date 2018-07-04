import java.util.Scanner;
import java.util.UUID;

public class Cap extends AbstractClother {

    private String colors[] = {"red","black"};
    private String how_mach[] = {"120","200"};
    private String firms[] = {"Abibas","Niek","Poma"};
    private int cash;
    private int color;
    private int firm;

    Cap(){
        super();
    }
    Cap(UUID id){
        super(id);
    }

    @Override
    public void create(){
        super.create();
        color = (int) (Math.random() * colors.length);
        cash = (int) (Math.random() * how_mach.length);
        firm = (int) (Math.random() * firms.length);
    }

    @Override
    public void read() {
        System.out.println("Цвет: " + colors[color]);
        System.out.println("Цена: " + how_mach[cash]);
        System.out.println("Фирма: " + firms[firm]);
        System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
    }

    @Override
    public void update() {
        System.out.println("Цвет(0 - 1): ");
        int in = Solution.sc.nextInt();
        color = in;
        System.out.println("Цена(0 - 1): ");
        in = Solution.sc.nextInt();
        cash = in;
        System.out.println("Фирма(0 - 2): ");
        in = Solution.sc.nextInt();
        firm = in;
    }

    @Override
    public void delete() {

    }
}
