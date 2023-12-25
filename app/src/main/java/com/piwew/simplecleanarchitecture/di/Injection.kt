package com.piwew.simplecleanarchitecture.di

import com.piwew.simplecleanarchitecture.data.IMessageDataSource
import com.piwew.simplecleanarchitecture.data.MessageDataSource
import com.piwew.simplecleanarchitecture.data.MessageRepository
import com.piwew.simplecleanarchitecture.domain.IMessageRepository
import com.piwew.simplecleanarchitecture.domain.MessageInteractor
import com.piwew.simplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}