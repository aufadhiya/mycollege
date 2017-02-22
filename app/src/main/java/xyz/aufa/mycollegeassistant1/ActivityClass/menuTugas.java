package xyz.aufa.mycollegeassistant1.ActivityClass;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

import xyz.aufa.mycollegeassistant1.R;

public class menuTugas extends AppCompatActivity {
    AlertDialog alertDialogT;
    ListView listTugas;
    Button btnTambahT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_tugas);
        listTugas = (ListView) findViewById(R.id.listTugas);
        btnTambahT = (Button) findViewById(R.id.btnTambahT);
        btnTambahT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialogT.show();
            }
        });

        listTugas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                alertDialogT.show();
            }
        });
        alertInit();
    }

    private void alertInit() {
        View v = getLayoutInflater().inflate(R.layout.dialogtugas, null);
        alertDialogT = new AlertDialog.Builder(this).create();
        alertDialogT.setView(v);
    }

}
