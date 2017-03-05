package br.com.sample.recyclerviewapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import br.com.sample.recyclerviewapp.R;

public class DetailActivity extends AppCompatActivity {

    private static final String BUNDLE_EXTRAS = "BUNDLE_EXTRAS";
    private static final String EXTRA_TITLE = "TITLE";
    private static final String EXTRA_SUBTITLE = "SUBTITLE";
    private TextView tv_title, tv_subtitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tv_title    = (TextView) findViewById(R.id.tv_title);
        tv_subtitle = (TextView) findViewById(R.id.tv_subtitle);

        Bundle extras = getIntent().getBundleExtra(BUNDLE_EXTRAS);

        tv_title.setText(extras.getString(EXTRA_TITLE));
        tv_subtitle.setText(extras.getString(EXTRA_SUBTITLE));

    }
}
