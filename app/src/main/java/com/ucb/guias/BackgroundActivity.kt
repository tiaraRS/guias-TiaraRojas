package com.ucb.guias

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.widget.Toolbar
import androidx.constraintlayout.widget.ConstraintLayout

class BackgroundActivity : AppCompatActivity() {
    private val btnWhite:Button
        get()=findViewById(R.id.btnWhite)
    private val btnRed:Button
        get()=findViewById(R.id.btnRed)
    private val layoutPrincipal: ConstraintLayout
        get()=findViewById(R.id.layoutPrincipal)
    private val toolBar:Toolbar
        get()=findViewById(R.id.toolbar)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_background)

        supportActionBar.let{
            setSupportActionBar(toolBar)
        }

        btnRed.setOnClickListener{
            layoutPrincipal.setBackgroundColor(Color.RED)
        }

        btnWhite.setOnClickListener{
            layoutPrincipal.setBackgroundColor(Color.WHITE)
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item?.itemId){
            R.id.menu_item1->{
                Log.d("TEST", "PRESS ICON MENU")
                true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}