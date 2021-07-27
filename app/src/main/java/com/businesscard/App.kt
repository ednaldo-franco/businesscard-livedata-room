package com.businesscard

import android.app.Application
import com.businesscard.data.AppDataBase
import com.businesscard.data.BusinessCardRepository

class App : Application() {
    val dataBase by lazy { AppDataBase.getDataBase(this) }

    val repository by lazy { BusinessCardRepository(dataBase.businessDao()) }

}