package com.example.androiddatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.androiddatabase.manager.RealmManager
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    private lateinit var tvRealm: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        tvRealm = findViewById(R.id.tvRealm)
        val btnRealm: MaterialButton = findViewById(R.id.btnRealm)

        btnRealm.setOnClickListener {
            realmDatabase()
        }
    }

    private fun realmDatabase() {
        //val post1 = Post(1, "PDP")
        val post2 = Post(2, "PDP")
        //RealmManager.instance!!.save(post1)
        RealmManager.instance!!.save(post2)
        val posts = RealmManager.instance!!.loadPost()
        tvRealm.text = posts.size.toString()
    }
}