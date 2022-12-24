package com.example.bank_card.Network

import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


var apiModule= module {
    single { providerRetrofit() }
    factory { providerBankService(get()) }
}

fun providerBankService(retrofit: Retrofit): BankService =retrofit
    .create(BankService::class.java)

private const val BASE_URL="https://lookup.binlist.net/"
fun providerRetrofit():Retrofit =Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(BASE_URL).build()


