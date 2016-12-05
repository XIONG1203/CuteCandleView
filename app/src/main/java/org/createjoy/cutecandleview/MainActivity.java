package org.createjoy.cutecandleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CandlesAnimView mCandlesAnimView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCandlesAnimView = (CandlesAnimView) findViewById(R.id.candles_view);
        mCandlesAnimView.setStopAnimListener(new CandlesAnimView.StopAnimListener() {
            @Override
            public void OnAnimStop() {
                Toast.makeText(MainActivity.this,"End Anim.",Toast.LENGTH_SHORT).show();
            }
        });
        mCandlesAnimView.postDelayed(new Runnable() {
            @Override
            public void run() {
//                mCandlesAnimView.stopAnim();
            }
        },5000);
    }
}
