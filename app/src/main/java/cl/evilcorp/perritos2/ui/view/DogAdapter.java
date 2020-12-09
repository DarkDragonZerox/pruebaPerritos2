package cl.evilcorp.perritos2.ui.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cl.evilcorp.perritos2.R;

public class DogAdapter extends RecyclerView.Adapter<DogAdapter.ViewHolder> {
   private final List<String> mValues;

    public DogAdapter(List<String> mValues) {
        this.mValues = mValues;
    }

    @NonNull
    @Override
    public DogAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_list_dog,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DogAdapter.ViewHolder holder, int position) {
        holder.midView.setText(mValues.get(position));
        holder.mName.setText(mValues.get(position));

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public final View mView;
        public final TextView midView;
        public final TextView mName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mView=itemView;
            midView=itemView.findViewById(R.id.item_number);
            mName=itemView.findViewById(R.id.name_dog);
        }

        @Override
        public void onClick(View view) {

        }
    }
}
