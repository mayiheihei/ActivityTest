package com.example.activitytest;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends BaseActivity {
    private static final String TAG = "SecondActivity------";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Log.d(TAG, "第二个活动任务ID是："+getTaskId());
        /*Intent intent = getIntent();
        String data = intent.getStringExtra("aaaa");
        Log.d(TAG, data);*/
        Button button2 = (Button) findViewById(R.id.Button_2);
        button2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                /*Intent intent = new Intent();
                intent.putExtra("data_return","我胡汉三又回来了！");
                setResult(RESULT_OK,intent);
                finish();*/
                Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("data_return","我胡汉三还是回来了！");
        setResult(RESULT_OK,intent);
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy****");
    }
}
