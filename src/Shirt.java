import java.util.UUID;

public class Shirt extends AbstractClother {
    private String colors[] = {"red","black"};
    private int color;

    Shirt(){
        super();
    }
    Shirt(UUID id){
        super(id);
    }
    @Override
    public void create(){
        super.create();
    }

    @Override
    public void read() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
