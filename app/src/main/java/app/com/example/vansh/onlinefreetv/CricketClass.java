package app.com.example.vansh.onlinefreetv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by vansh on 10-Feb-16.
 */
public class CricketClass extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cricket_main);

        int posn;

        switch(getIntent().getStringExtra("sport")){
            case "wwe":
                posn = 0;
                break;
            case "fubu":
                posn = 5;
                break;
            default:
                posn = 0;
                break;
        }

        ArrayList<String> listitem=new ArrayList<>();
        listitem.add("Cricket-Link 1");
        listitem.add("Cricket-Link 2");
        listitem.add("Cricket-Link 3");
        listitem.add("Cricket-Link 4");
        listitem.add("Cricket-Link 5");
        listitem.add("Football-Link 1");
        listitem.add("Football-Link 2");
        listitem.add("Football-Link 3");
        listitem.add("Football-Link 4");
        listitem.add("Football-Link 5");

        ListView list=(ListView)findViewById(R.id.hi);
        ItemAdapter itemAdapter=new ItemAdapter(this,R.id.list,listitem,posn);
        list.setAdapter(itemAdapter);
        Intent it=getIntent();


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent it1=new Intent(CricketClass.this,WebviewCricket.class);
                startActivity(it1);


            }
        });
        //int position = it.getExtras().getInt("name");
        //text.setText(""+position);


    }
}
