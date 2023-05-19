package es.uca.gadesports

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import es.uca.pnetsegundaclase.R


    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            val reservas = listOf(
                Reservas("Futbol", "Bahia sur", "23:00"),
                Reservas("Futbol", "Bahia sur", "23:00"),
                Reservas("Futbol", "Bahia sur", "23:00"),
                Reservas("Futbol", "Bahia sur", "23:00"),
                Reservas("Futbol", "Bahia sur", "23:00"),
                Reservas("Futbol", "Bahia sur", "23:00"),
                Reservas("Futbol", "Bahia sur", "23:00"),
                Reservas("Futbol", "Bahia sur", "23:00"),
                Reservas("Futbol", "Bahia sur", "23:00"),
                Reservas("Futbol", "Bahia sur", "23:00"),
                Reservas("Futbol", "Bahia sur", "23:00"),
                Reservas("Futbol", "Bahia sur", "23:00"),
                Reservas("Futbol", "Bahia sur", "23:00"),
                Reservas("Futbol", "Bahia sur", "23:00"),

                )
            val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
            val adapter = ReservasAdapter(reservas)
            recyclerView.adapter = adapter
            recyclerView.layoutManager = LinearLayoutManager(this)
        }
    }
