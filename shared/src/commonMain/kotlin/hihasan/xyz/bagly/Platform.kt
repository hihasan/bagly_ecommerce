package hihasan.xyz.bagly

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform