package com.example.pesenin.data.repository

import com.example.pesenin.data.model.Store
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class StoreRepository {
    private lateinit var database: DatabaseReference

    fun GetAllStore(callback: (List<Store>) -> Unit){
        database = FirebaseDatabase.getInstance().reference.child("Store")

        database.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val stores = snapshot.children
                    .mapNotNull { it.getValue(Store::class.java) }
                    .take(10)

                callback(stores)
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle error
            }
        })
    }
}