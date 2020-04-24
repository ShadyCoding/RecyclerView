package Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shady.recyclerview.DetailsActivity;
import com.shady.recyclerview.R;

import java.util.List;

import Model.ListItem;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    private Context mContext;
    private List<ListItem> mListItems;

    public MyAdapter(Context context, List listItems){
        this.mContext= context;
        this.mListItems = listItems;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ListItem listItem = mListItems.get(position);
        holder.name.setText(listItem.getName());
        holder.description.setText(listItem.getDescription());
        holder.rating.setText(listItem.getRating());

    }

    @Override
    public int getItemCount() {
        return mListItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView name;
        public TextView description;
        public TextView rating;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);
            name = itemView.findViewById(R.id.title);
            description = itemView.findViewById(R.id.description);
            rating = itemView.findViewById(R.id.rating);
        }

        @Override
        public void onClick(View v) {
            int positoin = getAdapterPosition();
            ListItem listItem = mListItems.get(positoin);
            Intent intent = new Intent(mContext, DetailsActivity.class);
            intent.putExtra("name", listItem.getName());
            intent.putExtra("desc", listItem.getDescription());
            intent.putExtra("rating", listItem.getRating());
            mContext.startActivity(intent);

//            Toast.makeText(mContext, listItem.getName(), Toast.LENGTH_SHORT).show();
        }
    }
}
