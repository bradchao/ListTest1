package tw.brad.listtest1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.HashMap;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView)findViewById(R.id.list);
        initListView();


    }

    private void initListView(){
        LinkedList<HashMap<String,String>> data
                = new LinkedList<>();
        HashMap<String,String> data0 =
                new HashMap<>();
        data0.put("brad","Brad");
        data.add(data0);

        HashMap<String,String> data1 =
                new HashMap<>();
        data1.put("brad","Peter");
        data.add(data1);

        HashMap<String,String> data2 =
                new HashMap<>();
        data2.put("brad","Tony");
        data.add(data2);


        String[] from = {"brad"};
        int[] to = {R.id.item_title};
        SimpleAdapter adapter =
                new SimpleAdapter(
                        this,data,
                        R.layout.layout_item,
                        from,to);
        list.setAdapter(adapter);
    }
}
