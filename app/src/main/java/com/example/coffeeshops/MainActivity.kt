package com.example.coffeeshops

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val items = ArrayList<Coffee>()
        items.add(Coffee(R.drawable.images,R.string.Cafe1,R.string.Cafe1Direccion))
        items.add(Coffee(R.drawable.images1,R.string.Cafe2,R.string.Cafe2direccion))
        items.add(Coffee(R.drawable.images2,R.string.Cafe3,R.string.Cafe3Direccion))
        items.add(Coffee(R.drawable.images3,R.string.Cafe4,R.string.Cafe4Direccion))
        items.add(Coffee(R.drawable.images4,R.string.Cafe5,R.string.Cafe5Direccion))
        items.add(Coffee(R.drawable.images5,R.string.Cafe6,R.string.Cafe6Direccion))
        items.add(Coffee(R.drawable.images6,R.string.Cafe7,R.string.Cafe7Direccion))
        val recView = findViewById<RecyclerView>(R.id.recyclerViewPrincipal)
        recView.setHasFixedSize(true)

        val adaptador = CoffeeAdapter(items)
        recView.adapter = adaptador
        recView.layoutManager =LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        adaptador.onClick = {

        }
//        override fun onCreateOptionsMenu(menu: Menu): Boolean {
//            menuInflater.inflate(R.menu, menu)
//            return true
//        }
//
//        override fun onOptionsItemSelected(item: MenuItem): Boolean {
//            if (item.itemId.equals(R.id.compara)) {
//                val i = Intent(this, ComparaActivity::class.java)
//                startActivity(i)
//            }
//            return true
//        }

    }
}