package pe.edu.ulima.adapters.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import pe.edu.ulima.adapters.R;
import pe.edu.ulima.adapters.model.Curso;

/**
 * Created by sodm on 12/09/2016.
 */
public class CursosaAdapter extends BaseAdapter {
    private List<Curso> mCursos;
    private LayoutInflater mInflater;

    public  CursosaAdapter (List<Curso> cursos, Context context){
        mCursos=cursos;
        mInflater=LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return mCursos.size();
    }

    @Override
    public Object getItem(int i) {
        return mCursos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if(view ==null){

            view = mInflater.inflate(R.layout.item_curso,null);
            viewHolder = new ViewHolder();
            viewHolder.curso = (TextView) view.findViewById(R.id.nombreCurso);
            viewHolder.creditos = (TextView) view.findViewById(R.id.creditos);

            view.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) view.getTag();
        }




        Curso c =mCursos.get(i);


        viewHolder.curso.setText(c.getNombre());
        viewHolder.creditos.setText(String.valueOf(c.getCreditos()));
        return view;
    }
    class ViewHolder{
        TextView curso;
        TextView creditos;
    }
}
