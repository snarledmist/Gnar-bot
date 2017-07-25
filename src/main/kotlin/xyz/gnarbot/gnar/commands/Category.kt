package xyz.gnarbot.gnar.commands

enum class Category(val title: String, val show: Boolean = true) {
    CONFIGURATION("Configuration"),
    MUSIC("Music"),
    GAMES("Games"),
    FUN("Shitpost"),
    MEDIA("Media"),
    GENERAL("General"),
    NONE("", show = false),
}