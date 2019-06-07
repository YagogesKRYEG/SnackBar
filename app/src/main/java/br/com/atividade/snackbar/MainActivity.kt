package br.com.atividade.snackbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAbrir.setOnClickListener {
            val snack = Snackbar.make(it,"Isso é uma simples snackbar", Snackbar.LENGTH_LONG)
            snack.show()
        }
    }
}