package com.example.pesenin.ui.screens.pilihKantin

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.pesenin.data.model.Store
import com.example.pesenin.data.model.User
import com.example.pesenin.data.repository.AuthRepository
import com.example.pesenin.data.repository.StorageRepository
import com.example.pesenin.data.repository.StoreRepository
import com.example.pesenin.data.repository.UserRepository

class PilihKantinViewModel(
    private val AuthRepository: AuthRepository = AuthRepository(),
    private val StoreRepository: StoreRepository = StoreRepository(),
    private val StorageRepository: StorageRepository = StorageRepository()
): ViewModel() {
    fun GetAllStore(callback: (List<Store>) -> Unit){
        StoreRepository.GetAllStore { stores ->
            callback(stores)
        }
    }

    fun GetStorePhoto(fileName:String,callback: (String) -> Unit){
        StorageRepository.getStorePhoto(fileName){url ->
            callback(url)

        }
    }
}