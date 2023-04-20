package sg.edu.np.mad.week2T01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    final String TAG = "Main Activity";
User user = new User("Name","Description", 01, true);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button followButton = (Button) findViewById(R.id.userfollow);
        followButton.setText(user.followed ? "Unfollow" : "Follow");

        followButton.setOnClickListener(view -> {
            user.followed = !user.followed;
            Button followButton1 = (Button) view;
            followButton1.setText(user.followed ? "Unfollow" : "Follow");
        });
    }



}