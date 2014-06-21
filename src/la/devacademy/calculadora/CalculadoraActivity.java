package la.devacademy.calculadora;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.os.Build;

public class CalculadoraActivity extends ActionBarActivity implements OnClickListener{
	
	//variables captura de edicoin de text
	public String txrNum1;
	public String txtNum2;
	public String txtRes;
	// variables para psasarla a la clase
	public Double num1;
	public Double num2;
    public Double res;
	
    //componentes graficos
    Button btnSum;
    Button btnRes;
    Button btnMul;
    Button btnDiv;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.widget36, new PlaceholderFragment())
                    .commit();
        }
        
        btnSum = (Button) findViewById(R.id.btnSum);
        btnSum.setOnClickListener(this);
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.calculadora, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_calculadora, container, false);
            return rootView;
        }
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		EditText tnum1 = (EditText)findViewById(R.id.num1);
		EditText tnum2 = (EditText)findViewById(R.id.num2);
		EditText ViewRes = (EditText)findViewById(R.id.res);
		
		num1 = Double.valueOf(tnum1.getText().toString());
		num2 = Double.valueOf(tnum2.getText().toString());
		
		Operaciones op = new Operaciones();
		String Respuesta = "";
		
		if(v.getId() == btnSum.getId()){
			Respuesta = op.Sumar(num1, num2);
		}
		
		ViewRes.setText(Respuesta);
		
		
		
	}

}
