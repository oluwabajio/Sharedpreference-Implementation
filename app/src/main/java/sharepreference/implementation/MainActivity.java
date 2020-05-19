package sharepreference.implementation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import sharepreference.implementation.utils.SessionManager;

public class MainActivity extends AppCompatActivity {

    Button btnSave;
    EditText edName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        
        initViews();
        intListeners();
        
        getSavedPreferenceData();
    }

    private void getSavedPreferenceData() {
        edName.setText(new SessionManager().getName());
    }


    private void intListeners() {
      btnSave.setOnClickListener(v-> {
          new SessionManager().setName(edName.getText().toString());
          Toast.makeText(this, "Data Saved", Toast.LENGTH_LONG).show();
      });
    }

    private void initViews() {
        btnSave = findViewById(R.id.btn_save);
        edName = findViewById(R.id.ed_name);

    }
}
