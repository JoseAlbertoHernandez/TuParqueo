package com.edu.unab.tuparqueo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import com.edu.unab.tuparqueo.modelo.Parqueadero;


public class ParqueaderoAdapter extends FirestoreRecyclerAdapter<Parqueadero, ParqueaderoAdapter.ViewHolder> {

    FirebaseFirestore firestore = FirebaseFirestore.getInstance();

    public ParqueaderoAdapter(@NonNull FirestoreRecyclerOptions<Parqueadero>options){
        super(options);
    }

    @Override
    protected void onBindViewHolder (@NonNull ParqueaderoAdapter.ViewHolder holder,int position, @NonNull Parqueadero model) {
        DocumentSnapshot parqueaderoDocumento = getSnapshots().getSnapshot(holder.getAdapterPosition());
        final String id = parqueaderoDocumento.getId();

        holder.txvNit.setText(id);
        holder.txvRazonSocial.setText(model.getRazonSocial());
        holder.txvDirPar.setText(model.getDireccionParqueadero());
        holder.txvTelPar.setText(model.getTelParqueadero());
        holder.txvCorreoPar.setText(model.getCorreoParqueadero());

        holder.btnElim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firestore.collection("Parqueadero").document().delete();

            }

        });
    }

    @NonNull
    @Override
    public ParqueaderoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.vista_parqueadero,parent,false);

        return new ViewHolder(view);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txvNit, txvRazonSocial, txvDirPar, txvTelPar, txvCorreoPar;
        Button btnElim;

      public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txvNit = itemView.findViewById(R.id.txvNit);
            txvRazonSocial = itemView.findViewById(R.id.txvRazonSocial);
            txvDirPar = itemView.findViewById(R.id.txvDirPar);
            txvTelPar = itemView.findViewById(R.id.txvTelPar);
            txvCorreoPar = itemView.findViewById(R.id.txvCorreoPar);

            btnElim = itemView.findViewById(R.id.btnElim);

        }
    }

}
