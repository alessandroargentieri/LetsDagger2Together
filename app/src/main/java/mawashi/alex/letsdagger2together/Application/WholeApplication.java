package mawashi.alex.letsdagger2together.Application;

import android.app.Application;

import mawashi.alex.letsdagger2together.DaggerClasses.ABComponent;
import mawashi.alex.letsdagger2together.DaggerClasses.ABModule;
import mawashi.alex.letsdagger2together.DaggerClasses.DaggerABComponent;

/**
 * Created by alessandro.argentier on 21/10/2016.
 */

public class WholeApplication extends Application {
   static ABComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = new DaggerABComponent.builder().aBModule(new ABModule()).build();

    }

    public static ABComponent getComponent(){
        return component;
    }



}
