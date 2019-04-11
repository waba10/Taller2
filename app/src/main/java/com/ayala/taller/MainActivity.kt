package com.ayala.taller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager
    private lateinit var moneda: MutableList<Moneda>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moneda = MutableList(20) { i ->


            Moneda(i, "colon", "El Salvador", 1980, "Disponible")

        }

        initRecycler()
    }
    fun initRecycler() {
        viewManager = LinearLayoutManager(this)
        viewAdapter = MonedaAdapter(moneda)

        rv_list_monedas.apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }

    }
}
