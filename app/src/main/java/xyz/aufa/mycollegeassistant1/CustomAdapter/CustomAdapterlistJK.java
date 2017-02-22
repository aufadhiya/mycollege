package xyz.aufa.mycollegeassistant1.CustomAdapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import xyz.aufa.mycollegeassistant1.ClassObject.ClassObjectJK;
import xyz.aufa.mycollegeassistant1.R;

import static android.R.attr.data;

/**
 * Created by Sweetenest on 04/02/2017.
 */

    public class CustomAdapterlistJK extends BaseAdapter{
        private ArrayList<ClassObjectJK> datajk;
        Context mContext;

    public CustomAdapterlistJK(ArrayList<ClassObjectJK> datajk, Context context){

    }
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
        View dview = view;
        viewHolder holder = null;
        if(view == null){
            holder = new viewHolder();
            LayoutInflater inflater = (LayoutInflater) viewGroup.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            dview = inflater.inflate(R.layout.listjadwalkuliah, null);
            holder.hari = (TextView)view.findViewById(R.id.harijk);
            holder.makul =  (TextView)view.findViewById(R.id.makuljk);
            holder.ruangan = (TextView)view.findViewById(R.id.ruangjk);
            holder.dosen = (TextView)view.findViewById(R.id.dosenjk);
            holder.waktu = (TextView)view.findViewById(R.id.waktujk);
            view.setTag(holder);
        }else{
            holder =(viewHolder) view.getTag();


        }


    }

    public class viewHolder{
        TextView hari,makul,dosen,waktu,ruangan;
    }

    public void onClick(View v){


    }
}
