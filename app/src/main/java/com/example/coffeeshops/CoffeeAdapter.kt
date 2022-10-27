package com.example.coffeeshops

import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView

class CoffeeAdapter(var items: ArrayList<Coffee>) :
    RecyclerView.Adapter<CoffeeAdapter.CoffeeTarjViewHolder>() {

    lateinit var onClick: (View) -> Unit

    class CoffeeTarjViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var imagen: ImageView
        var textNombre: TextView
        var textDireccion: TextView

        init {
            imagen = itemView.findViewById(R.id.imagenPrincipal)
            textNombre = itemView.findViewById(R.id.textViewNombreCafe)
            textDireccion = itemView.findViewById(R.id.textViewDireccionCafe)

        }


        fun bindTarjeta(t: Coffee, onClick: (View) -> Unit) = with(itemView) {
            imagen.setImageResource(t.imagen)
            textNombre.setText(t.nombre)
            textDireccion.setText(t.direcion)
            setOnClickListener { onClick(itemView) }
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): CoffeeTarjViewHolder {
        val itemView =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.item_coffe, viewGroup, false)
        return CoffeeTarjViewHolder(itemView)
    }

    override fun onBindViewHolder(viewHolder: CoffeeTarjViewHolder, pos: Int) {
        val item = items.get(pos)
        viewHolder.bindTarjeta(item, onClick)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}