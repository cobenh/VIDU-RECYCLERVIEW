package comvidu.example.administrator.vidurecycle6.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import comvidu.example.administrator.vidurecycle6.R;

/**
 * Created by Administrator on 16/05/2016.
 */
public class ProductListAdapter extends android.support.v7.widget.RecyclerView.Adapter {

    List<String> mDataset;
    public ProductListAdapter(List<String> mDataset){
        (this).mDataset = mDataset;
        /*List<String> list = new ArrayList<>();
        mDataset.add("Annie");
        mDataset.add("Pubbp");
        mDataset.add("Yummi");*/
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textView;
        public ViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.text_view_name);
        }
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cell_product_list,parent,false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder)holder).textView.setText(mDataset.get(position));

    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
