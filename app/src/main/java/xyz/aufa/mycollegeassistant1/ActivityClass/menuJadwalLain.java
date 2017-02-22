package xyz.aufa.mycollegeassistant1.ActivityClass;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import xyz.aufa.mycollegeassistant1.R;

public class menuJadwalLain extends AppCompatActivity {
    ListView listJadwal;
    AlertDialog alertDialogJL;
    Button btnTambah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_jadwal_lain);
        listJadwal = (ListView) findViewById(R.id.listJadwalKuliah);
        btnTambah = (Button) findViewById(R.id.btnTambahJL);
        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialogJL.show();
            }
        });
        listJadwal.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                alertDialogJL.show();
            }
        });
        initDIalog();
    }

    private void initDIalog() {
        View v = getLayoutInflater().inflate(R.layout.dialogjadwallain, null);
        alertDialogJL = new AlertDialog.Builder(this).create();
        alertDialogJL.setView(v);
    }
}
