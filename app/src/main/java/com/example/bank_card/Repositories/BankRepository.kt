package com.example.bank_card.Repositories

import com.example.bank_card.Network.BankService
import com.example.bank_card.DataClasses.BinData

class BankRepository(private  val  bankService: BankService) {

    suspend fun getBinInformation():BinData{
        return bankService.getBinInfo()
    }
}