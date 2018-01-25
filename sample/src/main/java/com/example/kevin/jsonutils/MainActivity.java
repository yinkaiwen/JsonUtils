package com.example.kevin.jsonutils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.kevin.jsonutils.javabean.ComplexList;
import com.example.kevin.jsonutils.javabean.HealthInfo;
import com.example.kevin.jsonutils.javabean.User;
import com.example.kevin.jsonutils.javabean.UserList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String tag = MainActivity.class.getSimpleName();
    private Button mBtn1;
    private Button mBtn2;
    private Button mBtn3;
    private Button mBtn4;
    private Button mBtn5;
    private TextView mTv_json;
    private TextView mTv_to_string;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();
    }


    // End Of Content View Elements

    private void bindViews() {

        mBtn1 = findViewById(R.id.btn1);
        mBtn2 = findViewById(R.id.btn2);
        mBtn3 = findViewById(R.id.btn3);
        mBtn4 = findViewById(R.id.btn4);
        mBtn5 = findViewById(R.id.btn5);
        mTv_json = findViewById(R.id.tv_json);
        mTv_to_string = findViewById(R.id.tv_to_string);


        mBtn1.setOnClickListener(this);
        mBtn2.setOnClickListener(this);
        mBtn3.setOnClickListener(this);
        mBtn4.setOnClickListener(this);
        mBtn5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String rs = null;
        switch (v.getId()) {
            case R.id.btn1:
                mTv_json.setText(JsonBean.user);
                JsonUtils<User> jsonUtils = new JsonUtils<>();
                User user = jsonUtils.jsonString(User.class, JsonBean.user);
                rs = user.toString();
                break;
            case R.id.btn2:
                mTv_json.setText(JsonBean.user_list);
                JsonUtils<UserList> jsonUtils1 = new JsonUtils<>();
                UserList userList = jsonUtils1.jsonString(UserList.class, JsonBean.user_list);
                rs = userList.toString();
                break;
            case R.id.btn3:
                mTv_json.setText(JsonBean.health_info);
                JsonUtils<HealthInfo> jsonUtils2 = new JsonUtils<>();
                HealthInfo healthInfo = jsonUtils2.jsonString(HealthInfo.class, JsonBean.health_info);
                rs = healthInfo.toString();
                break;
            case R.id.btn4:
                mTv_json.setText(JsonBean.user_no_name);
                JsonUtils<User> jsonUtils3 = new JsonUtils<>();
                User user1 = jsonUtils3.jsonString(User.class, JsonBean.user_no_name);
                rs = user1.toString();
                break;
            case R.id.btn5:
                mTv_json.setText(JsonBean.complext_list);
                JsonUtils<ComplexList> jsonUtils4 = new JsonUtils<>();
                ComplexList complexList = jsonUtils4.jsonString(ComplexList.class, JsonBean.complext_list);
                rs = complexList.toString();
                break;
        }
        if (!TextUtils.isEmpty(rs)) {
            Log.i(tag, rs);
            mTv_to_string.setText(rs);
        }

    }
}
