package enriquez.damian.app_003;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Evento on create",Toast.LENGTH_LONG);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Evento onStart",Toast.LENGTH_LONG);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Evento onStop",Toast.LENGTH_LONG);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Evento onRestart",Toast.LENGTH_LONG);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Evento onDestroy",Toast.LENGTH_LONG);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Evento onPause",Toast.LENGTH_LONG);
    }



}