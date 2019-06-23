package sample

import kotlin.properties.Delegates
import kotlin.test.Test

abstract class BaseSampleTests {
    @Test
    fun testMe() {
        val a by Delegates.notNull<Int>()
    }
}
