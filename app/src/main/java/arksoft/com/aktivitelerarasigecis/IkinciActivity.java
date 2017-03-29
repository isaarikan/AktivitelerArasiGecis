package arksoft.com.aktivitelerarasigecis;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by isaarikan on 28.03.2017.
 */

public class IkinciActivity extends Activity {
    TextView txt;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ikincisiniftasarim);
        txt=(TextView)findViewById(R.id.textView);
        //1.aktiviteden gelen yazıyı alıp textview'da gösteriyoruz

        Intent intent=getIntent();
        String message=intent.getStringExtra("yazi");

        txt.setText(message);



    }
}
