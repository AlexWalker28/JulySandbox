package kg.kloop.android.julysandbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        xoModel = new XoModel();
        xoController = new XoController(xoModel);
        button00 = findViewById(R.id.button00);
        button10 = findViewById(R.id.button10);
        button20 = findViewById(R.id.button20);
        button01 = findViewById(R.id.button01);
        button11 = findViewById(R.id.button11);
        button21 = findViewById(R.id.button21);
        button02 = findViewById(R.id.button02);
        button12 = findViewById(R.id.button12);
        button22 = findViewById(R.id.button22);
        infoTextView = findViewById(R.id.info_text_view);

        infoTextView.setText("It's now Player " + convertPlayerToString(xoModel.getPlayerTurn()) + " turn");
        button00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                move(0, 0, (Button) view);
            }
        });


    }
}
