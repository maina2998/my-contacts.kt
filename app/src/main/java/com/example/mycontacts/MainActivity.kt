package com.example.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvContacts: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayContact()
    }
    fun displayContact(){
        var contactList = listOf<contact>(
            contact("Steve Muthiga","078912401", "muthigasteve@gmail"),
            contact("Annabelle Wangari", "0745673219","wangariannabelle@gmail.com"),
            contact("Mercy Muthoni","0789256534", "muthonimercy@gmail.com"),
            contact("Wambui Njoroge","0721383241", "njorogewambui@gmail.com"),
        )
        rvContacts= findViewById(R.id.rvcontacts)
        var contactAdapter = ContactRVAdapter(contactList)
        rvContacts.layoutManager = LinearLayoutManager(baseContext)
        rvContacts.adapter = contactAdapter
    }

}
