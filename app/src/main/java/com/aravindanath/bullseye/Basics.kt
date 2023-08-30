package com.aravindanath.bullseye




    fun main() {
        val s = "Kotlin"

        val chars = CharArray(s.length)
        for (i in s.indices) {
            chars[i] = s[i]
        }

        print(chars.contentToString())


  
    }
