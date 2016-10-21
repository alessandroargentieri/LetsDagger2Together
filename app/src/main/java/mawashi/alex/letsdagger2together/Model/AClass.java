package mawashi.alex.letsdagger2together.Model;

/**
 * Created by alessandro.argentier on 21/10/2016.
 */

public class AClass {
    private BClass b;
    public AClass(BClass b){
        this.b = b;
    }
    public String getYfactor(){
        return "Y-" + b.getXfactor() + "-Y";
    }
}
