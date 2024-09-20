package com.ismailmesutmujde.kotlinradiobuttoncheckbox

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.ismailmesutmujde.kotlinradiobuttoncheckbox.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var bindingMain : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        val view = bindingMain.root
        setContentView(view)

        bindingMain.button.setOnClickListener {
            val javaStatus = bindingMain.checkBoxJava.isChecked
            val kotlinStatus = bindingMain.checkBoxKotlin.isChecked
            val swiftStatus = bindingMain.checkBoxSwift.isChecked
            val pythonStatus = bindingMain.checkBoxPyhton.isChecked
            val tSqlStatus = bindingMain.checkBoxTSql.isChecked
            val dotNetStatus = bindingMain.checkBoxDotNet.isChecked
            val cStatus = bindingMain.checkBoxC.isChecked
            val cSharpStatus = bindingMain.checkBoxCSharp.isChecked
            val cPlusPlusStatus = bindingMain.checkBoxCPlusPlus.isChecked
            val phpStatus = bindingMain.checkBoxPhp.isChecked

            val fbStatus = bindingMain.radioButtonFenerbahce.isChecked
            val gsStatus = bindingMain.radioButtonGalatasaray.isChecked
            val bjkStatus = bindingMain.radioButtonBesiktas.isChecked
            val tsStatus = bindingMain.radioButtonTrabzonspor.isChecked

            Log.e("Java Status", javaStatus.toString())
            Log.e("Kotlin Status", kotlinStatus.toString())
            Log.e("Swift Status", swiftStatus.toString())
            Log.e("Python Status", pythonStatus.toString())
            Log.e("TSql Status", tSqlStatus.toString())
            Log.e(".Net Status", dotNetStatus.toString())
            Log.e("C Status", cStatus.toString())
            Log.e("C# Status", cSharpStatus.toString())
            Log.e("C++ Status", cPlusPlusStatus.toString())
            Log.e("Php Status", phpStatus.toString())

            Log.e("Fenerbahçe Status", fbStatus.toString())
            Log.e("Galatasaray Status", gsStatus.toString())
            Log.e("Beşiktaş Status", bjkStatus.toString())
            Log.e("Trabzonspor Status", tsStatus.toString())
            
        }
        
        bindingMain.radioButtonFenerbahce.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                Toast.makeText(applicationContext, "Congratulations! :)", Toast.LENGTH_LONG).show()
            }
        }

    }
}