package com.teach.zooted.feature_Detect.data.di

import com.teach.zooted.feature_Detect.data.remote.ShazamApi
import com.teach.zooted.core.utils.AppConstants.BASEURL
import com.teach.zooted.feature_Detect.data.repo.ShazamRepoImpl
import com.teach.zooted.feature_Detect.domain.repo.ShazamRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)

object ShazamModule {

    @Provides
    fun providesRetrofitApi(retrofit: Retrofit): ShazamApi {
        return retrofit.create(ShazamApi::class.java)
    }

    @Singleton
    @Provides
    fun providesRetrofit(): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(
                GsonConverterFactory.create()
            )
            .baseUrl(BASEURL)
            .build()
    }

    @Provides
    @Singleton
    fun providesSongDetectionRepo(api: ShazamApi, @IoDispatcher dispatcher: CoroutineDispatcher): ShazamRepo {
        return ShazamRepoImpl( api, dispatcher)
    }
}