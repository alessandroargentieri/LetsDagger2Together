package mawashi.alex.letsdagger2together;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

import mawashi.alex.letsdagger2together.Application.WholeApplication;
import mawashi.alex.letsdagger2together.DaggerClasses.ABModule;
import mawashi.alex.letsdagger2together.DaggerClasses.DaggerABComponent;
import mawashi.alex.letsdagger2together.Model.AClass;

public class MainActivity extends AppCompatActivity {

    @Inject AClass a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WholeApplication.getComponent().inject(this);

        Toast.makeText(this, a.getYfactor(),Toast.LENGTH_LONG).show();
    }
}
