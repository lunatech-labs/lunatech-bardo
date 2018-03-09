package bardo

import ro.pippo.core.Pippo

fun main(args: Array<String>) {
    println("hello world?")
    val pippo = Pippo()

    pippo.GET("/") {
        routeContext -> routeContext.send("Hello World?!?!?!")
    }

    pippo.GET("/test") {
        routeContext -> routeContext.send("test")
    }

    pippo.start()
}
