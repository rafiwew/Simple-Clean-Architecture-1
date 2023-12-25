package com.piwew.simplecleanarchitecture.data

import com.piwew.simplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}