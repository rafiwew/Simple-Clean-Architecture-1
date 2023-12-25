package com.piwew.simplecleanarchitecture.domain

interface MessageUseCase {
    fun getMessage(name: String): MessageEntity
}