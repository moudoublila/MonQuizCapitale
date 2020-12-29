package com.esiea.monquiz.Presentation.main
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.esiea.monquiz.R
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {


    private val MainVuModel: MainVuModel by inject()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


         }
fun onclickJouer(view: View){


    val intent= Intent(this,Quiz::class.java)
    startActivity(intent)
}






}
