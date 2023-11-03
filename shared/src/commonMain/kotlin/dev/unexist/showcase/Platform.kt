package dev.unexist.showcase

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform