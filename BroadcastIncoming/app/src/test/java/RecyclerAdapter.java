import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.broadcastincomingnumber.R;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder{
    private ArrayList<IncomingNumber> arrayList = new ArrayList<IncomingNumber>();

    public RecyclerAdapter (ArrayList<IncomingNumber> lista) {
        this.arrayList = lista;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new MyViewHolder(view);
    }
    @Override
    public int getItemCount() {
        return arrayList.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView id, number;

        public MyViewHolder(@NonNull View itemView){
            super(itemView);
            id = itemView.findViewbyid(R.id.txtId);
            number = itemView.findViewById(R.id.txtNumber);
        }
    }

}
