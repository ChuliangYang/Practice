package com.me.cl.template.presentation.di

import android.app.Application
import android.arch.persistence.room.Room
import com.me.cl.template.MyApplication
import com.me.cl.template.framework.data.local.room.AppDatabase
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    AppModule::class,
    MainActivitySubComponentModule::class
])
interface AppComponent{
    @Component.Builder
    interface Builder{
        @BindsInstance
        fun application(application: Application):Builder
        fun build():AppComponent
    }

    fun inject(application: MyApplication)
}

@Module(includes = [ViewModelModule::class])
class AppModule {
//    @Singleton
//    @Provides
//    fun provideRetrofit(): Retrofit {
//        return Retrofit.Builder().baseUrl(SERVER_HOST).client(OkHttpClient.Builder().apply {
////            addNetworkInterceptor(HttpLoggingInterceptor().apply {
////                level = HttpLoggingInterceptor.Level.BASIC
////            })
//            addNetworkInterceptor(HttpLoggingInterceptor().apply {
//                level = HttpLoggingInterceptor.Level.BODY
//            })
//        }.build()).addConverterFactory(GsonConverterFactory.create()).addCallAdapterFactory(LiveDataCallAdapterFactory()).build()
//    }
//
//    @Singleton
//    @Provides
//    fun provideGistService(retrofit: Retrofit): ApiService {
//        return retrofit.create(ApiService::class.java)
//    }

    @Singleton
    @Provides
    fun provideRoomDataBase(application: Application): AppDatabase {
        return Room.databaseBuilder(application, AppDatabase::class.java, "user").build()
    }
}

