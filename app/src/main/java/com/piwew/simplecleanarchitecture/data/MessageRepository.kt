package com.piwew.simplecleanarchitecture.data

import com.piwew.simplecleanarchitecture.domain.IMessageRepository
import com.piwew.simplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity {
        return messageDataSource.getMessageFromSource(name)
    }
}