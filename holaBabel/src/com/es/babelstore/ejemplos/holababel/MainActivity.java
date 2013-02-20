package com.es.babelstore.ejemplos.holababel;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	EditText etxtNombre;
	Button btnEnviar;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		etxtNombre =(EditText)findViewById(R.id.etxtNombre);
		btnEnviar = (Button)findViewById(R.id.btnEnviar);
		btnEnviar.setOnClickListener(new OnClickListener() {
        	public void onClick(View v) {
        		Intent intent = new Intent();
        		// Leemos lo que se ha introducido en la caja de texto
        		intent.putExtra("nombre", etxtNombre.getText().toString());
        		intent.setClass(getApplicationContext(), MostrarActivity.class);
        		startActivity(intent);
        	}
        });

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		
		return true;
	}

}
