package brunoandrade.com.br.rotaideal.telas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import brunoandrade.com.br.rotaideal.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }


    @OnClick(R.id.buttonAcessar)
    public void onAcessarClick(){
        startActivity(new Intent(this, MainActivity.class));
    }
}
