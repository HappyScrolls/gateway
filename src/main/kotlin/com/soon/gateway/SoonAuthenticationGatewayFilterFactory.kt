import org.springframework.cloud.gateway.filter.GatewayFilter
import org.springframework.cloud.gateway.filter.GatewayFilterChain
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory
import org.springframework.stereotype.Component
import org.springframework.web.server.ServerWebExchange

@Component("SoonAuthentication")
class SoonAuthenticationGatewayFilterFactory : AbstractGatewayFilterFactory<Any>() {
    override fun apply(config: Any?): GatewayFilter {
        println("SoonAuthentication filter is executed")
        return GatewayFilter { exchange, chain ->
            chain.filter(exchange)
        }
    }

    class Config {
        // Configuration class content
    }
}
