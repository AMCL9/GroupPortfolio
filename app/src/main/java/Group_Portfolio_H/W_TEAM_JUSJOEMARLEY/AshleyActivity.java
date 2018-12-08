package Group_Portfolio_H.W_TEAM_JUSJOEMARLEY;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class AshleyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ashley);
        getSupportActionBar().setTitle("Ashley");

        findViewById(R.id.click_for_bio_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AshleyActivity.this, AshleyBioActivity.class);
                startActivity(intent);
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.project_one:
                Uri uri = Uri.parse("https://github.com/AMCL9/Story_App_HW_Lewis_Ashley");
                Intent it = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(it);
                break;
            case R.id.project_two:
                Uri uri1 = Uri.parse("https://github.com/AMCL9/Java_Bank_Pursuit_HW_LEWIS_ASHLEY");
                Intent it1 = new Intent(Intent.ACTION_VIEW, uri1);
                startActivity(it1);
                break;
            case R.id.project_three:
                Uri uri2 = Uri.parse("https://github.com/AMCL9/Homework-1.02");
                Intent it2 = new Intent(Intent.ACTION_VIEW, uri2);
                startActivity(it2);
                break;
        }

        return true;
    }


}
