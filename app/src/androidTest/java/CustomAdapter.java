
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.customspinner.R;


public class CustomAdapter extends BaseAdapter {
    String countryList[];
    int symbols[];
    LayoutInflater inflter;

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.custom_lv_layout, null);
        TextView country = (TextView) view.findViewById(R.id.tV);
        ImageView symbol = (ImageView) view.findViewById(R.id.iV);
        country.setText(countryList[i]);
        symbol.setImageResource(symbols[i]);
        return view;
    }
}