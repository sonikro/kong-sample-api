package kong.sample.api

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("kong.sample.api")
                .mainClass(Application.javaClass)
                .start()
    }
}