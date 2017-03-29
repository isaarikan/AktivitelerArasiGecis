package arksoft.com.aktivitelerarasigecis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button)findViewById(R.id.gecis);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Bulunduğumuz aktiviteden diğerine geçmek için bu satırı kullanıyoruz
                Intent intent=new Intent(MainActivity.this,IkinciActivity.class);
                intent.putExtra("yazi","1.aktiviteden geldim");
                startActivity(intent);
            }
        });


    }
}
