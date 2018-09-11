package com.me.cl.template.presentation.di

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.me.cl.template.framework.data.local.room.AppDatabase
import com.me.cl.template.framework.data.local.room.dao.UserDao
import com.me.cl.template.framework.di.ViewModelKey
import com.me.cl.template.framework.viewmodel.MyViewModelFactory
import com.me.cl.template.presentation.viewmodel.LoginViewModel
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import javax.inject.Singleton

@Suppress("unused")
@Module
abstract class ViewModelModule{
    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel::class)
    abstract fun bindCityListViewModel(loginViewModel:LoginViewModel): ViewModel

    @Singleton
    @Binds
    abstract fun bindViewModelFactory(factory: MyViewModelFactory): ViewModelProvider.Factory


    @Module
    companion object {
        @JvmStatic
        @Provides
        fun provideUserDao(dataBase: AppDatabase): UserDao{
            return dataBase.userDao()
        }
    }
}