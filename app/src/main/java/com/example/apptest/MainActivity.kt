package com.example.apptest
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Menu
import android.view.MenuItem
import android.view.Window
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.NavHostFragment
import com.example.apptest.databinding.ActivityMainBinding

import com.google.zxing.integration.android.IntentResult

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    @SuppressLint("CommitTransaction")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //make the launcher screen buttons-options
        supportFragmentManager.beginTransaction().replace(R.id.contenedor,HomeFragment() )
    }
}

/*    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnScanner.setOnClickListener { initScanner() }
    }

    private fun initScanner() {
        val integrator: IntentIntegrator = IntentIntegrator(this)
        integrator.setDesiredBarcodeFormats(IntentIntegrator.ALL_CODE_TYPES)
        integrator.setPrompt("Listo")
        integrator.setTorchEnabled(false)
        integrator.setBeepEnabled(true)
        integrator.initiateScan()
    }

    @Deprecated("Deprecated in Java", ReplaceWith(
        "super.onActivityResult(requestCode, resultCode, data)",
        "androidx.appcompat.app.AppCompatActivity"
    )
    )
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        val result : IntentResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, data)
        if(result !=null){
            if (result.contents == null){
                Toast.makeText(this, "Cancelado", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "El valor escaneado es: ${result.contents}", Toast.LENGTH_SHORT).show()
            }
        }else{
            super.onActivityResult(requestCode, resultCode, data)
        }
    }*/

/*class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}*/


