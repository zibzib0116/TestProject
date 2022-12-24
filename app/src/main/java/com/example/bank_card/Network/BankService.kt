package com.example.bank_card.Network

import com.example.bank_card.DataClasses.BinData
import retrofit2.http.GET

interface BankService {
    @GET("45717360")
    suspend fun getBinInfo():BinData
}