package mawashi.alex.letsdagger2together.DaggerClasses;

import dagger.Module;
import dagger.Provides;
import mawashi.alex.letsdagger2together.Model.AClass;
import mawashi.alex.letsdagger2together.Model.BClass;

/**
 * Created by alessandro.argentier on 21/10/2016.
 */
@Module
public class ABModule {

    @Provides
    public BClass provideBClass(){
        return new BClass("xxx");
    }

    @Provides
    public AClass provideAClass(BClass bClass){
        return new AClass(bClass);
    }

}
