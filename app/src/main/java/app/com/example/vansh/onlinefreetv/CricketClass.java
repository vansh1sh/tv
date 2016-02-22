package app.com.example.vansh.onlinefreetv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by vansh on 10-Feb-16.
 */
public class CricketClass extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cricket_main);

        /*int posn;

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
*/
        ArrayList<String> listitem=new ArrayList<>();
        listitem.add("Sports-Link 1");
        listitem.add("Sports-Link 2");
        listitem.add("Sports-Link 3");
        listitem.add("Sports-Link 4");
        listitem.add("Sports-Link 5");



        ListView list=(ListView)findViewById(R.id.hi);
        ItemAdapter itemAdapter=new ItemAdapter(this,R.id.list,listitem);
        list.setAdapter(itemAdapter);
        Intent it=getIntent();


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(CricketClass.this,"Links are currently under maintenance",
                        Toast.LENGTH_LONG).show();

                Intent it1=new Intent(CricketClass.this,WebviewCricket.class);
                startActivity(it1);


            }
        });
        //int position = it.getExtras().getInt("name");
        //text.setText(""+position);


    }
}
