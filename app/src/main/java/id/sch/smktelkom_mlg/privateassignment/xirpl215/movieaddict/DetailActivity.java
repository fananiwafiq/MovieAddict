package id.sch.smktelkom_mlg.privateassignment.xirpl215.movieaddict;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //setTitle(getIntent().getStringExtra(MainActivity.RESUTTITLE));
        //tvOverView = (TextView) findViewById(R.id.Description);
        //ivBackDrop = (ImageView) findViewById(R.id.imageViewBack);

        //tvOverView.setText(getIntent().getStringExtra(MainActivity.RESULTOVER));

        //Glide.with(DetailActivity.this)
        //      .load("https://image.tmdb.org/t/p/w500"+getIntent().getStringExtra(MainActivity.RESULTBACK))
        //    .into(ivBackDrop);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}
