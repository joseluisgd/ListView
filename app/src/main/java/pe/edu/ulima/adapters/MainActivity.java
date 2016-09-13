package pe.edu.ulima.adapters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

import pe.edu.ulima.adapters.adapters.CursosaAdapter;
import pe.edu.ulima.adapters.model.Curso;
import pe.edu.ulima.adapters.model.GestorCursos;

public class MainActivity extends AppCompatActivity {
    private ListView spiCursos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        spiCursos=(ListView)findViewById(R.id.spinner);
        List<Curso> cursos = new GestorCursos().listarCursos();
        CursosaAdapter cursosadapter=new CursosaAdapter(cursos,this);

        spiCursos.setAdapter(cursosadapter);

        spiCursos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Curso curso= (Curso)adapterView.getItemAtPosition(i);
                Toast.makeText(MainActivity.this,"Curso: " + curso.getNombre(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
