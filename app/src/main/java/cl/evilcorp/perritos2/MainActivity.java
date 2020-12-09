package cl.evilcorp.perritos2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/*
    1.configurar dependencias y permisos x
    2.activar viewbinding x
    3.crear package retrofit y crear pojos x 80%
    4. diseño layout con recicler view
    5. crear presenter
    6. crear adapter, viewholder, y enlazar a reciclerview
    7.enlazar vista con presentador
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}