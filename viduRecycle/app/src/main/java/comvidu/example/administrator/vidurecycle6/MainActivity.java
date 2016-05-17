package comvidu.example.administrator.vidurecycle6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import comvidu.example.administrator.vidurecycle6.adapter.ProductListAdapter;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter recyclerViewAdapter;
    RecyclerView.LayoutManager recycleViewLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_product_list);
        //tao layoutmanager
        recycleViewLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recycleViewLayoutManager);
        List<String> list = new ArrayList<>();
        list.add("Annie");
        list.add("Puppy");
        list.add("Yummi");

        recyclerViewAdapter = new ProductListAdapter(list);
        recyclerView.setAdapter(recyclerViewAdapter);

    }
}
