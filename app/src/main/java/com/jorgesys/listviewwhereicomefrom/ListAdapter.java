package com.jorgesys.listviewwhereicomefrom;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by jorgesys on 05/04/2014.
 */

 public class ListAdapter extends BaseAdapter {

        private ArrayList<myObjeto> entradas;
        private Context context;
        private static int lastIndex = 0;

        public ListAdapter(Context context, ArrayList<myObjeto> entradas) {
            this.context = context;
            this.entradas = entradas;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // inflate the layout.

           // Toast.makeText(context, "Usted salio de aqui: " + entradas.get(lastIndex).getTexto() + " y entro a : " + entradas.get(position).getTexto(), Toast.LENGTH_SHORT).show();

            Snackbar.make(parent, "Usted salio de aqui: " + entradas.get(lastIndex).getTexto() + " y entro a : " + entradas.get(position).getTexto(), Snackbar.LENGTH_LONG).show();

            if (convertView == null) {
                convertView = LayoutInflater.from(context).
                        inflate(R.layout.item_row, parent, false);
            }

            myObjeto item = entradas.get(position);

            TextView txtTitulo = (TextView)convertView.findViewById(R.id.titulo);
            TextView txtDescripcion = (TextView)convertView.findViewById(R.id.descripcion);
            txtTitulo.setText(item.getTexto());
            txtDescripcion.setText(item.getDescripcion());

            //Get the last position
            lastIndex = position;
            return convertView;
        }

    @Override
    public int getCount() {
        return entradas.size();
    }

    @Override
    public Object getItem(int position) { return entradas.get(position); }

    @Override
    public long getItemId(int position) {
        return position;
    }

}
