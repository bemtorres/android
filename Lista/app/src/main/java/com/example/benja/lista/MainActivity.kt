package com.example.benja.lista

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Agregar(v: View){
        val nombre : String
        val descripcion : String
        val precio : Int

        if (TextUtils.isEmpty(txtNombre.text.toString())){
            txtNombre.error = "Ingrese Nombre"
            return
        }else{
            nombre = txtNombre.text.toString()
        }

        if (TextUtils.isEmpty(txtDesc.text.toString())){
            txtDesc.error = "Ingrese Descripcion"
            return
        }else{
            descripcion = txtDesc.text.toString()
        }

        if (TextUtils.isEmpty(txtPrecio.text.toString())){
            txtPrecio.error = "Ingrese el precio"
            return
        }else{
            precio = txtPrecio.text.toString().toInt()
            if (precio<1000){
                Toast.makeText(this,"Precio tiene que ser mayor que 1000", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
