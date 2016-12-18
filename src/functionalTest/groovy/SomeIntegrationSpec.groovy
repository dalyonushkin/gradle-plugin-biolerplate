import nebula.test.IntegrationSpec
import nebula.test.ProjectSpec
import nebula.test.functional.ExecutionResult
import org.dalyonushkin.gradle.PluginClass
/**
 * Created by dalyonushkin on 13.06.16.
 */
class SomeIntegrationSpec extends ProjectSpec {
    def setup() {
        project.plugins.apply(PluginClass.class)


    }

    def 'has Project'() {
        expect:
        project != null
    }

    def 'can evaluate'() {
        when:
        project.evaluate()

        then:
        noExceptionThrown()
    }
    def "Some integration test"() {
        expect:
        true

    }


}