package herick.basso.appcompras;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    CheckBox chkarroz, chkleite, chkfeijao, chkcarne;

    Button bttotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkarroz = (CheckBox) findViewById(R.id.chkarroz);
        chkleite = (CheckBox) findViewById(R.id.chkleite);
        chkcarne = (CheckBox) findViewById(R.id.chkcarne);
        chkfeijao = (CheckBox) findViewById(R.id.chkfeijao);
        Button bttotal = (Button) findViewById(R.id.btntotal);
        bttotal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0){
                double total = 0;
                if (chkarroz.isChecked()){total +=2.69;}
                if (chkleite.isChecked()){total +=5.00;}
                if (chkcarne.isChecked()){total +=9.70;}
                if (chkfeijao.isChecked()){total +=2.30;}
                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Aviso");
                dialogo.setMessage("Valor total da compra "+ String.valueOf(total));
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            } });
        }
    }



