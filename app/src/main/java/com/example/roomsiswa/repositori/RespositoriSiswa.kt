package com.example.roomsiswa.repositori

import com.example.roomsiswa.room.Siswa
import com.example.roomsiswa.room.SiswaDao
import kotlinx.coroutines.flow.Flow

interface RespositoriSiswa{
    fun getAllSiswaStrean(): Flow<List<Siswa>>
    suspend fun insertSiswa(siswa: Siswa)
}


class OfflineRepositorySiswa(private val siswaDao: SiswaDao): RespositoriSiswa{
    override fun getAllSiswaStrean(): Flow<List<Siswa>> = siswaDao.getAllSiswa()
    override suspend fun insertSiswa(siswa: Siswa) = siswaDao.insert(siswa)
}