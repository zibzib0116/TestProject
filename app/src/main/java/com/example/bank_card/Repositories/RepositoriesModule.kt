package com.example.bank_card.Repositories

import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

val repositoryModule= module {
    factoryOf(::BankRepository)
}