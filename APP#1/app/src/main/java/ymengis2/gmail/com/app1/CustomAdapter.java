package ymengis2.gmail.com.app1;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


/**
 * Created by yenai on 10/17/17.
 */

public class CustomAdapter extends BaseAdapter {
    Context context;
    List<Game> items;

    CustomAdapter(Context context, List<Game> times){
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return items.indexOf(getItem(position));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        TextView tv;
        ImageView iv;
        if(v == null){

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(android.R.layout.activity_list_item, parent, false);
        }
        TextView tvText1 = (TextView) convertView.findViewById(R.id.text);
        tvText1.setText(Game.);
    return null;
    }
}
