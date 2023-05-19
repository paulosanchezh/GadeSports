package es.uca.gadesports

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import es.uca.pnetsegundaclase.R

class ReservasAdapter (private val reservas: List<Reservas>) :
    RecyclerView.Adapter<ReservasAdapter.ReservasViewHolder>(){
        class ReservasViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val nombreTextView: TextView = itemView.findViewById(R.id.textViewPetName)
            val razaTextView: TextView = itemView.findViewById(R.id.textViewPetType)
            val edadTextView: TextView = itemView.findViewById(R.id.textViewPetAge)
            val adoptButton: Button = itemView.findViewById(R.id.buttonAdopt)
            val detalleButton: Button = itemView.findViewById(R.id.buttonDetalles)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReservasViewHolder{
            val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item_reservas, parent, false)
            return ReservasViewHolder(itemView)
        }

    override fun onBindViewHolder(holder: ReservasAdapter.ReservasViewHolder, position: Int){
        val currentReserva = reservas[position]
        holder.nombreTextView.text = currentReserva.deporte
        holder.razaTextView.text = currentReserva.centro
        holder.edadTextView.text = currentReserva.horario
        holder.adoptButton.setOnClickListener{
            Toast.makeText(holder.itemView.context, "Has Eliminado una reserva ${currentReserva.deporte}", Toast.LENGTH_SHORT).show()
        }
    }
    override fun getItemCount() = reservas.size
}

