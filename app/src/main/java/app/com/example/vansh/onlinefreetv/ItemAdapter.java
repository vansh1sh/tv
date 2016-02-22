package app.com.example.vansh.onlinefreetv;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ItemAdapter extends ArrayAdapter<String> {

    // declaring our ArrayList of items
    private ArrayList<String> objects;
    int start_position;

    static class ViewHolder {
        TextView list;
    }

    /* here we must override the constructor for ArrayAdapter
    * the only variable we care about now is ArrayList<Item> objects,
    * because it is the list of objects we want to display.
    */
    public ItemAdapter(Context context, int textViewResourceId, ArrayList<String> objects/*, int posn*/) {
        super(context, textViewResourceId, objects);
        this.start_position = start_position;
        this.objects = objects;
    }

    @Override
    public int getCount() {
        return 5;
    }

    /*
             * we are overriding the getView method here - this is what defines how each
             * list item will look.
             */
    public View getView(int position, View convertView, ViewGroup parent) {

        // assign the view we are converting to a local variable
        View v = convertView;

        // first check to see if the view is null. if so, we have to inflate it.

            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.list_item, null);

        String i = objects.get(start_position+position);

            ViewHolder holder = null;

                holder = new ViewHolder();
                holder.list = (TextView) v.findViewById(R.id.list);
                holder.list.setText(""+i);

            return v;
        }
}
