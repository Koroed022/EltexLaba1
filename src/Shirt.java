import java.util.UUID;

public class Shirt extends AbstractClother {
    private String colors[] = {"red","black","white"};
    private String how_mach[] = {"100","200","300"};
    private String firms[] = {"Abibas","Niek","Poma","ViewSpart"};
    private int cash;
    private int color;
    private int firm;

    Shirt(){
        super();
    }
    Shirt(UUID id){
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
        System.out.println("Цвет(0 - 2): ");
        int in = Solution.sc.nextInt();
        color = in;
        System.out.println("Цена(0 - 2): ");
        in = Solution.sc.nextInt();
        cash = in;
        System.out.println("Фирма(0 - 3): ");
        in = Solution.sc.nextInt();
        firm = in;
    }

    @Override
    public void delete() {

    }
}
