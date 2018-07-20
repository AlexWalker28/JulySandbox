package kg.kloop.android.julysandbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<MyMessage> arrayList;
    RecyclerView messagesRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messagesRecyclerView = findViewById(R.id.messages_rv);
        arrayList = new ArrayList();
        arrayList.add(new MyMessage("some text", "me", 1241L));
        arrayList.add(new MyMessage("another text", "not me", 2532L));
        arrayList.add(new MyMessage("more text", "author", 234235L));

        MyMessageAdapter adapter = new MyMessageAdapter(arrayList);
        messagesRecyclerView.setAdapter(adapter);
        messagesRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));



    }
}
