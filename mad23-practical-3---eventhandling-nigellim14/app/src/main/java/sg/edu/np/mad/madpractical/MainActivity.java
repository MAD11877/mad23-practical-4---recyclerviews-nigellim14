package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent recieve = getIntent();
        int ranint = recieve.getIntExtra("RanInt", 0);
        TextView headText = findViewById(R.id.headtext);
        headText.setText("MAD " + ranint);
        User newUser = new User(false);

        Button followbtn = findViewById(R.id.follow);
        followbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text = followbtn.getText().toString();
                    if (text.equals("FOLLOW")) {
                    followbtn.setText("UNFOLLOW");
                    Toast.makeText(getApplicationContext(), "FOLLOWED", Toast.LENGTH_SHORT).show();
                } else if (text.equals("UNFOLLOW")) {
                    followbtn.setText("FOLLOW");
                    Toast.makeText(getApplicationContext(), "UNFOLLOWED", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("debug", "start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("debug", "stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("debug", "destroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("debug", "paused");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("debug", "resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("debug", "restart");
    }
}