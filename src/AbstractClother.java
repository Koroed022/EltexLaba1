import java.util.UUID;

public abstract class AbstractClother implements IcrudAction{

    static private int count_objects = 0;
    UUID id_object ;
    private int cash;
    private String name;

    public static int getCount_objects() {
        return count_objects;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    private int firm;

    AbstractClother(){
        id_object = UUID.randomUUID();

    }
    AbstractClother(UUID id){
        id_object = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFirm() {
        return firm;
    }

    public void setFirm(int firm_num) {
        this.firm = firm_num;
    }

    @Override
    public void create(){
        count_objects++;
    }
}
