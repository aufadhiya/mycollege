package xyz.aufa.mycollegeassistant1.ActivityClass;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import xyz.aufa.mycollegeassistant1.R;

public class menuCatatan extends AppCompatActivity {
    ListView listCatatan;
    Button btnTambah;
    AlertDialog alertDialogC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_catatan);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialogC.show();
            }
        });

        listCatatan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                alertDialogC.show();
            }
        });
        initDialog();
    }

    private void initDialog() {
        View v = getLayoutInflater().inflate(R.layout.dialogcatatan, null);
        alertDialogC = new AlertDialog.Builder(this).create();
        alertDialogC.setView(v);
    }
}
