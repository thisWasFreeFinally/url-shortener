package com.kt.urlshortener.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(HttpStatus.BAD_REQUEST)
class UrlInvalidException(override val message: String) : RuntimeException(message) {
}