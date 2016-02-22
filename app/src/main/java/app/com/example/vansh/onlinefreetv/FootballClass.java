package app.com.example.vansh.onlinefreetv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by vansh on 22-Feb-16.
 */
public class FootballClass extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.football_main);

        int posn;

        switch(getIntent().getStringExtra("sport")){
            case "wwe":
                posn = 0;
                break;
            case "fubu":
                posn = 0;
                break;
            default:
                posn = 0;
                break;
        }

        ArrayList<String> listitem=new ArrayList<>();
        listitem.add("Football-Link 1");
        listitem.add("Football-Link 2");
        listitem.add("Football-Link 3");
        listitem.add("Football-Link 4");
        listitem.add("Football-Link 5");



        ListView list=(ListView)findViewById(R.id.hi1);
        ItemAdapter itemAdapter=new ItemAdapter(this,R.id.list,listitem,posn);
        list.setAdapter(itemAdapter);
        Intent it=getIntent();


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(FootballClass.this, "Links are currently under maintenance",
                        Toast.LENGTH_LONG).show();

                Intent it1=new Intent(FootballClass.this,WebviewFootball.class);
                startActivity(it1);


            }
        });
        //int position = it.getExtras().getInt("name");
        //text.setText(""+position);


    }
}

