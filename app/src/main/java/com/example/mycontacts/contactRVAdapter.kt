package com.example.mycontacts

import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class ContactRVAdapter(var contactList: List<contact>):RecyclerView.Adapter<contactsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): contactsViewHolder {
     var itemView =LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item,parent,false)

        return contactsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: contactsViewHolder, position: Int) {
      var currentContact = contactList.get(position)
        holder.tvContactName.text=currentContact.ContactName
        holder.tvPhoneNumber.text=currentContact.PhoneNumber
        holder.tvEmail.text = currentContact.Email
    }

    override fun getItemCount(): Int {
       return contactList.size
    }
}
class contactsViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
    var tvContactName = itemView.findViewById<TextView>(R.id.tvContactName)
    var tvPhoneNumber =itemView.findViewById<TextView>(R.id.tvPhoneNumber)
    var tvEmail =itemView.findViewById<TextView>(R.id.tvEmail)
}