package app.com.example.vansh.onlinefreetv;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by vansh on 12-Dec-15.
 */
public class ImageAdapter extends BaseAdapter {
    Context c;
    public ImageAdapter(Context c)
    {
        this.c=c;
    }
    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public Object getItem(int position) {
        return 0;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, final View convertView, ViewGroup parent) {
        ImageView img;
        if (convertView == null) {
            img = new ImageView(c);
            img.setLayoutParams(new GridView.LayoutParams(275,275));
            img.setScaleType(ImageView.ScaleType.CENTER_CROP);
            img.setPadding(0, 0,0, 0);
        }
        else
        {
            img = (ImageView) convertView;
        }
        img.setImageResource(image[position]);
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(position)
                {
                    case 0:
                        Intent it = new Intent(convertView.getContext(), CricketClass.class);
                        convertView.getContext().startActivity(it);




                }
            }
        });
        return img;
    }
    private Integer image[]={R.drawable.images,
            R.drawable.images1,
            R.drawable.images2,
            R.drawable.images3,
       };
}
