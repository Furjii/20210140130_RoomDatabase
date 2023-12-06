package com.example.roomsiswa.ui

import android.app.Application
import com.example.roomsiswa.repository.ContainerApp
import com.example.roomsiswa.repository.ContainerDataApp

class AplikasiSiswa: Application() {
    /*
    AppContainer instance digunakan oleh kelas-kelas lainnya untuk mendapatkan dependensi
     */
    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}