package xyz.aufa.mycollegeassistant1.ActivityClass;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import xyz.aufa.mycollegeassistant1.R;
import xyz.aufa.mycollegeassistant1.helper.SessionManager;

public class frmDaftar extends AppCompatActivity {
    Button btnDaftar;
    Button btnKembali;
    EditText email, pass, nama;
    AlertDialog alertDialog;
    private String EmailView;
    private ProgressDialog pDialog;
    private SessionManager session;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_daftar);
        btnDaftar = (Button) findViewById(R.id.btnDaftar1);
        btnKembali = (Button) findViewById(R.id.btnKembali);
        email = (EditText) findViewById(R.id.txtEmailDaftar);
        pass = (EditText) findViewById(R.id.txtPasswordDaftar);
        nama = (EditText) findViewById(R.id.txtNamaDaftar);


        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnDaftar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        alertDialog.show();
                    }
                });
            }
        });
        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(frmDaftar.this, frmLogin.class));
            }
        });


        initCustomAlertDialog(EmailView);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
    }


    private void initCustomAlertDialog(String EmailView) {
        View v = getLayoutInflater().inflate(R.layout.dialogverivikasi, null);
        alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setView(v);
        alertDialog.setTitle("Verifikasi Email");
    }

}