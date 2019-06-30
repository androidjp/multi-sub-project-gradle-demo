package greeter

import spock.lang.Specification

class GreetingFormatterSpec extends Specification {
    def 'creating a greeting'() {
        expect: 'The greeter to be correctly capitalized'
        GreetingFormatter.greeting('mike') == 'hello, Mike'
    }
}
