package infra.module

import com.google.inject.AbstractModule
import com.google.inject.Provides
import com.rabbitmq.client.Connection
import com.rabbitmq.client.ConnectionFactory

/**
 * RabbitMQ connection factory module
 * @author Claudio E. de Oliveira<claudioed.oliveira@gmail.com>
 *
 */
class RabbitModule : AbstractModule() {

    override fun configure() {}

    @Provides
    fun connection(): Connection {
        val connectionFactory = ConnectionFactory()
        connectionFactory.username = "guest"
        connectionFactory.password = "guest"
        connectionFactory.host = "localhost"
        connectionFactory.port = 5672
        return connectionFactory.newConnection()
    }

}