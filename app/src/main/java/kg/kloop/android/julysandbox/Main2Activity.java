package kg.kloop.android.julysandbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView = findViewById(R.id.main2_text_view);

        Intent intent = getIntent();
        String message = intent.getStringExtra("key");
        String message2 = intent.getStringExtra("key2");

        textView.setText(message + "\n" + message2);

    }
}
