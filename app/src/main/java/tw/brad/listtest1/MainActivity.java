package tw.brad.listtest1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.HashMap;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private ListView list;
    private LinkedList<HashMap<String,String>> data;
    private String[] from = {"title","content"};
    private int[] to = {R.id.item_title, R.id.item_content};
    private SimpleAdapter adapter;
    private EditText inputTitle ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputTitle = (EditText)findViewById(R.id.inputTitle);

        list = (ListView)findViewById(R.id.list);
        initListView();


    }

    private void initListView(){
        data = new LinkedList<>();

        adapter = new SimpleAdapter(
                        this,data,
                        R.layout.layout_item,
                        from,to);
        list.setAdapter(adapter);
    }

    public void addItem(View v){
        String input = inputTitle.getText().toString();
        HashMap<String,String> dd =
                new HashMap<>();
        dd.put(from[0],input);
        dd.put(from[1], "data...");
        data.add(dd);
        adapter.notifyDataSetChanged();
    }
}
