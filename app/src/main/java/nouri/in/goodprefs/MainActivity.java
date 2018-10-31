package nouri.in.goodprefs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import nouri.in.goodprefslib.GoodPrefs;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textView;
    private Button button;
    private String text = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edt);
        textView = findViewById(R.id.txt);
        button = findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoodPrefs.getInstance().saveString(AppConstants.KEY_STRING, editText.getText().toString());

                text = GoodPrefs.getInstance().getString(AppConstants.KEY_STRING, AppConstants.KEY_STRING_DEFAULT);
                textView.setText(text);
            }
        });
    }
}
