import nebula.test.IntegrationSpec
import nebula.test.functional.ExecutionResult
import org.dalyonushkin.gradle.PluginClass

/**
 * Created by dalyonushkin on 13.06.16.
 */
class SomeFunctionalSpec extends IntegrationSpec {
    def setup() {
        println(getProjectDir())
        buildFile <<""""""
        buildFile << applyPlugin(PluginClass.class)


    }


    def "Some functional test"() {
       expect:
       true

    }

    }