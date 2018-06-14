package demjanov.av.ru.mvp_app;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity implements MainView, View.OnClickListener {
    private Button btnCounter1;
    private Button btnCounter2;
    private Button btnCounter3;
    private Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCounter1 = (Button) findViewById(R.id.btnCounter1);
        btnCounter2 = (Button) findViewById(R.id.btnCounter2);
        btnCounter3 = (Button) findViewById(R.id.btnCounter3);
        btnCounter1.setOnClickListener(this);
        btnCounter2.setOnClickListener(this);
        btnCounter3.setOnClickListener(this);
        mPresenter = new Presenter(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnCounter1:
                mPresenter.buttonClick(1);
                break;
            case R.id.btnCounter2:
                mPresenter.buttonClick(2);
                break;
            case R.id.btnCounter3:
                mPresenter.buttonClick(3);
                break;
        }

    }


    @Override
    public void setButtonText(int btnIndex, int value) {
        String str = this.getResources().getString(R.string.numbers) + value;
        switch (btnIndex){
            case 1:
                btnCounter1.setText(str);
                break;
            case 2:
                btnCounter2.setText(str);
                break;
            case 3:
                btnCounter3.setText(str);
                break;
        }

    }
}
