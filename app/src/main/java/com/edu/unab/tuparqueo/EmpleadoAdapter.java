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
import com.edu.unab.tuparqueo.modelo.Empleado;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

public class EmpleadoAdapter extends FirestoreRecyclerAdapter<Empleado, EmpleadoAdapter.ViewHolder> {

    FirebaseFirestore firestore = FirebaseFirestore.getInstance();

    public EmpleadoAdapter(@NonNull FirestoreRecyclerOptions<Empleado> options){

        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull EmpleadoAdapter.ViewHolder holder, int position, @NonNull Empleado model){
        DocumentSnapshot empleadoDocumento = getSnapshots().getSnapshot(holder.getAdapterPosition());
        final String id = empleadoDocumento.getId();

        holder.txvCedEmp.setText(id);
        holder.txvNomEmp.setText(model.getNomEmpleado());
        holder.txvApeEmp.setText(model.getApeEmpleado());
        holder.txvCargo.setText(model.getCargo());
        holder.txvDirEmp.setText(model.getDirEmpleado());
        holder.txvTelEmp.setText(model.getTelEmpleado());
        holder.txvCorreoEmp.setText(model.getCorreoEmpleado());

        holder.btnElim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                firestore.collection("Empleado").document(id).delete();
            }
        });

    }

    @NonNull
    @Override
    public EmpleadoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.vista_empleado,parent,false);

        return new ViewHolder(view);
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txvCedEmp,txvNomEmp,txvApeEmp,txvCargo,txvDirEmp,txvTelEmp,txvCorreoEmp;
        Button btnElim;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txvCedEmp = itemView.findViewById(R.id.txvCedEmp);
            txvNomEmp = itemView.findViewById(R.id.txvRazonSocial);
            txvApeEmp = itemView.findViewById(R.id.txvApeEmp);
            txvCargo = itemView.findViewById(R.id.txvCargo);
            txvDirEmp = itemView.findViewById(R.id.txvDirEmp);
            txvTelEmp = itemView.findViewById(R.id.txvTelEmp);
            txvCorreoEmp = itemView.findViewById(R.id.txvCorreoEmp);

        }
    }
}
