package mawashi.alex.letsdagger2together.DaggerClasses;

import dagger.Component;
import mawashi.alex.letsdagger2together.MainActivity;

/**
 * Created by alessandro.argentier on 21/10/2016.
 */

@Component (modules = {ABModule.class})
public interface ABComponent {
    public void inject(MainActivity mainActivity);
}
