package enterprise.sample.com.ui21;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout Panel1,Panel2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Panel1 = (LinearLayout)findViewById(R.id.UI1);
        Panel2 = (LinearLayout)findViewById(R.id.UI2);
    }
    public void x(View v) {
        Panel2.setVisibility(View.GONE);
        Panel1.setVisibility(View.VISIBLE);
    }

    public void y(View v) {
        Panel1.setVisibility(View.GONE);
        Panel2.setVisibility(View.VISIBLE);
    }
}

