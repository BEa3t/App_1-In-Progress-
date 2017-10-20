package ymengis2.gmail.com.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collection;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private Game g;
    private ArrayList<Game> gameArrayList;
    private ArrayAdapter<Game> gameArrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        g = new Game("tutle","pub",2012,0);
        gameArrayList = new ArrayList<Game>();
        for (int i = 1; i <= 10;i++){
            gameArrayList.add(g);
            g = new Game("title","pub",i,i);
        }
        //gameArrayAdapter = new ArrayAdapter<Game>(this, 0,gameArrayList);
        listView =(ListView) findViewById(R.id.listView);
        listView.setAdapter(gameArrayAdapter);
    }
}
