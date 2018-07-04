import java.util.UUID;

public abstract class AbstractClother implements IcrudAction{

    static private int count_objects = 0;
    UUID id_object ;
    private int cash;
    private String name;
    private String firm;

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

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    @Override
    public void create(){
        count_objects++;
    }
}
