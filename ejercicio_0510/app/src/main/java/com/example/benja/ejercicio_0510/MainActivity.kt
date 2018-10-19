package com.example.benja.ejercicio_0510

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ProgressBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var proceso = 0;
        var rango =0 ;





        btnDescargar.setOnClickListener{
                Thread(Runnable {
                    while (proceso<pB.max) try {
                        rango=5
                        Thread.sleep(500)
                    }catch (e: InterruptedException){
                       e.printStackTrace()
                        Log.e("error" , e.message)
                    }
                    proceso = proceso + rango
                    pB.progress = proceso

                }).start()
        }




    }
}
