package kg.kloop.android.julysandbox;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MyMessageAdapter extends RecyclerView.Adapter<MyMessageAdapter.MyMessageViewHolder> {

    private ArrayList<MyMessage> myMessageArrayList;

    public MyMessageAdapter(ArrayList<MyMessage> myMessageArrayList) {
        this.myMessageArrayList = myMessageArrayList;
    }


    @NonNull
    @Override
    public MyMessageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyMessageViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_message, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyMessageViewHolder holder, int position) {
        holder.authorTextView.setText(myMessageArrayList.get(position).getAuthor());
        holder.messageTextView.setText(myMessageArrayList.get(position).getText());
        holder.timeTextView.setText(String.valueOf(myMessageArrayList.get(position).getTime()));
    }

    @Override
    public int getItemCount() {
        return myMessageArrayList.size();
    }

    public class MyMessageViewHolder extends RecyclerView.ViewHolder {
        TextView messageTextView;
        TextView authorTextView;
        TextView timeTextView;
        public MyMessageViewHolder(View itemView) {
            super(itemView);
            messageTextView = itemView.findViewById(R.id.text_tv);
            authorTextView = itemView.findViewById(R.id.author_tv);
            timeTextView = itemView.findViewById(R.id.time_tv);
        }
    }
}
