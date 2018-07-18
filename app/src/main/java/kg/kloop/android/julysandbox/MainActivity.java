package kg.kloop.android.julysandbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button00;
    Button button10;
    Button button20;
    Button button01;
    Button button11;
    Button button21;
    Button button02;
    Button button12;
    Button button22;
    TextView infoTextView;
    XoController xoController;
    XoModel xoModel;

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

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                move(1, 0, (Button) view);
            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                move(2,0, (Button) view);
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("key", "asdf");
                intent.putExtra("key2", "asd;hlk");
                startActivity(intent);
            }
        });

    }

    private void move(int x, int y, Button button) {
        xoController.move(x,y);
        button.setText(convertPlayerToString(xoModel.getFieldArray()[x][y]));
        infoTextView.setText("It's now Player " + convertPlayerToString(xoModel.getPlayerTurn()) + " turn");
    }

    private String convertPlayerToString(int i) {
        if (i == Constants.PLAYER_X) {
            return "x";
        } else return "o";
    }
}
