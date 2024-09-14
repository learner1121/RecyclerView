package com.example.to_do_list

import android.icu.text.CaseMap.Title
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val aryContact = ArrayList<ContactModel>()

        aryContact.add(ContactModel("21","Gautam"))
        aryContact.add(ContactModel("22","Basant"))
        aryContact.add(ContactModel("23","Deepak"))
        aryContact.add(ContactModel("24","Hansraj"))
        aryContact.add(ContactModel("25","Diwakar"))
        aryContact.add(ContactModel("26","prashant"))
        aryContact.add(ContactModel("26","prashant"))
        aryContact.add(ContactModel("26","prashant"))
        aryContact.add(ContactModel("27","Sanjeev"))
        aryContact.add(ContactModel("28","Karan"))
        aryContact.add(ContactModel("28","Karan"))
        aryContact.add(ContactModel("28","Karan"))
        aryContact.add(ContactModel("28","Karan"))
        aryContact.add(ContactModel("29","Ramu"))
        aryContact.add(ContactModel("30","Chandan"))
        aryContact.add(ContactModel("30","Chandan"))
        aryContact.add(ContactModel("30","Chandan"))
        aryContact.add(ContactModel("30","Chandan"))


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 1)

        val RecyclerAdapter= RecyclerAdapter(this,aryContact)
        recyclerView.adapter = RecyclerAdapter
    }
}