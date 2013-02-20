package com.es.babelstore.ejemplos.holababel;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MostrarActivity extends Activity {
	TextView saludo;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mostrar);
		Bundle bundle=getIntent().getExtras();
		saludo = (TextView) findViewById(R.id.saludo);
		saludo.setText(saludo.getText() + " " + bundle.getString("nombre") + " !!");
	}

}
