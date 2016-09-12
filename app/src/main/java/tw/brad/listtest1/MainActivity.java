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
        String[] from = {};
        int[] to = {};
        SimpleAdapter adapter =
                new SimpleAdapter(
                        this,data,
                        R.layout.layout_item,
                        from,to);
        list.setAdapter(adapter);
    }
}
