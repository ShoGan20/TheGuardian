package my.iot.womensafety;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

public class Tips extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        getSupportActionBar().setTitle("Tips");
    }

}
