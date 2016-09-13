package pe.edu.ulima.adapters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Spinner;

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
    }
}
