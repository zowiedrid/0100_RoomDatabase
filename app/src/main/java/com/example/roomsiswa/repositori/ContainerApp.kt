package com.example.roomsiswa.repositori

import android.content.Context
import com.example.roomsiswa.room.DatabaseSiswa

interface ContainerApp {
    val repositoriSiswa: RespositoriSiswa
}

class ContainerDataApp(private val context: Context) : ContainerApp {
    override val repositoriSiswa: RespositoriSiswa by lazy {
        OfflineRepositorySiswa(DatabaseSiswa.getDatabase(context).siswaDao())
    }
}
