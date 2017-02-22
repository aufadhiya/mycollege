package xyz.aufa.mycollegeassistant1.ActivityClass;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import xyz.aufa.mycollegeassistant1.ClassObject.ClassObjectJK;
import xyz.aufa.mycollegeassistant1.R;

public class menuJadwalKuliah extends AppCompatActivity {

    ListView listView;
    AlertDialog alertDialog;
    Button btnTambah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_jadwal_kuliah);
        btnTambah = (Button) findViewById(R.id.btnTambah);
        listView = (ListView) findViewById(R.id.listJadwalKuliah);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.show();
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                alertDialog.show();
            }
        });

        initCustomAlertDialog();
    }

    private void initCustomAlertDialog() {
        View v = getLayoutInflater().inflate(R.layout.dialogjadwalkuliah, null);
        alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setView(v);
    }
}
