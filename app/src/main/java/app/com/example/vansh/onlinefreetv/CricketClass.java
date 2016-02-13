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

/**
 * Created by vansh on 10-Feb-16.
 */
public class CricketClass extends Activity {


    static String listitem[]={"Cricket-Link 1","Cricket-Link 2","Cricket-Link 3","Cricket-Link 4","Cricket-Link 5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cricket_main);
        ListView list=(ListView)findViewById(R.id.hi);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.list_cricket,listitem);
        list.setAdapter(adapter);
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
