package com.example.bank_card.DataClasses

class BinData(
    var number:BinNumber,
    var scheme:String,
    var type: String,
    var brand:String,
    var prepaid: Boolean,
    var country:CountryData,
    var bank:BankData
) {
}